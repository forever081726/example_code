package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigou.po.Ordera;

@Mapper
public interface OrderMapper {
	@Select("select * from ordera")
	public List<Ordera> listAllGoods();
}


