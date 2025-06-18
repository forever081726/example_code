package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.OrderMapper;
import com.neusoft.ruigou.po.Ordera;
import com.neusoft.ruigou.service.IOrderService;


@Service 
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Ordera> listAllGoods(){
	   return  orderMapper.listAllGoods();
    }
}
