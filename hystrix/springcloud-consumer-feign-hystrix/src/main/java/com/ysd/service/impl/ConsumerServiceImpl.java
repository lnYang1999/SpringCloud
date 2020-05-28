package com.ysd.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ysd.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public List<String> getProviderFuture() {
		// TODO Auto-generated method stub
		return Arrays.asList("Provider服务调用失败","我是Consumer服务降级");
	}

}
