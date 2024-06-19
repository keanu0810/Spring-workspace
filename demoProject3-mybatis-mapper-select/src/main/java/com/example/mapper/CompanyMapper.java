package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Company;


@Mapper
public interface CompanyMapper {
	List<Company> getallCompany();
}
