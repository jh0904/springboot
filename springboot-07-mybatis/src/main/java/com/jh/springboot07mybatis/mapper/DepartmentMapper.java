package com.jh.springboot07mybatis.mapper;

import com.jh.springboot07mybatis.Bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * com.jh.springboot07mybatis.mapper
 *
 * @author jh
 * @date 2018/11/5 11:04
 * description:这是操作数据库的Mapper
 */
@Mapper
public interface DepartmentMapper {
	@Select ("select * from department where id=#{id}")
	public Department getDeptById(Integer id);

	@Delete ("delete from department where id=#{id}")
	public int deleteDeptById(Integer id);

	@Insert ("insert into department(departmentName) values(#{departmentName})")
	public int insertDept(Department department);

	@Update ("update department set departmentName=#{departmentName} where id=#{id}")
	public int updateDept(Department department);

}
