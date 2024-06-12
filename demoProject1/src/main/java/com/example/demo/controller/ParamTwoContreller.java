package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//@어노테이션 controller RequestMapping Slf4j

@Controller
@Setter
@Getter
@Slf4j
public class ParamTwoContreller {

	@PostMapping("test2")
	//메서드 paramTwoTest
	public String paramTowTest(@RequestParam("snackNeme") String snackNeme,
			@RequestParam("snackNeme") String snackCompany,
			@RequestParam("snackNeme") int snackPrice,
			@RequestParam(value="snackLike", defaultValue="snackLike",required=false) String snackLike
			) {
		log.info(snackNeme);
		log.info(snackCompany);
		log.info("snackPrice"+snackPrice);
		log.info(snackLike);
	
		return "redurect:/param/main";
	}
	 
	//{ostMapping("주소값")
	
	//return / param/param-main
	
	//메서드 paramLikeSnackCompany
	@PostMapping("likeSnackCompany")
	public String paramLikeSnackCompany(@RequestParam(value="likeSnack", required=false) String[] li)
	@RequestParam(value="likecompany", required=false)
	
} {
	log.info("좋아하는 과자들 : " likeSnack);
	log.info("좋아하는 회사들 : " likeCompany);
	
	return "redurect:/param/main";
}
