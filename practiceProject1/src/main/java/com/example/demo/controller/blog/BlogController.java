package com.example.demo.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

// controller 폴더 밑에 blog 라는 폴더 만들어줘서 블로그 관련 컨트롤ㄹ러 작성
@Controller
@RequestMapping("blog")
public class BlogController {
	@GetMapping("index")
	public String blogMainMethod() {
		return "blog/blog-index";
	}
	
	// blog-board GetMapping 연결
	@GetMapping("board")
		public String blogBoardMethod() {
			return "blog/blog-board";
		}
	

}
