package com.neusoft.ruigoubusiness.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UpdateMapper {
	@Update("update merchant set merchantName=#{merchantName},merchantAddress=#{merchantAddress} where merchantId=#{merchantId}")
	public int updatemerchantmessage(int merchantId,String merchantName ,String merchantAddress);

	@Update("update goods set goodsClass=#{goodsClass},goodsName=#{goodsName},goodsPrice=#{goodsPrice},goodsStore=#{goodsStore},goodsImg=#{goodsImg},goodsDetails=#{goodsDetails} where merchantId=#{Id}")
	public int updategoodsmessage(String goodsClass,String goodsName,int goodsPrice,int goodsStore,String goodsImg, String goodsDetails,int merchantId);
}
