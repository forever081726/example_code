

package com.homework.ruigou.Service.DisplayImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.ruigou.Mapper.LoginMapper;
import com.homework.ruigou.Service.LoginService;
import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.User;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginmapper;
    @Override
	public List<User> judgeUserId(int userId)
	{
         return loginmapper.judgeUserId(userId);
	}
    
    @Override
	public int resetPwd(int userId,String userPwd)
	{
         return loginmapper.resetPwd(userId, userPwd);
	}

}
