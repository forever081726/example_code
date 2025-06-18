package com.homework.ruigou.Service.DisplayImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.ruigou.Mapper.DisplayMapper;
import com.homework.ruigou.Mapper.UpdateMapper;
import com.homework.ruigou.Service.UpdateService;
import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;
@Service
public class UpdateServiceImpl implements UpdateService{
	
	@Autowired
	private UpdateMapper updatemapper;
	@Autowired
	private DisplayMapper displaymapper;
	private List<OrderDetails> add3;
	private List<UOrder> add2;
	private List<Cart> add1;
	private List<Address> add;
    @Override
	public int inserUser(int userId,String userPwd)
		{
	    	return updatemapper.inserUser(userId, userPwd);
		}
    @Override
	public int updateusermessage(User user)
	{
    	return updatemapper.updateusermessage(user.getUserId(),user.getUserSex(),user.getUserName(),user.getUserBirthday(),user.getUserSignature(),user.getUserIntroduce());
	}
    @Override
	public int correctaddressmessage(int adressId)
	{
    	return updatemapper.correctaddressmessage(adressId);
	}
    @Override
	public int inserAddress(Address address) {
    
    	int n=0;
    	int m=0;
    	add=displaymapper.appearAddressMessage(address.getUserId());
    	for(int i=0;i<add.size();i++)
    	{
    		m=add.get(i).getAdressId();
    		if(m>n) {n=m;}
    	}
        address.setAdressId(n+1);
    	return updatemapper.inserAddress(address);

    }
    @Override
	public int deleteaddressmessage(int adressId)
	{
    	return updatemapper.deleteaddressmessage(adressId);
	}
    @Override
	public int insercartmessage(Cart cart)
	{
    	int n=0;
    	int m=0;
    	add1=displaymapper.getCartMessage(cart.getUserId());
    	for(int i=0;i<add1.size();i++)
    	{
    		m=add1.get(i).getCartId();
    		if(m>n) {n=m;}
    	}
    	cart.setCartId(n+1);
    	return updatemapper.insercartmessage(cart);
	}
    @Override
	public int insertorder(UOrder uorder)
	{
    	int n=0;
    	int m=0;
    	add2=displaymapper.appearorderMessage1();
    	for(int i=0;i<add2.size();i++)
    	{
    		m=add2.get(i).getOrderId();
    		if(m>n) {n=m;}
    	}
    	uorder.setOrderId(n+1);
    	updatemapper.insertorder(uorder);
    	return n+1;
	}
    @Override
	public int insertorder1(UOrder uorder)
	{
    	int n=0;
    	int m=0;
    	add2=displaymapper.appearorderMessage1();
    	for(int i=0;i<add2.size();i++)
    	{
    		m=add2.get(i).getOrderId();
    		if(m>n) {n=m;}
    	}
    	uorder.setOrderId(n+1);
    	updatemapper.insertorder1(uorder);
    	return n+1;
	}
    @Override
	public int insertorderdetails(OrderDetails orderdetails)
	{
    	int n=0;
    	int m=0;
    	add3=displaymapper.appearOrderDetailsMessage1();
    	for(int i=0;i<add3.size();i++)
    	{
    		m=add3.get(i).getOrderDetailsId();
    		if(m>n) {n=m;}
    	}
    	orderdetails.setOrderDetailsId(n+1);
    	updatemapper.insertorderdetails(orderdetails);
    	return n+1;
	}
    @Override
	public int deleteOrderDetails(int orderId)
	{return updatemapper.deleteOrderDetails(orderId);}
    @Override
	public int deleteOrder(int orderId)
	{return updatemapper.deleteOrder(orderId);}
    @Override
	public int correctOrderStatus(int orderId)
	{return updatemapper.correctOrderStatus(orderId);}
    @Override
 	public int correctOrderStatus1(int orderId)
 	{return updatemapper.correctOrderStatus1(orderId);}
    
    @Override
	public int changePwd(int userId,String userPwd)
 	{return updatemapper.changePwd(userId, userPwd);}
    
    
    @Override
	public int deleteCart(int cartId)
 	{return updatemapper.deleteCart(cartId);}
    
}
