package com.homework.ruigou.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.homework.ruigou.po.User;
@Mapper
public interface LoginMapper {
	@Select("select * from user where userId=#{userId}" )
	public List<User> judgeUserId(int userId);
	
	@Update("update user set userPwd=#{userPwd} where userId=#{userId} " )
	public int resetPwd(int userId,String userPwd);

}
