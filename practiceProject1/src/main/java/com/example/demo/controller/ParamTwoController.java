package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("param2")
@Slf4j
public class ParamTwoController {
	@PostMapping("test2")
	//메서드 paramTwoTest
	public String paramTwoTest(@RequestParam("snackName") String snackName,
							   @RequestParam("snackCompany") String snackCompany,
							   @RequestParam("snackPrice") int snackPrice,
							   @RequestParam(value="snackLike", defaultValue="snackLike", required=false) String snackLike
	) {
		log.info(snackName);
		log.info(snackCompany);
		log.info("snackPrice" + snackPrice);
		log.info(snackLike);
		
		return "redirect:/param/main";
	}
	
	// 메서드 paramLikeSnackCompany
	@PostMapping("likeSnackCompany")
	public String paramLikeSnackCompany(
			@RequestParam(value="likesnack", required=false) String[] likesnack,
			@RequestParam(value="likecompany", required=false) List<String> likecompany
			) {
		
		log.info("좋아하는 과자들 : " +Arrays.toString(likesnack));
		log.info("선호하는 과자들 : " +likecompany);
		
		return "redirect:/param/main";
	}
	
	
}
