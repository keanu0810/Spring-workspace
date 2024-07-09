package com.kh.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class GoodsMapper {
	Integer getGoods(String items_name);
}
