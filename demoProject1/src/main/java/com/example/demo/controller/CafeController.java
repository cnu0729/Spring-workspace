package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("cafe")
@Slf4j
public class CafeController {

	// 메서드명 : cafeMainComment
	// 어노테이션(@) 이용해서 PostMapping(만남의 주소) 만들고
	// @RequestParam 이용해서 blog-index.html 파일에 작성한
	// cafeCommentName, cafeCommentOpinion 작성하기
	// return "redirect:/cafe-index"
	@PostMapping("cafe-index")
	public String cafeMainComment(@RequestParam("cafeCommentName") String cafeCommentName,
							  @RequestParam("cafeCommentOpinion") String cafeCommentOpinion
			) {
		
		log.info("카페 메인으로 돌아가기");
		
		log.debug("cafeCommentName : " +cafeCommentName);
		log.debug("cafeCommentOpinion : " +cafeCommentOpinion);
		
		return "redirect:/cafe/cafe-index";
	}
}
