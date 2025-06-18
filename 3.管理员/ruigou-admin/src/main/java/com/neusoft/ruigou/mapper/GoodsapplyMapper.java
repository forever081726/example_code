package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigou.po.Goodsapply;

@Mapper
public interface GoodsapplyMapper {
	@Select("select * from goodsapply where goodsStatus=#{goodsStatus} ")
	public List<Goodsapply> listGoodsapplyByGoodsId(String goodsStatus);
	
}


