package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.MerchantMapper;
import com.neusoft.ruigou.po.Merchant;
import com.neusoft.ruigou.service.IMerchantService;



@Service 
public class MerchantServiceImpl implements IMerchantService{
	
	@Autowired
	private MerchantMapper MerchantMapper;

	@Override
	public List<Merchant> listAllGoods(){
	   return  MerchantMapper.listAllGoods();
    }
	@Override
	public List<Merchant> searchMerchant(String merchantName,Integer MerchantId){
	   return  MerchantMapper.searchMerchant(merchantName,MerchantId);
	}
	@Override
	public int deleteMerchant(Integer MerchantId){
	   return  MerchantMapper.deleteMerchant(MerchantId);
	}
}
