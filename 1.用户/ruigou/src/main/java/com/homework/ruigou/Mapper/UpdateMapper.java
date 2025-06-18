package com.homework.ruigou.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;

@Mapper
public interface UpdateMapper {

	@Insert("insert into user(userId,userPwd) values(#{userId},#{userPwd})" )
	public int inserUser(int userId,String userPwd);
	@Update("update user set userName=#{Name},userSex=#{Sex},userBirthday=#{Birthday},userIntroduce=#{Introduce},userSignature=#{Signature}   where userId=#{Id}")
	public int updateusermessage(int Id,String Sex,String Name,String Birthday,String Signature,String Introduce);
	@Update("update address set status=1 where adressId=#{adressId}")
	public int correctaddressmessage(int adressId);

	@Insert("insert into address(userPhone,adressId,userRecipients,status,userAddress,userArea,userId) values(#{userPhone},#{adressId},#{userRecipients},#{status},#{userAddress},#{userArea},#{userId})" )
	public int inserAddress(Address address);
	
	@Delete("delete from address where adressId=#{adressId}")
	public int deleteaddressmessage(int adressId);
	@Insert("insert into cart(amount,goodsNum,goodsId,merchantId,userId,cartId,goodsPrice,goodssalenumber,goodsImg,goodsName,merchantName,service) values(#{amount},#{goodsNum},#{goodsId},#{merchantId},#{userId},#{cartId},#{goodsPrice},#{goodssalenumber},#{goodsImg},#{goodsName},#{merchantName},#{service})" )
	public int insercartmessage(Cart cart);
	@Insert("insert into uorder(userId,orderId,status,amount,orderTime,payTime) values(#{userId},#{orderId},#{status},#{amount},now(),now())" )
	public int insertorder(UOrder uorder);
	@Insert("insert into uorder(userId,orderId,status,amount,orderTime,payTime) values(#{userId},#{orderId},#{status},#{amount},now(),#{payTime})" )
	public int insertorder1(UOrder uorder);
	@Insert("insert into orderdetails(goodsName,goodsPrice,merchantName,goodsImg,goodsNum,goodsId,merchantId,orderId,orderDetailsId) values(#{goodsName},#{goodsPrice},#{merchantName},#{goodsImg},#{goodsNum},#{goodsId},#{merchantId},#{orderId},#{orderDetailsId})" )
	public int insertorderdetails(OrderDetails orderdetails);
	
	@Delete("delete from orderdetails where orderId=#{orderId}")
	public int deleteOrderDetails(int orderId);
	@Delete("delete from uorder where orderId=#{orderId}")
	public int deleteOrder(int orderId);
	
	
	@Update("update uorder set status= '待发货' , payTime=now() where orderId=#{orderId}")
	public int correctOrderStatus(int orderId);
	@Update("update uorder set status= '待评价'  where orderId=#{orderId}")
	public int correctOrderStatus1(int orderId);
	
	@Update("update user set userPwd=#{userPwd} where userId=#{userId}")
	public int changePwd(int userId,String userPwd);
	
	
	
	@Delete("delete from cart where cartId=#{cartId}")
	public int deleteCart(int cartId);
	
}
