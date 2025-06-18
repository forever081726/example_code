
package com.homework.ruigou.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.homework.ruigou.Service.LoginService;

import com.homework.ruigou.po.User;

@RestController
@RequestMapping("/function2")
public class LoginController {
	@Autowired
	private LoginService loginservice;
    @RequestMapping("/login")
    public List<User>  judgeUserId(@RequestBody User user)
    {return loginservice.judgeUserId(user.getUserId());}
    @RequestMapping("/resetPwd")
    public int  resetPwd(@RequestBody User user)
    {return loginservice.resetPwd(user.getUserId(), user.getUserPwd());}
    
}
