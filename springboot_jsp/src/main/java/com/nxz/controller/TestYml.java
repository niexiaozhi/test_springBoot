package com.nxz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestYml {

	@Value("${geRenJinaLi.name}")
	private String name;

	@Value("${geRenJinaLi.age}")
	private String age;

	@Value("${geRenJinaLi.sex}")
	private String sex;

	@Value("${geRenJinaLi.hobby.one}")
	private String hobby;

	@RequestMapping("testYml")
	public String testYml() {
		return "姓名：" + name + ",年龄：" + age + ",性别：" + sex + ",爱好：" + hobby;
	}

}
