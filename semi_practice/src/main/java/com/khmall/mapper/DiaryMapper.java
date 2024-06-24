package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.Diary;

@Mapper
public interface DiaryMapper {
	List<Diary> getAllDiary();
	
	public void uploadDiary(Diary diary);
}
