package com.neusoft.ruigou.service;

import java.util.List;

import com.neusoft.ruigou.po.User;



public interface IUserService {

	public List<User> listAllGoods();
	public List<User> searchUser(String userName,Integer userId);
	public int deleteUser(Integer userId);
}
