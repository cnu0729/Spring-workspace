package com.example.demo.dto;
import lombok.*;

/*lombok 활용한 Getter Setter 기초 필수생성자 ToString 만들기*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Drinks {
	private int drinksId;
	private String drinksName;
	private int drinksPrice;
	private int drinksQuantity;
}
