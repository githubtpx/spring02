package com.atguigu.spring.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJdbcImpl implements UserDao{

	@Override
	public void addUser() {
		System.out.print("UserDao Jdbc .....");
		
	}
	

}
