package com.neusoft.ruigoubusiness.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.neusoft.ruigoubusiness.po.Merchant;
@Mapper
public interface LoginMapper {
	@Select("select * from merchant where merchantId=#{merchantId} and merchantPwd=#{merchantPwd}" )
	public List<Merchant> judgeMerchantId(int merchantId,String merchantPwd);

}