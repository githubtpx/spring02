package com.atguigu.spring.aop.before;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println("��־��¼��The Method add begin with ["+i+","+j+"]");
		int result = i + j;
		System.out.println("��־��¼��The Method add end with "+ result);
		
		return result;
	}
	
	@Override
	public int sub(int i, int j) {
		System.out.println("��־��¼��The Method add begin with ["+i+","+j+"]");
		int result = i - j;
		System.out.println("��־��¼��The Method add end with "+ result);
		
		return result;
	}
	
	
	@Override
	public int mul(int i, int j) {
		System.out.println("��־��¼��The Method add begin with ["+i+","+j+"]");
		int result = i * j;
		System.out.println("��־��¼��The Method add end with "+ result);
		
		return result;
	}

	
	@Override
	public int div(int i, int j) {
		System.out.println("��־��¼��The Method add begin with ["+i+","+j+"]");
		int result = i / j;
		System.out.println("��־��¼��The Method add end with "+ result);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
