package com.neusoft.ruigoubusiness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigoubusiness.po.UOrder;
import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.po.OrderDetails;
import com.neusoft.ruigoubusiness.service.DisplayService;
@RestController
@RequestMapping("/function")
public class DisplayController {
	@Autowired
	private DisplayService displayservice;
	
    @RequestMapping("/merchantmessage")
    public List<Merchant> appearMerchantMessage(@RequestBody Merchant merchant){
    	return displayservice.appearMerchantMessage(merchant.getMerchantId());
	}
    @RequestMapping("/detailsmessage")
	public List<Goods> appearGoodsDetailsMessage(@RequestBody Goods goods){
    	return displayservice.appearGoodsDetailsMessage(goods.getMerchantId());
    }
    @RequestMapping("/detailsmessagestatus")
	public List<Goods> appearGoodsDetailsMessageStatus(@RequestBody Goods goods){
    	return displayservice.appearGoodsDetailsMessageStatus(goods.getMerchantId(),goods.getGoodsStatus());
    }
    @RequestMapping("/orderdetailsmessage")
	public List<OrderDetails> appearOrderDetailsMessage(@RequestBody OrderDetails orderDetails){
    	return displayservice.appearOrderDetailsMessage(orderDetails.getMerchantId());
    }
}