package com.neusoft.ruigoubusiness.service;

import com.neusoft.ruigoubusiness.po.Goods;
import com.neusoft.ruigoubusiness.po.Merchant;

public interface UpdateService {
	public int updatemerchantmessage(Merchant merchant);
	public int updategoodsmessage(Goods goods);
}
