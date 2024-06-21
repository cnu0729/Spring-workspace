package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Clothes;

@Service
public class ClothesService {
	@Autowired
	private ClothesService clothesService;
	
	public List<Clothes> getAllClothes(){
		return clothesMapper.getAllClothes();
	}
	
	public Clothes getClothesById(int clothes_id) {
		return clothesMapper.getClothesById(clothes_id);
	}
}
