package com.yyc.tran.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.yyc.tran.web.dao")
public class YycApplication {

	public static void main(String[] args) {
		SpringApplication.run(YycApplication.class, args);
	}

}
