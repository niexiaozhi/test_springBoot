package com.nxz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestErr {

	@RequestMapping("/testErr")
	public String testErr(int i){
		int j = 1 / i;
		return "结果等于：" + j;
	}
	
}
