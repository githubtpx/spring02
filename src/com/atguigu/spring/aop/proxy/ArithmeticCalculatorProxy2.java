package com.atguigu.spring.aop.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JDK的动态代理：
 * 	1. 类Proxy ： 	是所有动态代理类的父类，专门用于生成代理类	    或者是代理对象。
 * 		public static Class<?> getProxyClass(ClassLoader loader,
                                         Class<?>... interfaces)	
 * 	          用于生成我们的代理类的Class对象。(一个类加载到内存中，就是一个Class对象)		
 * 
 * 
 * 		public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
                    用于生成一个代理对象(Class对象的具体实例)
                    
                    
 * 
 *  2. 接口InvocationHandler(调用/启用处理器)：具体完成动态代理的整个过程(动态代理要做的事在此编写)
 *  	public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;         	--->在这里进行，动态代理的整个过程编写
        
         								 不是反射中的method.invoke()
        
 */

/*
 * 此类生成"数学计算器日志代理"对象     		----它不是我们代理对象！
 */
public class ArithmeticCalculatorProxy2 {
	//动态代理需要解决三件事：	  目标对象/被代理对象是谁		如何获取代理对象	代理要做什么
	
	//目标对象是谁 ：算术计算器对象
	private ArithmeticCalculator target;

	public ArithmeticCalculatorProxy2(ArithmeticCalculator target) { 
		super();
		this.target = target;
	}
	
	
	//获取代理对象的方法
	public Object getProxy()  throws Exception{
		
		//代理对象
		Object proxy;
		
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = target.getClass().getInterfaces();
		
		Class proxyClass = Proxy.getProxyClass(loader, interfaces);
		 
		//Class 创建对象？  newInstance()代理类没有无参数构造器
		Constructor con = 
				proxyClass.getDeclaredConstructor(InvocationHandler.class);
		
		proxy = con.newInstance(new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//获取方法的名字
				String methodName = method.getName();
				
				//记录日志
				System.out.println("LogginProxy==> The Method " + methodName + " begin with "+ Arrays.asList(args));
				
				//将方法的调用转回到目标对象上。
				Object result = method.invoke(target, args);  // 目标对象执行目标方法。 相当于执行ArithmeticCalculatorImpl中的+ - * /
				
				//记录日志
				System.out.println("LogginProxy==> The Method " + methodName + " end with " + result);
				
				return result;
			}
		});
		
		
		return proxy;
	}
	
	
	
	
	
	
	
	
	
	
}

























