package com.atguigu.spring.aop.proxy;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		int result = i + j;
		
		return result;
	}
	
	@Override
	public int sub(int i, int j) {
		int result = i - j;
		
		return result;
	}
	
	
	@Override
	public int mul(int i, int j) {
		int result = i * j;
		
		return result;
	}

	
	@Override
	public int div(int i, int j) {
		int result = i / j;
		
		return result;
	}
	
	
	/**
	 * ��Ҫ���ڼ̳еķ�ʽȥ���������ࣺ��Ŀ����󵱳ɸ��࣬�Ѵ�����󵱳�һ�����ࡣ�����������з����̳�������
	 * �̳еĴ���ʽ����Ϊ��������з�����������
	 * �ӿڵĴ���ʽ����Ϊ�ӿڵ����з�����������
	 * @return
	 */
	public int abc() {
		System.out.println("aaa");
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
