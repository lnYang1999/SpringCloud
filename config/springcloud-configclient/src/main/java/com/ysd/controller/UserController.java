package com.ysd.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	/**
	* http://localhost:9001/getConfig
	* @return
	*/
	@RequestMapping("/getConfig")
	public List<String> getUserName() {
		return Arrays.asList(url,userName,password,driverClassName);
	}

}
