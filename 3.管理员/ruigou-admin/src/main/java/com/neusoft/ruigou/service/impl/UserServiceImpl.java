package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.UserMapper;
import com.neusoft.ruigou.po.User;
import com.neusoft.ruigou.service.IUserService;


@Service 
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> listAllGoods(){
	   return  userMapper.listAllGoods();
    }
	@Override
	public List<User> searchUser(String userName,Integer userId){
	   return  userMapper.searchUser(userName,userId);
	}
	@Override
	public int deleteUser(Integer userId){
	   return  userMapper.deleteUser(userId);
	}
}
