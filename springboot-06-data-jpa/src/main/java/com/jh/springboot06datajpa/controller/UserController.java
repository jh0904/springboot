package com.jh.springboot06datajpa.controller;

import com.jh.springboot06datajpa.entity.User;
import com.jh.springboot06datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.jh.springboot06datajpa.controller
 *
 * @author jh
 * @date 2018/11/5 15:42
 * description:
 */
@RestController
public class UserController {
	@Autowired
	UserRepository repository;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id){
		User user = repository.findOne (id);
		return user;
	}

	@GetMapping("/user")
	public User insertUser(User user){
		User save = repository.save (user);
		return save;
	}

}
