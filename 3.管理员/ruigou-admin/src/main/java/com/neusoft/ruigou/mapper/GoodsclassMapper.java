package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.ruigou.po.Goodsclass;




@Mapper
public interface GoodsclassMapper {
	@Select("select * from class  ")
	public List< Goodsclass> listAllGoods();
	@Select("select * from class WHERE goodsClass LIKE '%${goodsClass}%' AND classId LIKE  '%${classId}%'")
	public List< Goodsclass> searchGoodsclass(String goodsClass, Integer classId);
	@Insert("insert into class(classId,goodsClass) values(#{classId},#{goodsClass})" )
	public Integer insertGoodsclass(String goodsClass,Integer classId);
    
	@Delete("delete from class where classId=#{classId}")
	public int deleteGoodsclass(Integer classId);
	
	@Update("update class set goodsClass=#{sClass}  where classId=#{Id}")
	public Integer updateGoodsclass(Integer Id,String sClass);
}


