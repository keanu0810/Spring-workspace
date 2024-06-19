package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.Khmember;
import com.example.mapper.KhmemberMapper;

@Service
public class KhmemberService {
	
	private KhmemberMapper khmemberMapper;
	
	public List<Khmember> getAllKhmember(){
		return khmemberMapper.getALLsKhmember
	}

}
