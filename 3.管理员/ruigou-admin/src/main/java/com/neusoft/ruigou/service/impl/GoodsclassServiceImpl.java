package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.GoodsclassMapper;
import com.neusoft.ruigou.po.Goodsclass;
import com.neusoft.ruigou.service.IGoodsclassService;

@Service
public class GoodsclassServiceImpl implements IGoodsclassService{
	
	@Autowired
	private GoodsclassMapper goodsclassMapper;

	@Override
	public List<Goodsclass> listAllGoods(){
	   return  goodsclassMapper.listAllGoods();
    }
	@Override
	public List<Goodsclass> searchGoodsclass(String goodsClass,Integer classId){
	   return  goodsclassMapper.searchGoodsclass(goodsClass,classId);
	}
	@Override
	public Integer insertGoodsclass(String goodsClass,Integer classId )
		{
	    	return goodsclassMapper.insertGoodsclass( goodsClass,classId);
		}
	@Override
	public Integer deleteGoodsclass(Integer classId){
	   return  goodsclassMapper.deleteGoodsclass(classId);
	}
	
	  @Override
		public Integer updateGoodsclass(Goodsclass goodsclass)
		{
	    	return goodsclassMapper.updateGoodsclass(goodsclass.getClassId(),goodsclass.getGoodsClass());
		}
}
