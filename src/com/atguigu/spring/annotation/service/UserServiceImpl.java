package com.atguigu.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.spring.annotation.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{

	/**
	 *  @AutoWired ע�⣺ ���bean����/�������Եġ��Զ�װ�䡱autowire
	 * 
	 * 
	 * 	�������ƣ�   1) ���Ȼ�ʹ��byType��ʽ�����Զ�װ�䣬�����Ψһƥ�䣬��װ��ɹ���
	 * 		     2) ����Զ�װ���ʱ��ƥ�䵽IOC�����ж���������͵�bean��
	 * 			 3�� ���᳢��ʹ��byName�ķ�ʽ����Ψһȷ����
	 * 			           �����Ψһȷ������װ��ɹ����������Ψһȷ������װ��ʧ�ܣ��׳��쳣��
	 * 	
	 *  Ĭ������£� ʹ��@Autowired��ע�����Ա��뱻װ�䣬���װ�䲻�ˣ�Ҳ���׳��쳣��
	 * 	����ʹ��@Autowiredע��ĳ�Աrequired=false�������ò��Ǳ���Ҫװ�䡣
	 * 
	 *  ���ƥ�䵽����������͵�bean������ʹ��@Qualifier("")ע�⣬��һ��ָ��װ���bean��idֵ��
	 * 
	 * 	@AutoWired  @Qualifierע��   �����Լ��ڳ�Ա������(�Ƽ�����ʹ��set������)��Ҳ���Լ��ڶ�Ӧ��set�����ϡ�
	 * 	
	 */
	
	@Autowired(required=false)    //  �Զ�װ�䣺byName,byType
	@Qualifier("userDaoJdbcImpl") //�ʸ�����Ԥѡ����ȡ���ʸ����
	private UserDao userDao; 
	
	
	
//	@Autowired(required=false)   
//	@Qualifier("userDaoJdbcImpl") 
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	

	@Override
	public void handleAddUser() {
		//����ҵ��
		System.out.println();
		
		userDao.addUser();
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
