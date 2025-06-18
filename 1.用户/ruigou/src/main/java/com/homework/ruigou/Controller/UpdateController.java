package com.homework.ruigou.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.homework.ruigou.Service.UpdateService;
import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;

@RestController
@RequestMapping("/function3")
public class UpdateController {
	@Autowired
	private UpdateService updateservice;
    @RequestMapping("/insertuser")
	public int insertUser(@RequestBody User user)
    {return updateservice.inserUser(user.getUserId(), user.getUserPwd());}
    @RequestMapping("/updateusermessage")
	public int updateusermessage(@RequestBody User user) {
    	return updateservice.updateusermessage(user);
    }
    @RequestMapping("/correctaddressmessage")
	public int correctaddressmessage(@RequestBody Address address) {
    	return updateservice.correctaddressmessage(address.getAdressId());
    }
    @RequestMapping("/insertaddressmessage")
    public int inserAddress(@RequestBody Address address)
    {
    	return updateservice.inserAddress(address);
    }
    @RequestMapping("/deleteaddressmessage")
    public int deleteaddressmessage(@RequestBody Address address)
    {
    	return updateservice.deleteaddressmessage(address.getAdressId());
    }
    @RequestMapping("/insercartmessage")
    public int insercartmessage(@RequestBody Cart cart)
    {
    	return updateservice.insercartmessage(cart);
    }
    
    
    
    @RequestMapping("/deleteCart")
    public int deleteCart(@RequestBody Cart cart)
    {
    	return updateservice.deleteCart(cart.getCartId());
    }
    
    @RequestMapping("/insertorder")
    public int insertorder(@RequestBody UOrder uorder)
    {
    	return updateservice.insertorder(uorder);
    }
    @RequestMapping("/insertorder1")
    public int insertorder1(@RequestBody UOrder uorder)
    {
    	return updateservice.insertorder1(uorder);
    }
    @RequestMapping("/insertorderdetails")
    public int insertorderdetails(@RequestBody OrderDetails orderdetails)
    {
    	return updateservice.insertorderdetails(orderdetails);
    }
    
    
    @RequestMapping("/deleteOrderDetails")
    public int deleteOrderDetails(@RequestBody OrderDetails orderdetails)
    {
    	return updateservice.deleteOrderDetails(orderdetails.getOrderId());
    }
    
    
    @RequestMapping("/deleteOrder")
    public int deleteOrder(@RequestBody UOrder uorder)
    {
    	return updateservice.deleteOrder(uorder.getOrderId());
    }
    
    @RequestMapping("/correctOrderStatus")
    public int correctOrderStatus(@RequestBody UOrder uorder)
    {
    	return updateservice.correctOrderStatus(uorder.getOrderId());
    }
    @RequestMapping("/correctOrderStatus1")
    public int correctOrderStatus1(@RequestBody UOrder uorder)
    {
    	return updateservice.correctOrderStatus1(uorder.getOrderId());
    }
    @RequestMapping("/changePwd")
    public int changePwd(@RequestBody User user)
    {
    	return updateservice.changePwd(user.getUserId(), user.getUserPwd());
    }
    
}
