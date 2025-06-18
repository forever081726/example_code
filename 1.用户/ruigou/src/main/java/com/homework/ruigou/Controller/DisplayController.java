package com.homework.ruigou.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.ruigou.Service.DisplayService;
import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.Goods;
import com.homework.ruigou.po.Merchant;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;
@RestController
@RequestMapping("/function1")
public class DisplayController {
	@Autowired
	private DisplayService displayservice;
    @RequestMapping("/simplemessage")
    public List<Goods> appearGoodsSimpleMessage(@RequestBody Goods goods)
    {return displayservice.appearGoodsSimpleMessage(goods.getGoodsClass());}
    @RequestMapping("/detailsmessage")
	public List<Goods> appearGoodsDetailsMessage(@RequestBody Goods goods)
    {return displayservice.appearGoodsDetailsMessage(goods.getGoodsId());}
    @RequestMapping("/merchantmessage")
    public List<Merchant> getMerchantDetailsMessage(@RequestBody Merchant merchant)
	{
    	return displayservice.getMerchantDetailsMessage(merchant.getMerchantId());
	}
    @RequestMapping("/cartmessage")
	public List<Cart> getCartMessage(@RequestBody Cart cart)
	{
    	return displayservice.getCartMessage(cart.getUserId());
	}
    @RequestMapping("/simplemessage2")
    public List<Goods> appearGoodsSimpleMessage2(@RequestBody Goods goods)
    {return displayservice.appearGoodsSimpleMessage2(goods.getGoodsName());}
    @RequestMapping("/usermessage")
	public List<User> appearUserMessage(@RequestBody User user )
    {return displayservice.appearUserMessage(user.getUserId());}
    @RequestMapping("/ordermessage")
	public List<UOrder> appearorderMessage(@RequestBody UOrder order)
    {return displayservice.appearorderMessage(order.getUserId());}
    
    @RequestMapping("/ordermessage2")
	public List<UOrder> appearorderMessage2(@RequestBody UOrder order)
    {return displayservice.appearorderMessage2(order.getUserId(),order.getStatus());}
    
    @RequestMapping("/ordermessage3")
	public List<UOrder> appearorderMessage3(@RequestBody UOrder order)
    {return displayservice.appearorderMessage3(order.getOrderId());}
    
    @RequestMapping("/ordermessage4")
  	public int appearorderMessage4(@RequestBody UOrder order)
      {return displayservice.appearorderMessage4(order.getUserId(),order.getStatus());}
    
    @RequestMapping("/addressmessage")
    public List<Address> appearAddressMessage(@RequestBody Address address )
    {
    	return displayservice.appearAddressMessage(address.getUserId());
    }
    @RequestMapping("/addressmessage1")
    public List<Address> appearAddressMessage1(@RequestBody Address address )
    {
    	return displayservice.appearAddressMessage1(address.getUserId(),address.getStatus());
    }
    @RequestMapping("/appearorderDetailsMessage")
	public List<OrderDetails> appearorderDetailsMessage(@RequestBody OrderDetails orderdetails)
    {return displayservice.appearOrderDetailsMessage(orderdetails.getOrderId());
}
}
