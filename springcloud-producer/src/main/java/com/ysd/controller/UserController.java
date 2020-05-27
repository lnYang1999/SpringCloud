package com.ysd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Value("${server.port}")
	private String serverport;

	@RequestMapping("/getFuture")
	public List<String> getFuture() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list = new ArrayList<>();
		list.add("不积跬步，无以至千里；");
		list.add("不积小流，无以成江海。");
		list.add("出自端口号:" + serverport);
		return list;
	}
}
