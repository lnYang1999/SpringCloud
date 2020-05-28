package com.ysd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;

@Controller
public class UserController {
	@RequestMapping("getUserbyId")
	@ApiOperation("根据用户编号用户信息")
	public Object getUserbyId(int id) {
		return "test";
	}
}
