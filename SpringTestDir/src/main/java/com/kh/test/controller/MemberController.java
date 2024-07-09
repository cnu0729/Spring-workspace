package com.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.test.dto.Members;
import com.kh.test.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String indexMain(Model model) {
		model.addAttribute("mem", new Members());
		return "index";
	}
	@PostMapping("/register")
	public String insertEmail(Members members, Model model) {
		memberService.insertMember(members);
		
		model.addAttribute("msg", "이메일 입력이 완료되었습니다.");
		return "index";
	}
}
