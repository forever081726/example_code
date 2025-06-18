package com.neusoft.ruigoubusiness.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.mapper.DisplayMapper;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.po.OrderDetails;
import com.neusoft.ruigoubusiness.service.DisplayService;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    private DisplayMapper displaymapper;
    @Override
    public List<Merchant> appearMerchantMessage(int merchantId)
	{
    	return displaymapper.appearMerchantMessage(merchantId);
	}
    @Override
	public List<Goods> appearGoodsDetailsMessage(int merchantId)
	{
    	return displaymapper.appearGoodsDetailsMessage(merchantId);
    	
	}
    @Override
	public List<Goods> appearGoodsDetailsMessageStatus(int merchantId,@Param("goodsStatus")String goodsStatus)
	{
    	return displaymapper.appearGoodsDetailsMessageStatus(merchantId,goodsStatus);
    	
	}
    @Override
    public List<OrderDetails> appearOrderDetailsMessage(int merchantId)
    {
    	return displaymapper.appearOrderDetailsMessage(merchantId);
    }
}
