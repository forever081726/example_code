package com.homework.ruigou.Service;

import java.util.List;

import com.homework.ruigou.po.User;

public interface LoginService {
	public List <User> judgeUserId(int userId);
	public int resetPwd(int userId,String userPwd);
}
