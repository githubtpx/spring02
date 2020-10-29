package com.atguigu.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * Controller����ֱ�Ӻ���ͼ��򽻵��ģ����Բ���Ҫ�ӿ�
 */

import com.atguigu.spring.annotation.service.UserService;


/**
 * @Controller ע�������(��Ҫ���context�����ռ�����ɨ��)��
 * 1. �൱����xml�ļ�������ˣ�
 * 		<bean id="userController" class="com.atguigu.spring.annotation.controller.UserController">
 *
 * 2. ע��Ĭ�ϵ�idֵ  ��������������ĸСд��������ע�����ֶ�ָ��idֵ��@Controller(value="idֵ")�����Լ�дΪ@Controller("idֵ")
 *
 */ 
@Controller
public class UserController {
	
	//������IOC�����������ó�����DI����ע��/��Դע��
	/*
	 * 1. IOC�����д�ʱ�У�uc,us��ʵ�������repository����
	 * 2. uc���� uc������Ҫusʵ�������
	 * 3. ����IOCʵ��ԭ���õ����������֪�����Ժ��Ҿͻ�������Ϊ���usʵ����������͹����ˡ�
	 * 
	 */
	
	
	//��Ҫע������Լ���@Autowiredע�⡣IOC�����ͻ��us�������͹�����
	@Autowired
	private UserService userService;
	
	
	public void regist() {
		
		userService.handleAddUser();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
