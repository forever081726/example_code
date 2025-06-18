package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigou.po.Goods;


@Mapper
public interface GoodsMapper {
	@Select("select * from goods  ")
	public List<Goods> listAllGoods();
	@Select("select * from goods WHERE goodsClass=#{goodsClass}  OR  goodsName= #{goodsName} OR goodsId =#{goodsId}")
	public List< Goods> searchGoods(String goodsClass, String goodsName,Integer goodsId);

}


