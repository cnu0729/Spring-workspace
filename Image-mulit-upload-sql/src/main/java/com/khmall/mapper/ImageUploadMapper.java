package com.khmall.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.ImageUpload;

@Mapper
public interface ImageUploadMapper {
	//void insertImageUpload(ImageUpload imageUpload);
	/*
	 Controller에서 paramMap을 Mapper로 전달할 때
	 imageUploadMapper.insertImageUpload(paramMap);
	 
	 paramMap 맨 앞에
	 Map<String, Object> paramMap
	 
	 Map 과 String Object 
	*/
	void insertImageUpload(Map<String, Object> paramMap);
}
