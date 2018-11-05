package com.jh.springboot06datajpa.entity;

import javax.persistence.*;

/**
 * com.jh.springboot06datajpa.entity
 *
 * @author jh
 * @date 2018/11/5 15:19
 * description:
 */
@Entity//告诉JPA这是一个实体类
@Table(name = "tbl_user")//指定数据表 ,如果省略，就是类名小写
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
	private Integer id;
	@Column(name = "last_name",length = 40)
	private String lastName;
	@Column
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
