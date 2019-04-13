package com.nxz.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.nxz.entity.Dept;
import com.nxz.service.DeptService;

@Controller
public class TestThymeleaf {

	@Autowired
	private DeptService service;
	private PageInfo<Dept> findByDeptList;
	
	/**
	 * 1.第一步在html中加入 xmlns:th="http://www.thymeleaf.org 
	 * 2.th标签用在htnl标签里面<h5 th:text="${MSG}">
	 * @param model
	 * @return
	 */
	@RequestMapping("/myTh")
	public String testThymeleaf(Model model,Integer page,Integer pageSize
			,HttpServletRequest request,HttpSession session
			,HttpServletResponse response) {
		
		findByDeptList = service.findByDeptList(page, pageSize);
		
		Dept dept = new Dept();
		dept.setdId(1234);
		dept.setdName("张三疯");
		
		model.addAttribute("MSG", "spring Boot集成ThyMeleaf");
		model.addAttribute("dept", dept);
		model.addAttribute("deptList", findByDeptList);
		
		int sex = 1;
		model.addAttribute("sex", sex);
		
		request.setAttribute("name", "聂晓智");
		session.setAttribute("age", "24");
		
		model.addAttribute("date", new Date());
		
		model.addAttribute("str", "0123456789");
		
		return "myTh";
	}

}
