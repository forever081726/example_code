package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.GoodsMapper;
import com.neusoft.ruigou.po.Goods;
import com.neusoft.ruigou.service.IGoodsService;

@Service
public class GoodsServiceImpl implements IGoodsService{
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> listAllGoods(){
	   return  goodsMapper.listAllGoods();
    }
	@Override
	public List<Goods> searchGoods(String goodsClass,String goodsName,Integer goodsId){
	   return  goodsMapper.searchGoods(goodsClass,goodsName,goodsId);
	}
}
