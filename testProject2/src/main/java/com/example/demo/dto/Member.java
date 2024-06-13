package com.example.demo.dto;

import lombok.*;

//lombok으로 시작하는 어노테이션 기초 필수 게터세터 toString
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private String memberName;
	private String memberPhone;
	private int memberAge;
}
