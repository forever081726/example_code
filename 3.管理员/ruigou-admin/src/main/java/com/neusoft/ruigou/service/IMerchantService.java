package com.neusoft.ruigou.service;

import java.util.List;

import com.neusoft.ruigou.po.Merchant;






public interface IMerchantService {

	public List<Merchant> listAllGoods();
	public List<Merchant> searchMerchant(String merchantName,Integer merchantId);
	public int deleteMerchant(Integer merchantId);
}
