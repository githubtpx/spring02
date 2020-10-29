package com.atguigu.spring.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao{

	@Override
	public void addUser() {
		System.out.println("UserDao Mybatis....");
	}

}
