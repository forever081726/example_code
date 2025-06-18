package com.neusoft.ruigoubusiness.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigoubusiness.mapper.UpdateMapper;
import com.neusoft.ruigoubusiness.service.UpdateService;
import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;


@Service
public class UpdateServiceImpl implements UpdateService {
	@Autowired
	private UpdateMapper updatemapper;
	@Override
    public int updatemerchantmessage(Merchant merchant)
	{
    	return updatemapper.updatemerchantmessage(merchant.getMerchantId(),merchant.getMerchantName(),merchant.getMerchantAddress());
	}
	@Override
    public int updategoodsmessage(Goods goods)
	{
    	return updatemapper.updategoodsmessage(goods.getGoodsClass(),goods.getGoodsName(),goods.getGoodsPrice(),goods.getGoodsStore(),goods.getGoodsImg(),goods.getGoodsDetails(),goods.getMerchantId());
	}
}
