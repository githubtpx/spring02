package com.atguigu.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器：BeanPostProcessor，对IOC容器中所有的bean的生命周期都起作用。
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 在IOC容器中所有bean的生命周期的初始化方法之前执行
	 * Object bean： 		正在被创建的bean对象。
	 * String beanName： bean对象的id值
	 * 
	 * 需要结合具体的业务
	 * 功能：可以对bean对象属性信息的校验(合法/对否)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

	
	/**
	 * 在IOC容器中所有bean的生命周期的初始化方法之后执行
	 * 
	 * 功能：对bean对象初始化的校验(对否/满足要求否？)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return bean;
	}

	
	
	
}
