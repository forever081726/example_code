package com.neusoft.ruigou.service;

import java.util.List;

import com.neusoft.ruigou.po.Goods;



public interface IGoodsService {

	public List<Goods> listAllGoods();
	public List<Goods> searchGoods(String goodsClass,String goodsName,Integer goodsId);
}
