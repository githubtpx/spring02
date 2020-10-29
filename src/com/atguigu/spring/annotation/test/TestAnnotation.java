package com.atguigu.spring.annotation.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.annotation.controller.UserController;
import com.atguigu.spring.annotation.repository.UserDao;
import com.atguigu.spring.annotation.service.UserService;

public class TestAnnotation {

	@Test
	public void testAnnotation() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
		
		
		UserController uc = ctx.getBean("userController",UserController.class);
		System.out.print("userController:" + uc);
		
//		UserService us = ctx.getBean("userServiceImpl",UserService.class);
//		System.out.println("userService:" + us);
//		
//		
//		UserDao ud = ctx.getBean("userDaoJdbcImpl",UserDao.class);
//		System.out.println("userDao:" + ud);
		
		uc.regist();
		
		
		
	}
	
	
	 
	

}
