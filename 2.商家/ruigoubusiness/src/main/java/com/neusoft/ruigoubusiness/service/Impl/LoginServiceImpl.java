package com.neusoft.ruigoubusiness.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigoubusiness.mapper.LoginMapper;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper loginmapper;
    @Override
	public List<Merchant> judgeMerchantId(int merchantId,String merchantPwd)
	{
         return loginmapper.judgeMerchantId(merchantId,merchantPwd);
	}
}
