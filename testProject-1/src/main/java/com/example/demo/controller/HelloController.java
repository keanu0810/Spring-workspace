package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //요청 // 응답을 제어할 컨트롤러 역할 명시
				// bean 으로 등록 ( = 객체로 생성해서 스프링이 관리)
public class HelloController {

	//}
	
	@RequestMapping("/test")//test 요청시 처리할 메서드 매핑
	public String testMethod() {
		System.out.println("text 요청받았는지확인");
		return "text";
	}
}