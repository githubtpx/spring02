package com.atguigu.spring.aop.proxy;

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
public class ArithmeticCalculatorProxy {
	//��̬������Ҫ��������£�	  Ŀ�����/�����������˭		��λ�ȡ�������	����Ҫ��ʲô
	
	//Ŀ�������˭ ����������������
	private ArithmeticCalculator target;

	public ArithmeticCalculatorProxy(ArithmeticCalculator target) {
		super();
		this.target = target;
	}
	
	
	//��ȡ�������ķ���
	public Object getProxy() {
		
		//�������
		Object proxy;
		
		/**
		 * loader��  ClassLoader���������������      �����Ǽ��ض�̬���ɵĴ�����	
		 * 		   (��̬������̬������һ�������࣬�����Ҫ����� )��
		 * interfaces�� �ӿ��ǡ�  �ṩĿ���������нӿڡ�      Ŀ�����ô������֤��Ŀ������нӿ�����ͬ�ķ�����
		 * h��  InvocationHandler�ӿ����Ͷ���
		 */
		
		ClassLoader loader = target.getClass().getClassLoader();
		
		Class[] interfaces = target.getClass().getInterfaces();
		
		proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			/**
			 * invoke������     ���������ô����������������invoke������		��ɶ�̬��������������Ҫ��invoke�������д��
			 * 
			 * ������������ɴ���Ĺ��� ���������������ʲô���أ�        ���� ��invoke������д��
			 */
			
			/*
			 * proxy ��     ������� ����invoke������һ�㲻��ʹ�á�
			 * 
			 * method ��   ���ڱ����õķ�������
			 * 
			 * args[] ��   ���ڱ����õķ����Ĳ�����
			 * 
			 * �ư��ƣ�
				1) �����ɴ������proxyʱ����Ҫ�� Proxy.newProxyInstance���������д�һ��InvocationHandler����.
				2) ��InvocationHandler�������棬����invoke����������Ҫ��һ���������
			 */
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


/**
 *  ģ��ײ����ɵĶ�̬�����ࣺcom.sun.proxy.$Proxy0
 */
class $Proxy0 extends Proxy implements ArithmeticCalculator{
	
	protected $Proxy0(InvocationHandler h) {
		super(h);
	}

	@Override
	public int add(int i, int j) {
//		return super.h.invoke(this, ��������, ��������);
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
























