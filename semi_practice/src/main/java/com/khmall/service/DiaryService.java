package com.khmall.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Diary;
import com.khmall.mapper.DiaryMapper;

@Service
public class DiaryService {
	@Autowired
	private DiaryMapper diaryMapper;

	public List<Diary> getAllDiary(){
		return diaryMapper.getAllDiary();
	}
	
	public void uploadDiary(String diary_title, MultipartFile file) {
		String fileName = file.getOriginalFilename();
		System.out.println("file Name : " +fileName);
		
		String uploadDir = "C:/Users/user1/Desktop/diary_img/";
		
		File imgFolder = new File(uploadDir = "");
		File imgFile = new File(imgFolder + fileName);
		
		if( !imgFolder.exists()) {
			imgFolder.mkdirs();
		}
		
		Diary diary = new Diary();
		diary.setDiary_title(diary_title);
		diary.set
	}
}
