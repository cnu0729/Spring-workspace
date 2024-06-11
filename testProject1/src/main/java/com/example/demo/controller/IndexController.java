package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/test") // test 요청시 처리할 메서드 매핑
	public String 테스트페이지연결메서드() {
		System.out.println("test 페이지로 제대로 연결됐는지 확인 출력 메서드");
		/*
		@RequestMapping 을 쓰면 기본으로 return 할 때 html 파일을 바라보겠다는 설정 포함
		
		classpath : src/main/resources
		기본경로 앞에 붙여진 /templates/ 폴더가 html을 담는 공간
		파일명 마지막에는 항상 .html 이 붙는다
		*/
		//src/main/resources/templates/test.html 로 이동하겠다 라는 표시
		
		return "test";
	}
	
}
