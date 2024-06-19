package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.khmall.dto.Company;
import com.khmall.dto.Member;
import com.khmall.dto.Snacks;

@Controller
public class IndexController {
	@GetMapping("/")
	public String IndexForm(Model model){
		model.addAttribute("company", new Company());
		model.addAttribute("snacks", new Snacks());
		model.addAttribute("member", new Member());
		return "index";
	}
}
