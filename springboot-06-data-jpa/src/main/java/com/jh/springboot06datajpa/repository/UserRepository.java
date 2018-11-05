package com.jh.springboot06datajpa.repository;

import com.jh.springboot06datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.jh.springboot06datajpa.repository
 *
 * @author jh
 * @date 2018/11/5 15:36
 * description:
 */
public interface UserRepository extends JpaRepository<User,Integer> {


}
