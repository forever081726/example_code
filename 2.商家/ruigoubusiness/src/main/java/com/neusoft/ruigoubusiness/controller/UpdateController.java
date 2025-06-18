package com.neusoft.ruigoubusiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.service.UpdateService;


@RestController
@RequestMapping("/function3")
public class UpdateController {
	@Autowired
	private UpdateService updateservice;
    @RequestMapping("/updatemerchantmessage")
	public int updatemerchantmessage(@RequestBody Merchant merchant) {
    	return updateservice.updatemerchantmessage(merchant);
    }
    @RequestMapping("/updategoodsmessage")
	public int updategoodsmessage(@RequestBody Goods goods) {
    	return updateservice.updategoodsmessage(goods);
    }
}
