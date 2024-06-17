package com.example.demo.dto;

import lombok.*;

/*lombok 활용한 Getter Setter 기초 필수생성자 ToString 만들기*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {
	private int goodsId;
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
}
