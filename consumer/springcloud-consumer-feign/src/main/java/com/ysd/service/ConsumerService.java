package com.ysd.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-provider")
public interface ConsumerService {
	@RequestMapping("/getFuture")
	public List<String> getProviderFuture();
}
