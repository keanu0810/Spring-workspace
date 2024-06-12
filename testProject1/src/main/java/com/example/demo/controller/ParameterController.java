package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("param")// ParameterConstroller 밑에는 모두 자동으로 맨 앞에 param 붙음
@Slf4j
public class ParameterController {

	@GetMapping("main")
	public String paramMain() {
		return "param/param-main";
	}
	
	
	
	@PostMapping("test1")
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName");
		String inputAddress = req.getParameter("inputAddress");
		int inputAge = Integer.parseInt(req.getParameter("inputAge"));
		
		
		log.info("접속확인");
		log.info("이름확인 : " + inputName);
		log.info("나이확인 : " + inputAge);
		log.info("주소확인 : " + inputAddress);
		
		log.info("=========================");
		log.debug("로그로 이름확인 : " + inputName);
		log.debug("로그로 나이확인 : " + inputAge);
		log.debug("로그로 주소확인 : " + inputAddress);
		
		// --> String 에서 int 로 형변환
		return "redirect:/param/main"; // 작성 다 되면 메인으로 돌아가기
		
	}
}
