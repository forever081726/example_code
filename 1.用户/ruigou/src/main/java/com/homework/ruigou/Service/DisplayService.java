package com.homework.ruigou.Service;

import java.util.List;

import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.Goods;
import com.homework.ruigou.po.Merchant;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;

public interface DisplayService  {
	public List<Goods> appearGoodsSimpleMessage(String goodsClass);
	public List<Goods> appearGoodsDetailsMessage(int goodsId);
	public List<Merchant> getMerchantDetailsMessage(int merchantId);
	public List<Cart> getCartMessage(int userId);
	public List<Goods> appearGoodsSimpleMessage2(String goodsName);
	public List<User> appearUserMessage(int userId);
	public List<UOrder> appearorderMessage(int userId);
	public List<Address> appearAddressMessage(int userId);
	public List<Address> appearAddressMessage1(int userId,int status);
	public List<OrderDetails> appearOrderDetailsMessage(int orderId);
	
	public List<UOrder> appearorderMessage2(int userId,String status);
	
	public List<UOrder> appearorderMessage3(int orderId);
	public int appearorderMessage4(int userId,String status);
}
