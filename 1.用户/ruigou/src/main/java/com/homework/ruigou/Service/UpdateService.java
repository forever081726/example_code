package com.homework.ruigou.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;

public interface UpdateService {
	public int inserUser(int userId,String userPwd);
	public int updateusermessage(User user);
	public int correctaddressmessage(int adressId);
	public int inserAddress(Address address);
	public int deleteaddressmessage(int adressId);
	public int insercartmessage(Cart cart);
	public int insertorder(UOrder uorder);
	public int insertorder1(UOrder uorder);
	public int insertorderdetails(OrderDetails orderdetails);
	public int deleteOrderDetails(int orderId);
	public int deleteOrder(int orderId);
	public int correctOrderStatus(int orderId);
	public int correctOrderStatus1(int orderId);
	public int changePwd(int userId,String userPwd);
	public int deleteCart(int cartId);
}
