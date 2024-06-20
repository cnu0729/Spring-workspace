package com.khmall.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class Pig {
	private int pig_id; //Number  int
	private String pig_name; //Varchar2 String 
	private int pig_age; //Number  int
	private String pig_image_path; //Varchar2 String 
}