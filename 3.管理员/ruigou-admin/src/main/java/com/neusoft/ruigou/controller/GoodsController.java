package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.Goods;
import com.neusoft.ruigou.service.IGoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private IGoodsService goodsService;
	
	@RequestMapping("/listAllGoods")
	public List<Goods> listAllGoods(){
		return goodsService.listAllGoods();
	} 
	@RequestMapping("/search")
	public List<Goods> searchGoods(@RequestBody Goods goods){
		return goodsService.searchGoods(goods.getGoodsClass(),goods.getGoodsName(),goods.getGoodsId());
	} 
}
