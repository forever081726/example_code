package com.neusoft.ruigou.service;

import java.util.List;

import com.neusoft.ruigou.po.Goodsapply;



public interface IGoodsapplyService {

	public List<Goodsapply> listGoodsapplyByGoodsId(String goodsStatus);
	void updateGoodsapplyStatus(Integer goodsApplyId, String status);
}
