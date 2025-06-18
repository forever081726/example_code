package com.neusoft.ruigoubusiness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neusoft.ruigoubusiness.service.LoginService;

import com.neusoft.ruigoubusiness.po.Merchant;

@RestController
@RequestMapping("/function2")
public class LoginController {
	@Autowired
	private LoginService loginservice;
    @RequestMapping("/login")
    public List<Merchant>  judgeMerchantId(@RequestBody Merchant merchant)
    {return loginservice.judgeMerchantId(merchant.getMerchantId(),merchant.getMerchantPwd());}
}