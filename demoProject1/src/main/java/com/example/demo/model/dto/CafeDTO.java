package com.example.demo.model.dto;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CafeDTO {

	private String cafeCommentName;
	private String cafeCommentOpinion;
}
