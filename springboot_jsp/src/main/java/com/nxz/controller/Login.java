package com.nxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/login")
	public String login(){
		System.out.println("开始执行");
		return "index";
	}
	
}
