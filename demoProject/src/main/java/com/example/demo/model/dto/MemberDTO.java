package com.example.demo.model.dto;

/*
 * Getter와 Setter 는 Lombok 라이브러리 활용해서
 * 길게 작성하지 않음
 * 기본생성자
 * */
//@Getter
//@Setter
public class MemberDTO {
		//나중에 db랑 연결할 모델들 작성
	private String memberId;
	private String memberpw;
	private String memberName;
	private int memberAge;
	
//메서드
	//Getter -> iombok @Getter 자동완성 시용하기
	//Setter -> iombok @Setter 자동완성 시용하기
	//기본생성자 -> iombok @NoArgsConstructor 자동완성 시용하기
	//필수생성자 -> iombok @AllArgsConstructor 자동완성 시용하기
	//toString -> iombok @ToString 자동완성 시용하기
}
