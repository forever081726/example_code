package com.neusoft.ruigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ruigou.mapper.GoodsapplyMapper;
import com.neusoft.ruigou.po.Goodsapply;
import com.neusoft.ruigou.service.IGoodsapplyService;





@Service
public class GoodsapplyServiceImpl implements IGoodsapplyService{
	
	@Autowired
	private GoodsapplyMapper goodsapplyMapper;

	@Override
	public List<Goodsapply> listGoodsapplyByGoodsId(String goodsStatus){
	   return  goodsapplyMapper.listGoodsapplyByGoodsId(goodsStatus);
    }
	@Override
    public void updateGoodsapplyStatus(Integer goodsApplyId, String status) {
        // 执行数据库更新操作
        // 例如：goodsapplyRepository.updateStatus(goodsApplyId, status);
    }
}
