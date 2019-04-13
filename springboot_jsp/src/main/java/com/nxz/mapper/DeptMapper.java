package com.nxz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.nxz.entity.Dept;

public interface DeptMapper {

	/**
	 * 根据部门ID查询部门名称
	 * 
	 * @param dId
	 * @return
	 */
	@Select("SELECT DNAME FROM TBL_DEPT WHERE DID = #{dId}")
	String findByDept(@Param("dId") Integer dId);

	/**
	 * 添加部门信息
	 * 
	 * @param dId
	 * @param dName
	 * @return
	 */
	@Insert("INSERT INTO TBL_DEPT(DID,DNAME) VALUES(#{dId},#{dName})")
	int insertDept(@Param("dId") Integer dId, @Param("dName") String dName);

	/**
	 * 查询所有部门列表
	 * 
	 * @return
	 */
	@Select("SELECT DID,DNAME FROM TBL_DEPT")
	List<Dept> findByDeptList();

}
