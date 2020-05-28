package com.ysd.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ysd.service.impl.ConsumerServiceImpl;

@FeignClient(value="service-provider",fallback=ConsumerServiceImpl.class) 
public interface ConsumerService {
	@RequestMapping("/getFuture")
	public List<String> getProviderFuture();
}
