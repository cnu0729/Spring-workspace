package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Clothes;
import com.khmall.service.ClothesService;

@Controller
public class ClothesController {
	@Autowired
	private ClothesService clothesService;
	
	@GetMapping("/")
	public String getAllClothes(Model model) {
		List<Clothes> clothes = clothesService.getAllClothes();
		model.addAttribute("clothes", clothes);
		return  "imageUpload";
		}
	
	
	@PostMapping("/upload")
	public String uploadClothes(
			@RequestParam("clothes_name") String clothes_name,
			@RequestParam("clothes_price") int clothes_price,
			@RequestParam("clothes_image_path")MultipartFile file,
			Model model) {
		0
	}
			
}}
