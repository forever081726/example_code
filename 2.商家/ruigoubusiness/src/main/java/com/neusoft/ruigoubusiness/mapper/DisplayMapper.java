package com.neusoft.ruigoubusiness.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;
import com.neusoft.ruigoubusiness.po.OrderDetails;
@Mapper
public interface DisplayMapper {
	@Select("select * from merchant where merchantId=#{merchantId}")
	public List<Merchant>appearMerchantMessage(int merchantId);
	@Select("select * from goods where merchantId=#{merchantId}" )
	public List<Goods> appearGoodsDetailsMessage(int merchantId);
	@Select("select * from goods where goodsStatus=#{goodsStatus} and merchantId=#{merchantId}" )
	public List<Goods> appearGoodsDetailsMessageStatus(int merchantId,String goodsStatus);
	@Select("select * from orderDetails where merchantId=#{merchantId}")
	public List<OrderDetails> appearOrderDetailsMessage(int merchantId);
}
