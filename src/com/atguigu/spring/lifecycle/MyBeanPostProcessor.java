package com.atguigu.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean�ĺ��ô�������BeanPostProcessor����IOC���������е�bean���������ڶ������á�
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * ��IOC����������bean���������ڵĳ�ʼ������֮ǰִ��
	 * Object bean�� 		���ڱ�������bean����
	 * String beanName�� bean�����idֵ
	 * 
	 * ��Ҫ��Ͼ����ҵ��
	 * ���ܣ����Զ�bean����������Ϣ��У��(�Ϸ�/�Է�)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

	
	/**
	 * ��IOC����������bean���������ڵĳ�ʼ������֮��ִ��
	 * 
	 * ���ܣ���bean�����ʼ����У��(�Է�/����Ҫ���)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

	
	
	
}
