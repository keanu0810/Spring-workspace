package com.kh.test.service;

import org.springframework.stereotype.Service;

import com.kh.test.mapper.GoodsMapper;

@Service
public class GoodsService {

	private GoodsMapper goodsMapper;
	
	public boolean getGoods(String items_name) {
		Integer count = goodsMapper.getGoods(items_name);
		//null이 아니다 0 또는 1 이상 count 0보다 클 떄 반환
		return count !=null && count >0;
	}
}
