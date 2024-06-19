package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Company;
import com.example.mapper.CompanyMapper;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyMapper companyMapper;
	
	// 회사 정보가 적혀있는 db 내용을 회사목록으로 controller에 전달해주기
	public List<Company> getallCompany(){
		return companyMapper.getallCompany();
	}

}