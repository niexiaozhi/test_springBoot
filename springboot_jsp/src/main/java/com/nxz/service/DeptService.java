package com.nxz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nxz.entity.Dept;
import com.nxz.mapper.DeptMapper;

@Service
public class DeptService {

	@Autowired
	private DeptMapper mapper;

	public String findDept(Integer dId) {
		return mapper.findByDept(dId);
	}

	// 加上该注解后会执行完注解下的方法才commit，在方法中出现异常就会回滚
	// 不加该注解时，调用完mapper接口后就会自动提交事务
	@Transactional
	public int insertDept(Integer dId, String dName) {
		int result = mapper.insertDept(dId, dName);
		int i = 1 / dId; // 如果did为0，就会出现异常，不加注解@Transactional就已经commit了
		return result;
	}

	/**
	 * 分页查询所有部门列表
	 * 
	 * @param page
	 *            第几页
	 * @param pageSize
	 *            每页多少条
	 * @return
	 */
	public PageInfo<Dept> findByDeptList(Integer page, Integer pageSize) {
		// pageHelper 帮我们生成分页语句，底层实现原理采用改写拼接SQL语句
		PageHelper.startPage(page, pageSize);
		List<Dept> listDept = mapper.findByDeptList();
		// 返回给客户端，分页信息
		PageInfo<Dept> pageInfoDept = new PageInfo<Dept>(listDept);

		return pageInfoDept;
	}

}
