package com.atguigu.spring.lifecycle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	@Test
	public void testLifeCycle() {
		//1. 创建IOC容器
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
		
		Car car = ctx.getBean("car",Car.class);
		
		System.out.println("===>4. 使用bean对象" + car);
		
		//3. IOC容器关闭
		ctx.close();
		
	}
	
	
	
	
	
	
	
	

}
