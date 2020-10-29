package com.atguigu.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * Controller：它直接和视图层打交道的，所以不需要接口
 */

import com.atguigu.spring.annotation.service.UserService;


/**
 * @Controller 注解的作用(需要配合context命名空间的组件扫描)：
 * 1. 相当于在xml文件中添加了：
 * 		<bean id="userController" class="com.atguigu.spring.annotation.controller.UserController">
 *
 * 2. 注解默认的id值  就是类名的首字母小写，可以在注解中手动指定id值：@Controller(value="id值")，可以简写为@Controller("id值")
 *
 */ 
@Controller
public class UserController {
	
	//分析：IOC容器天生就擅长于做DI依赖注入/资源注入
	/*
	 * 1. IOC容器中此时有：uc,us的实现类对象，repository对象
	 * 2. uc需求： uc对象想要us实现类对象。
	 * 3. 根据IOC实现原理，拿到这个需求我知道了以后，我就会主动的为你把us实现类对象推送过来了。
	 * 
	 */
	
	
	//需要注入的属性加上@Autowired注解。IOC容器就会把us对象推送过来了
	@Autowired
	private UserService userService;
	
	
	public void regist() {
		
		userService.handleAddUser();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
