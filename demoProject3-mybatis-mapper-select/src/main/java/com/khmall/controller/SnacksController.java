package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.Snacks;
import com.khmall.service.SnacksService;

@Controller
public class SnacksController{
	@Autowired //SnackService에 작성된 모든 기능 활용하겠다. (의존성 주입)
	private SnacksService snackService;
	
	@GetMapping("/allSnack")
	public String getAllSnacks(Model model) {
			List<Snacks> snackList = snackService.getAllSnacks();
			//<tr th:each="s : ${snackList}"> html에 전달할 목록들을
			// "" 안에 snackList라는 변수명을 사용해서 전달하겠다 라는 표시
			// model 은 db에서 가져온 값을 전달해주는 전달 연결고리
			model.addAttribute("snackList", snackList);
							//스낵서비스에서 추가적인 서비스 기능으로 다듬어진 메서드
			return "snackList";
			//return "스낵리스트가 작성된 html 파일명 작성하기";
		
	}
}