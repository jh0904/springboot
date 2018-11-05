package com.jh.springboot07mybatis.Bean;

/**
 * com.jh.springboot07mybatis.Bean
 *
 * @author jh
 * @date 2018/11/5 11:02
 * description:
 */
public class Department {
	private Integer id;
	private String departmentName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
