package com.jh.springboot04restfulcrud.controller;

import com.jh.springboot04restfulcrud.dao.DepartmentDao;
import com.jh.springboot04restfulcrud.dao.EmployeeDao;
import com.jh.springboot04restfulcrud.entities.Department;
import com.jh.springboot04restfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
	EmployeeDao employeeDao;

	//查询所有员工
	@GetMapping("/emps")
	public String  list(Model model){
		Collection<Employee> employees = employeeDao.getAll();

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
	//添加员工
	@PostMapping("/emp")
	public String addEmp(Employee employee){
		//插入完成返回员工列表页面   /代表当前项目路径
		//redirect：重定向
		//forward:转发
		System.out.println ("--->"+employee);
		employeeDao.save (employee);
		return "redirect:/emps";
	}
	//查找指定的员工
	@GetMapping("/emp/{id}")
	public String toEditPage(@PathVariable("id") Integer id,Model model){
		Employee employee = employeeDao.get (id);
		model.addAttribute ("emp",employee);
		Collection<Department> departments = departmentDao.getDepartments ();
		model.addAttribute ("depts",departments);
		return "emp/add";
	}
	//员工修改
	@PutMapping("/emp")
	public String update(Employee employee){
		System.out.println ("修改员工数据--->"+employee);
		employeeDao.save (employee);
		return "redirect:/emps";
	}
	//员工删除
	@DeleteMapping("/emp/{id}")
	public String daleteEmployee(@PathVariable("id") Integer id){
		System.out.println ("------->"+id);
		employeeDao.delete (id);
		return "redirect:/emps";
	}
}
