package com.khmall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SC {
	private int snack_id;
	private String snack_name;
	private int price;
	
	// mappers 폴더 안에 있는 xml에 작성한 join문에서
	// Snacks 테이블에 있는 company_id와 company 테이블에 있는 company_id
	// 와 서로 의미하는 바와 값이 일치할 경우 company 테이블에 있는
	// company_name과 company_phone 가지고오겠다.
	private String company_name;
	private String company_phone;
	private String company_address;
	private int company_id;
}
