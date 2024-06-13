package com.example.demo.model.dto;

import lombok.*;

//@어노테이션 이용해서 constructor ,getter ,setter, toString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogDTO {
	private String commentName;
	private String commentOpinion;
	/*
		= @NoArgsConstructor 같기 때문에 하나는 주석으로 처리해주거나 없애줘여함
		public BlogDTO() {
			// TODO Auto-generated constructor stub
		}
	*/
	/*
	 = @AllArgsConstructor 아래 코드와 같은 의미를 담고 있기 때문에 둘 중 하나만 사용
	public BlogDTO(String commentName, String commentOpinion) {
		this.commentName = commentName;
		this.commentOpinion = commentOpinion;
	}
	*/
	
}
