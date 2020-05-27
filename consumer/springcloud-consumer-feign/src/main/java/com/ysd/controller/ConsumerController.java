package com.ysd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.service.ConsumerService;

@RestController
public class ConsumerController {
	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping("/getProviderFuture")
	public List<String> getProviderFuture(){
		return consumerService.getProviderFuture();
	}
}
