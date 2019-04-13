package com.nxz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.nxz.entity.Dept;
import com.nxz.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	@RequestMapping("/findDept")
	public String findDept(Integer dId) {

		return service.findDept(dId);
	}

	@RequestMapping("/insertDept")
	public int insertDept(Integer dId, String dName) {
		return service.insertDept(dId, dName);
	}

	/**
	 * 分页查询所有部门信息
	 * 
	 * @param page
	 *            第几页
	 * @param pageSize
	 *            每页多少条
	 * @return
	 */
	@RequestMapping("/findByDeptList")
	public PageInfo<Dept> findByDeptList(Integer page, Integer pageSize) {
		return service.findByDeptList(page, pageSize);
	}

}
