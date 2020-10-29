package com.atguigu.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.spring.annotation.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{

	/**
	 *  @AutoWired 注解： 完成bean对象/引用属性的“自动装配”autowire
	 * 
	 * 
	 * 	工作机制：   1) 首先会使用byType方式进行自动装配，如果能唯一匹配，则装配成功。
	 * 		     2) 如果自动装配的时候，匹配到IOC容器中多个兼容类型的bean。
	 * 			 3） 还会尝试使用byName的方式进行唯一确定。
	 * 			           如果能唯一确定，则装配成功。如果不能唯一确定，则装配失败，抛出异常。
	 * 	
	 *  默认情况下， 使用@Autowired标注的属性必须被装配，如果装配不了，也会抛出异常。
	 * 	可以使用@Autowired注解的成员required=false，来设置不是必须要装配。
	 * 
	 *  如果匹配到多个兼容类型的bean，可以使用@Qualifier("")注解，进一步指定装配的bean的id值。
	 * 
	 * 	@AutoWired  @Qualifier注解   即可以加在成员变量上(推荐不用使用set方法了)，也可以加在对应的set方法上。
	 * 	
	 */
	
	@Autowired(required=false)    //  自动装配：byName,byType
	@Qualifier("userDaoJdbcImpl") //资格赛，预选赛；取得资格的人
	private UserDao userDao; 
	
	
	
//	@Autowired(required=false)   
//	@Qualifier("userDaoJdbcImpl") 
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	

	@Override
	public void handleAddUser() {
		//处理业务
		System.out.println();
		
		userDao.addUser();
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
