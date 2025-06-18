package com.homework.ruigou.Service.DisplayImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.ruigou.Mapper.DisplayMapper;
import com.homework.ruigou.Service.DisplayService;
import com.homework.ruigou.po.Address;
import com.homework.ruigou.po.Cart;
import com.homework.ruigou.po.Goods;
import com.homework.ruigou.po.Merchant;
import com.homework.ruigou.po.OrderDetails;
import com.homework.ruigou.po.UOrder;
import com.homework.ruigou.po.User;
@Service
public class ServiceImpl implements DisplayService {
	@Autowired
	private DisplayMapper displaymapper;
	private UOrder add;
    @Override
	public List<Goods> appearGoodsSimpleMessage(String goodsClass)
	{
    	return displaymapper.appearGoodsSimpleMessage(goodsClass);
	}
    @Override
	public List<Goods> appearGoodsDetailsMessage(int goodsId)
	{
    	return displaymapper.appearGoodsDetailsMessage(goodsId);
    	
	}
    @Override
    public List<Merchant> getMerchantDetailsMessage(int merchantId)
	{
    	return displaymapper.getMerchantDetailsMessage(merchantId);
	}
    @Override
	public List<Cart> getCartMessage(int userId)
	{
    	return displaymapper.getCartMessage(userId);
	}
    @Override
	public List<Goods> appearGoodsSimpleMessage2(String goodsName)
	{
    	return displaymapper.appearGoodsSimpleMessage2(goodsName);
	}
    @Override
	public List<User> appearUserMessage(int userId)
	{
    	return displaymapper.appearUserMessage(userId);
	}
    @Override
	public List<UOrder> appearorderMessage(int userId)
	{
    	return displaymapper.appearorderMessage(userId);
	}
    @Override
    public List<Address> appearAddressMessage(int userId)
    {
    	return displaymapper.appearAddressMessage(userId);
    }
    @Override
    public List<Address> appearAddressMessage1(int userId,int status)
    {
    	return displaymapper.appearAddressMessage1(userId,status);
    }
    @Override
    public List<OrderDetails> appearOrderDetailsMessage(int orderId)
    {
    	return displaymapper.appearOrderDetailsMessage(orderId);
    }
    
    @Override
	public List<UOrder> appearorderMessage2(int userId,String status)
	{
    	return displaymapper.appearorderMessage2(userId,status);
	}
    
    @Override
	public List<UOrder> appearorderMessage3(int orderId)
	{
    	return displaymapper.appearorderMessage3(orderId);
	}
    
    @Override
	public int appearorderMessage4(int userId,String status)
	{
        return displaymapper.appearorderMessage2(userId, status).size();

	}
    
}
