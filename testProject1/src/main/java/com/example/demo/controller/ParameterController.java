package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
 // 응답,요청 제어 역할 명시 +Bean 등록

@Controller
@Slf4j
@RequestMapping("param") // parametercontroller 밑에는 모두 자동으로 맨앞에 param 붙음
public class ParameterController {
	@GetMapping("main")
	public String paramMain() {
		return "param/param-main"; // 폴더 param 안에 있는 param-main.html 파일 바라보기
	}
	
	@PostMapping("test1")
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName");
		String inputAddress = req.getParameter("inputAddress");
		int inputAge = Integer.parseInt(req.getParameter("inputAge")); //--> String에서 int
		
		log.info("시작했는지 확인");
		log.info("이름 확인 : " +inputName);
		log.info("나이 확인 : " +inputAge);
		log.info("주소 확인 : " +inputAddress);		
		
		log.debug("이름 확인 : " +inputName);
		log.debug("나이 확인 : " +inputAge);
		log.debug("주소 확인 : " +inputAddress);

		return "redirect:/param/main";
	}
}
