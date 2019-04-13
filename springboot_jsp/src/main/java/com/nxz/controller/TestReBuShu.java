package com.nxz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestReBuShu {

	@RequestMapping("testReBuShu")
	public String testReBuShu() {
		String result = "SpringBoot 1.5-V1.5";
		return result;
	}

	@RequestMapping("testReBuShu002")
	public String testReBuShu002() {
		String result = "SpringBoot 2.0-V2.0";
		return result;
	}

}
