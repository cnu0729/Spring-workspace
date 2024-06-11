package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Bean : 스프링이 만들고 관리하는 표시
@Controller // -> 요청 / 응답을 받는 표시 스프링에서 Controller 로 작성하라 명시되어있음
public class IndexController {
	@GetMapping("cafe/cafe-index") //주소창에서 back 과 front 만나는 주소(만남의 장소 위치)
	public String cafeMainMethod() {
		return "cafe/cafe-index"; // html 파일 위치
	}
	
	//blog-index 로 이동하는 GetMapping 만들기
	@GetMapping("blog/blog-index")
	public String blogMainMethod() {
		return "blog/blog-index";
	}
	@GetMapping("blog/blog-board")
	public String blogBoardMethod() {
		return "blog/blog-board";
	}
	@GetMapping("cafe/cafe-board")
	public String cafeBoardMethod() {
		return "cafe/cafe-board";
	}
	
}
