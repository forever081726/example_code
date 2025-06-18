package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.Ordera;
import com.neusoft.ruigou.service.IOrderService;



@RestController
@RequestMapping("/ordera")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@RequestMapping("/listAllGoods")
	public List<Ordera> listAllGoods(){
		return orderService.listAllGoods();
	} 
}
