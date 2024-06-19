package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Company;
import com.khmall.service.CompanyService;

@Controller
public class CompanyController{
	@Autowired //SnackService에 작성된 모든 기능 활용하겠다. (의존성 주입)
	private CompanyService companyService;
	
	@GetMapping("/allCompany")
	public String getAllCompany(Model model) {
		// 회사목록 리스트를 companyList.html 전달
			List<Company> companyList = companyService.getAllCompany();
			//companyList.html 에 companyLsit로 가져온 목록들을 companyList라는 이름으로
			//companyList 에 적힌 목록을 전달
			model.addAttribute("companyList", companyList);
							
			return "companyList";
			//return "스낵리스트가 작성된 html 파일명 작성하기";
	}
}