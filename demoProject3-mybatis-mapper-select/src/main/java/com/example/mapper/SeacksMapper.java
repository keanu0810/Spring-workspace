package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Seacks;

/*
 * Spring 자체에서 이 Mapper 인터페이스는
 * SQL DB에 작성한 코드를 바라보는 위치이다.
 * 라는 @Mapper 어노테이션을 작성해주고
 * 이 매퍼는 sql구문을 바라본다라는 의미가 들어가져 있는 것
 * */
@Mapper
public interface SeacksMapper {
	// DB에서 모든 과자들을
	List<Seacks> getAllSnacks();

}
