package com.atguigu.spring.aop.proxy;

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
public class ArithmeticCalculatorProxy {
	//动态代理需要解决三件事：	  目标对象/被代理对象是谁		如何获取代理对象	代理要做什么
	
	//目标对象是谁 ：算术计算器对象
	private ArithmeticCalculator target;

	public ArithmeticCalculatorProxy(ArithmeticCalculator target) {
		super();
		this.target = target;
	}
	
	
	//获取代理对象的方法
	public Object getProxy() {
		
		//代理对象
		Object proxy;
		
		/**
		 * loader：  ClassLoader对象。类加载器对象。      帮我们加载动态生成的代理类	
		 * 		   (动态代理：动态的生成一个代理类，类就需要类加载 )。
		 * interfaces： 接口们。  提供目标对象的所有接口。      目的是让代理对象保证与目标对象都有接口中相同的方法。
		 * h：  InvocationHandler接口类型对象。
		 */
		
		ClassLoader loader = target.getClass().getClassLoader();
		
		Class[] interfaces = target.getClass().getInterfaces();
		
		proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			/**
			 * invoke方法：     代理对象调用代理方法，会回来调用invoke方法。		完成动态代理整个过程需要在invoke方法里编写。
			 * 
			 * 代理对象如何完成代理的功能 ，代理对象你能做什么事呢？        都是 在invoke方法编写。
			 */
			
			/*
			 * proxy ：     代理对象 ，在invoke方法中一般不会使用。
			 * 
			 * method ：   正在被调用的方法对象。
			 * 
			 * args[] ：   正在被调用的方法的参数。
			 * 
			 * 绕啊绕！
				1) 我生成代理对象proxy时候，需要在 Proxy.newProxyInstance方法参数中传一个InvocationHandler对象.
				2) 而InvocationHandler对象里面，它的invoke方法参数需要传一个代理对象。
			 */
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


/**
 *  模拟底层生成的动态代理类：com.sun.proxy.$Proxy0
 */
class $Proxy0 extends Proxy implements ArithmeticCalculator{
	
	protected $Proxy0(InvocationHandler h) {
		super(h);
	}

	@Override
	public int add(int i, int j) {
//		return super.h.invoke(this, 方法对象, 方法参数);
		return 0;
	}

	@Override
	public int sub(int i, int j) {
		return 0;
	}

	@Override
	public int mul(int i, int j) {
		return 0;
	}

	@Override
	public int div(int i, int j) {
		return 0;
	}
	
}
























