package com.atguigu.spring.datasource;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.lifecycle.Car;

public class TestDataSource {

	
	
	@Test
	public void testDataSource() throws SQLException {
		//1. ´´½¨IOCÈÝÆ÷
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-datasource.xml");
			
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		System.out.println("ds: " + ds);
		
		Connection conn = ds.getConnection();
		System.out.println(conn);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
