package com.neusoft.ruigou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ruigou.po.Merchant;
import com.neusoft.ruigou.service.IMerchantService;


@RestController
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	private IMerchantService merchantService;
	
	@RequestMapping("/listAllGoods")
	public List<Merchant> listAllGoods(){
		return merchantService.listAllGoods();
	} 
	
	@RequestMapping("/search")
	public List<Merchant> searchMerchant(@RequestBody Merchant merchant){
		return merchantService.searchMerchant(merchant.getMerchantName(),merchant.getMerchantId());
	} 
	@DeleteMapping("/delete/{merchantId}")
	public ResponseEntity<Void> deleteMerchant(@PathVariable Integer merchantId) {
	merchantService.deleteMerchant(merchantId); 
	return ResponseEntity.noContent().build(); 
	}
}
