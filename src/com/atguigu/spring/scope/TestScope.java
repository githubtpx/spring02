package com.atguigu.spring.scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	
	/**
	 * 测试bean的作用域scope
	 */
	@Test
	public void testScope() {
		//创建了IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-scope.xml");
		
		//单例的bean，在整个IOC容器中只能存在一个bean的对象。
		Car car1 = ctx.getBean("car",Car.class);
		
		Car car2 = ctx.getBean("car",Car.class);
		
		System.out.println(car1 == car2);
		
		
	}

}
