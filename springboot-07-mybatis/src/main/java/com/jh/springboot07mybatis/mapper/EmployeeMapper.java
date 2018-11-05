package com.jh.springboot07mybatis.mapper;

import com.jh.springboot07mybatis.Bean.Employee;

/**
 * com.jh.springboot07mybatis.mybatis
 *
 * @author jh
 * @date 2018/11/5 14:31
 * description:
 */
public interface EmployeeMapper {

	public Employee getEmpById(Integer id);

	public void insertEmp(Employee employee);
}
