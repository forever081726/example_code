package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigou.po.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	public List<User> listAllGoods();
	@Select("select * from user WHERE userName LIKE '%${userName}%' AND userId LIKE  '%${userId}%'")
	public List<User> searchUser(String userName, Integer userId);
	@Delete("delete from user where userId=#{userId}")
	public int deleteUser(Integer userId);

}
