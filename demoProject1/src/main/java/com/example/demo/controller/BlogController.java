package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.BlogDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("blog")
@Slf4j
// 어노테이션(@) 이용해서, controller requestMapping("blog", slf4j 설정
public class BlogController {
	// 메서드명 : blogComment
	// 어노테이션(@) 이용해서 PostMapping(comment) 만들고
	// @RequestParam 이용해서 blog-index.html 파일에 작성한
	// commentName, commentOpinion 작성하기
	// required=true
	// return "redirect:/blog-index"
	@PostMapping("comment")
	public String blogComment(BlogDTO blogDTO) {
		log.info("블로그 댓글 작성 공간");
		
		BlogDTO bd = new BlogDTO();
		/*
		bd.getCommentName();
		bd.getCommentOpinion();
		bd.setCommentOpion
		
		
		log.debug("commentName : " +commentName);
		log.debug("commentOpinion : " +commentOpinion);
		*/
		log.info("블로그 댓글 작성 완료하고 다시 블로그 메인페이지로 돌아가기");
		
		return "redirect:/blog/blog-index";
	}
}
