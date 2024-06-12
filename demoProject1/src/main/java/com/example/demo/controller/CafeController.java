package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.CafeDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("cafe")
@Slf4j
public class CafeController {
/*
	@PostMapping("cafe-index")
	public String cafeMainComment(@RequestParam("cafeCommentName")String cafeCommentName,
						@RequestParam("cafeCommentOpinion")String cafeCommentOpinion) {
		log.info("cafe index 메인으로 이동");
		
		log.debug("cafeCommentName : " + cafeCommentName);
		log.debug("cafeCommentOpinion : " + cafeCommentOpinion);
		
		return "redirect:/cafe/cafe-index";
	}
	*/
	
	public String cafeIndexComment(CafeDTO cafeDTO) {
		
		CafeDTO cd = new CafeDTO();
		cd.getCafeCommentName();
		cd.getCafeCommentOpinion();
		
		cd.setCafeCommentName("넣어줄값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		cd.setCafeCommentOpinion("넣어줄값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		return "";
	}
}
