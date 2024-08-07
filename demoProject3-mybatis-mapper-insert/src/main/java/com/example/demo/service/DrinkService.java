package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Drink;
import com.example.demo.mapper.DrinkMapper;

@Service
public class DrinkService {
	@Autowired // Context xml 파일로 한땀한땀 Mapper 위치랑 Service 위치를 설정하는 xml파일을 만들어줘야함
	private DrinkMapper drinkMapper;

	public void insertDrink(Drink drink) {
		drinkMapper.insertDrink(drink);
	}
}
