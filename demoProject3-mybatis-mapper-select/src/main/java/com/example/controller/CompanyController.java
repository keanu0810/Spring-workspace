package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dto.Company;
import com.example.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/companyList")
	public String getallCompany(Model model) {
		//회사목록 리스트를 companyList.html 전달
		List<Company> cList = companyService.getallCompany();
		model.addAttribute("companyList", cList);
		
		return "companyList";
	}
}
