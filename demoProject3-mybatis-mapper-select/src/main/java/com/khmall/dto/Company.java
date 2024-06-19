package com.khmall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {
	private int company_id;
	private String company_name;
	private String company_address;
	private String company_phone; 
	// 휴대폰 번호 0으로 시작하기 때문에 String
	// int는 맨 앞자리 0을 자동으로 없앰
}