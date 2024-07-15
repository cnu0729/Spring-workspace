package com.kh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.mapper.TodoMapper;

@Service
public class TodoServiceImp1 implements TodoService{
	@Autowired
	private TodoMapper   mapper;
}
