package com.jh.springboot07mybatis.controller;

import com.jh.springboot07mybatis.Bean.Department;
import com.jh.springboot07mybatis.Bean.Employee;
import com.jh.springboot07mybatis.mapper.DepartmentMapper;
import com.jh.springboot07mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.jh.springboot07mybatis.controller
 *
 * @author jh
 * @date 2018/11/5 11:11
 * description:
 */
@RestController
public class DeptController {

	@Autowired
	DepartmentMapper mapper;

	@Autowired
	EmployeeMapper employeeMapper;

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable("id") Integer id) {
		return mapper.getDeptById (id);
	}

	@GetMapping("/dept")
	public Department insertDept(Department department) {
		mapper.insertDept (department);
		return department;
	}

	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id) {
		return employeeMapper.getEmpById (id);
	}

}
