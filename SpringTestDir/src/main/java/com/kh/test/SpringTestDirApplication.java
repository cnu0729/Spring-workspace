package com.kh.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("매퍼패키지명")
@MapperScan("com.kh.test.mapper")
@SpringBootApplication
public class SpringTestDirApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestDirApplication.class, args);
	}

}
