package com.neusoft.ruigoubusiness.service;

import java.util.List;

import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.po.OrderDetails;

public interface DisplayService {
	public List<Merchant> appearMerchantMessage(int merchantId);
	public List<Goods> appearGoodsDetailsMessage(int merchantId);
	public List<Goods> appearGoodsDetailsMessageStatus(int merchantId,String goodsStatus);
	public List<OrderDetails> appearOrderDetailsMessage(int merchantId);
	
}
