package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Company;
import com.khmall.mapper.CompanyMapper;

/*
 controller에서 가져오거나 db에서 가져온 값에 
 추가적인 기능을 작성해주는 서비스 공간
 @Service db에서 가져온 sql 구문이나
 html 에서 db에 넣어줄 값에다가 추가적인 서비스를 적용하겠다 라는 표시
*/
@Service
public class CompanyService {
	/*
	 Mapper에 작성한 리스트를 모두 활용하곘다는
	 @Autowired 어노테이션 작성
	*/
	@Autowired //객체 안에 한줄씩 참조할 때 작성
	private CompanyMapper companyMapper;
	
	//snacs sql에서 가져온 스낵들을 컨트롤러에 전달해주는 메서드(기능) 작성
	public List<Company> getAllCompany(){
		//회사 정보 db 내용을 회사목록으로 controller 에 전달
		return companyMapper.getAllCompany();
	}
}
