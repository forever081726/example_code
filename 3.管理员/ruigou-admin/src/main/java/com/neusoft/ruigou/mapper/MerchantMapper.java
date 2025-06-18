package com.neusoft.ruigou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigou.po.Merchant;





@Mapper
public interface MerchantMapper {
	@Select("select * from merchant")
	public List<Merchant> listAllGoods();
	@Select("select * from merchant WHERE merchantName LIKE '%${merchantName}%' AND merchantId LIKE  '%${merchantId}%'")
	public List<Merchant> searchMerchant(String merchantName, Integer merchantId);
	@Delete("delete from merchant where merchantId=#{merchantId}")
	public int deleteMerchant(Integer merchantId);
}


