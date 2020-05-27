package com.ysd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
	@Autowired
	private RestTemplate restTemplate;
	
	public List<String> getProviderFuture(){
		return restTemplate.getForObject("http://service-provider/getFuture",List.class);
	}
}
