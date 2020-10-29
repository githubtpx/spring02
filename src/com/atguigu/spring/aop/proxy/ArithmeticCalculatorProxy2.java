package com.atguigu.spring.aop.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JDK�Ķ�̬����
 * 	1. ��Proxy �� 	�����ж�̬������ĸ��࣬ר���������ɴ�����	    �����Ǵ������
 * 		public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)	
 * 	          �����������ǵĴ������Class����(һ������ص��ڴ��У�����һ��Class����)		
 * 
 * 
 * 		public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
                    ��������һ���������(Class����ľ���ʵ��)
                    
                    
 * 
 *  2. �ӿ�InvocationHandler(����/���ô�����)��������ɶ�̬�������������(��̬����Ҫ�������ڴ˱�д)
 *  	public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;         	--->��������У���̬������������̱�д
        
         								 ���Ƿ����е�method.invoke()
        
 */

/*
 * ��������"��ѧ��������־����"����     		----���������Ǵ������
 */
public class ArithmeticCalculatorProxy2 {
	//��̬������Ҫ��������£�	  Ŀ�����/�����������˭		��λ�ȡ�������	����Ҫ��ʲô
	
	//Ŀ�������˭ ����������������
	private ArithmeticCalculator target;

	public ArithmeticCalculatorProxy2(ArithmeticCalculator target) { 
		super();
		this.target = target;
	}
	
	
	//��ȡ�������ķ���
	public Object getProxy()  throws Exception{
		
		//�������
		Object proxy;
		
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = target.getClass().getInterfaces();
		
		Class proxyClass = Proxy.getProxyClass(loader, interfaces);
		 
		//Class ��������  newInstance()������û���޲���������
		Constructor con = 
				proxyClass.getDeclaredConstructor(InvocationHandler.class);
		
		proxy = con.newInstance(new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//��ȡ����������
				String methodName = method.getName();
				
				//��¼��־
				System.out.println("LogginProxy==> The Method " + methodName + " begin with "+ Arrays.asList(args));
				
				//�������ĵ���ת�ص�Ŀ������ϡ�
				Object result = method.invoke(target, args);  // Ŀ�����ִ��Ŀ�귽���� �൱��ִ��ArithmeticCalculatorImpl�е�+ - * /
				
				//��¼��־
				System.out.println("LogginProxy==> The Method " + methodName + " end with " + result);
				
				return result;
			}
		});
		
		
		return proxy;
	}
	
	
	
	
	
	
	
	
	
	
}

























