package com.example.demo.model.dto;

import lombok.*;

//toString getter setter noArgs AllArgs
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CafeDTO {

	private String cafeCommentName;
	private String cafeCommentOpinion;
}
