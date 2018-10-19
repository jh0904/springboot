package com.jh.springboot04restfulcrud.controller;

import com.jh.springboot04restfulcrud.dao.DepartmentDao;
import com.jh.springboot04restfulcrud.dao.EmployeeDao;
import com.jh.springboot04restfulcrud.entities.Department;
import com.jh.springboot04restfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * com.jh.springboot04restfulcrud.controller
 *
 * @author jh
 * @date 2018/10/16 16:22
 * description:
 */
@Controller
public class EmployeeController {
	@Autowired
	DepartmentDao departmentDao;

	@Autowired
	EmployeeDao employee;

	//查询所有员工
	@GetMapping("/emps")
	public String  list(Model model){
		Collection<Employee> employees = employee.getAll();

		//放在请求域中
		model.addAttribute("emps",employees);
		// thymeleaf默认就会拼串
		// classpath:/templates/xxxx.html
		return "emp/list";
	}
	//来到员工添加页面
	@GetMapping("/emp")
	public String toAddPage(Model model){
		//首先要查出部门，然后在页面显示
		Collection<Department> departments = departmentDao.getDepartments ();
		model.addAttribute ("depts",departments);
		return "emp/add";
	}
}
