package com.neusoft.ruigoubusiness.service;

import java.util.List;

import com.neusoft.ruigoubusiness.po.Merchant;

public interface LoginService {
	public List <Merchant> judgeMerchantId(int MerchantId,String merchantPwd);
}
