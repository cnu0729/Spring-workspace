package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.Drinks;
import com.example.demo.dto.Goods;
import com.example.demo.service.DrinksService;
import com.example.demo.service.GoodsService;

@Controller
public class IndexController {
	@GetMapping("/")
	public String drinkregisterForm(Model model){
		model.addAttribute("goods", new Goods());
		model.addAttribute("drinks", new Drinks());
		return "index";
	}
}
