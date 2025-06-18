package com.neusoft.ruigou.service;

import java.util.List;

import com.neusoft.ruigou.po.Goodsclass;



public interface IGoodsclassService {

	public List<Goodsclass> listAllGoods();
	public List<Goodsclass> searchGoodsclass(String goodsClass,Integer classId);
	public Integer insertGoodsclass(String goodsClass,Integer classId);
	public Integer deleteGoodsclass(Integer classId);
	public Integer updateGoodsclass(Goodsclass goodsclass);
}
