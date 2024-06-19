package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.Seacks;
import com.example.service.SeacksService;


//Service 작성한 기능을 종합해서 db와 html을
// 연결해주는 연결고리
@Controller
public class SnacksController {
	@Autowired
	private SeacksService snackService;
	@GetMapping("/allSnack")
	public String getAllSnacks(Model model) {
		List<Seacks> snackList = snackService.getAllSnacks();
		//<te th:each "	 s :
		// "" 안에 snackList라는 변수명을 사용해서 전달하겠다. 라는 표시
		//Model 은 db에서 가져온 값을 전달해주는 전달 연결고기
		model.addAttribute("snackList",snackList);
		//스낵서비스에서 추가적인 서비스 기능으로 다듬어진 메서드 가져오기
		
		return "snackList";
		// return 
	}

}
