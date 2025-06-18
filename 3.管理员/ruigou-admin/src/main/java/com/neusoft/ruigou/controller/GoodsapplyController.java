package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.Goodsapply;
import com.neusoft.ruigou.service.IGoodsapplyService;

@RestController
@RequestMapping("/goodsapply")
public class GoodsapplyController {

	@Autowired
	private IGoodsapplyService goodsapplyService;
	
	@RequestMapping("/listGoodsapplyByGoodsId")
	public List<Goodsapply> listGoodsapplyByGoodsId(@RequestBody Goodsapply goodsapply){
		return goodsapplyService.listGoodsapplyByGoodsId(goodsapply.getGoodsStatus());
	} 

    
}
