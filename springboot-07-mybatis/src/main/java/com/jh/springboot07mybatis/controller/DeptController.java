package com.jh.springboot07mybatis.controller;

import com.jh.springboot07mybatis.Bean.Department;
import com.jh.springboot07mybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.jh.springboot07mybatis.controller
 *
 * @author jh
 * @date 2018/11/5 11:11
 * description:
 */
@Controller
public class DeptController {

	@Autowired
	DepartmentMapper mapper;

	@GetMapping("/dept/{id}")
	@ResponseBody
	public Department getDepartment(@PathVariable("id") Integer id){
		return mapper.getDeptById (id);
	}

	@GetMapping("/dept")
	@ResponseBody
	public Department insertDept(Department department){
		mapper.insertDept (department);
		return department;
	}
}
