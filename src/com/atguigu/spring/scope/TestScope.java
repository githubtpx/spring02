package com.atguigu.spring.scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	
	/**
	 * ����bean��������scope
	 */
	@Test
	public void testScope() {
		//������IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-scope.xml");
		
		//������bean��������IOC������ֻ�ܴ���һ��bean�Ķ���
		Car car1 = ctx.getBean("car",Car.class);
		
		Car car2 = ctx.getBean("car",Car.class);
		
		System.out.println(car1 == car2);
		
		
	}

}
