package com.homework.ruigou.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.Goods;
import com.homework.ruigou.po.Merchant;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;
@Mapper
public interface DisplayMapper {
	@Select("select * from goods where goodsClass=#{goodsClass}")
	public List<Goods> appearGoodsSimpleMessage(String goodsClass);
	@Select("select * from goods where goodsId=#{goodsId}" )
	public List<Goods> appearGoodsDetailsMessage(int goodsId);
	@Select("select * from merchant where merchantId=#{merchantId}" )
	public List<Merchant> getMerchantDetailsMessage(int merchantId);
	@Select("select * from cart where userId=#{userId}" )
	public List<Cart> getCartMessage(int userId);
	@Select("select * from goods where goodsName like '%${goodsName}%'" )
	public List<Goods> appearGoodsSimpleMessage2(String goodsName);
	@Select("select * from user where userId=#{userId}" )
	public List<User> appearUserMessage(int userId);
	@Select("select * from uorder where userId=#{userId}" )
	public List<UOrder> appearorderMessage(int userId);
	
	@Select("select * from uorder where userId=#{userId} and status=#{status}" )
	public List<UOrder> appearorderMessage2(int userId,String status);
	
	@Select("select * from uorder" )
	public List<UOrder> appearorderMessage1();
	
	@Select("select * from uorder where orderId=#{orderId}" )
	public List<UOrder> appearorderMessage3(int orderId);
	
	@Select("select * from address where userId=#{userId}" )
	public List<Address> appearAddressMessage(int userId);
	@Select("select * from address where userId=#{userId} and status=#{status}" )
	public List<Address> appearAddressMessage1(int userId ,int status);
	
	@Select("select * from orderdetails where orderId=#{orderId}" )
	public List<OrderDetails> appearOrderDetailsMessage(int orderId);
	
	@Select("select * from orderdetails" )
	public List<OrderDetails> appearOrderDetailsMessage1();
}
