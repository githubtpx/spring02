package com.atguigu.spring.aop.proxy;

import java.util.Properties;

public class Main {
	
	public static void main(String[] args) throws Exception {
		 //����̬���ɵĴ����ౣ������
		 Properties properties = System.getProperties();
		 properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		 
		
		
		//����Ŀ�����
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		
		//��ȡ�������
		Object obj  = new ArithmeticCalculatorProxy2(target).getProxy();
		
		//ת�ؾ��������
		ArithmeticCalculator proxy = (ArithmeticCalculator)obj;
		
		System.out.println(proxy.getClass().getName());
		
		//
		int result = proxy.add(1, 1);
		
		System.out.println("Main Result:" + result);
		
		
		/**
		 * ���⣺
		 * 	   1. ��������ܷ�ת����Ŀ��������ͣ� 
		 * 	   2. ���������ô�������Ϊʲô��ִ��InvocationHandler�����invoke������
		 * 
		 */
		
		
		
	}
	
	
	
	
	

}
