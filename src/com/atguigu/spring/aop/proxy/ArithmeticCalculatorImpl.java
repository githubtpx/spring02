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
	 * 需要基于继承的方式去创建代理类：把目标对象当成父类，把代理对象当成一个子类。这样父类所有方法继承下来。
	 * 继承的代理方式：能为父类的所有方法都做代理
	 * 接口的代理方式：能为接口的所有方法都做代理
	 * @return
	 */
	public int abc() {
		System.out.println("aaa");
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
