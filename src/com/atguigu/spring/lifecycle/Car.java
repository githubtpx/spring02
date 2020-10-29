package com.atguigu.spring.lifecycle;


/**
 * 查看bean对象的生命周期
 * 	① 通过其构造器或工厂方法创建bean实例
 *	② 为bean的属性设置值和对其他bean的引用
 *	③ 调用bean的初始化方法
 *	④ bean可以使用了
 *	⑤ 当容器关闭时，调用bean的销毁方法
 *
 *
 添加bean后置处理器后bean的生命周期:
 	①通过构造器或工厂方法创建bean实例
	②为bean的属性设置值和对其他bean的引用
	③将bean实例传递给bean后置处理器的postProcessBeforeInitialization()方法
	④调用bean的初始化方法
	⑤将bean实例传递给bean后置处理器的postProcessAfterInitialization()方法
	⑥bean可以使用了
	⑦当容器关闭时调用bean的销毁方法
 */
public class Car {

	private String brand;
	private Double price;
	
	public Car() {
		System.out.println("===>1. 调用构造器创建bean对象");
	}
	
	/**
	 * bean的初始化方法
	 * 需要通过init-method配置来指定的初始化方法
	 * @return
	 */
	public void init() {
		System.out.println("===>3. 调用初始化方法");
	}
	
	/**
	 * bean的销毁方法：IOC容器关闭，bean对象执行销毁方法，销毁bean对象
	 * 需要通过destroy-method配置来指定的初始化方法
	 * @return
	 */
	public void destroy() {
		System.out.println("===>5. 调用销毁方法");
	}
	
	

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		System.out.println("===>2. 调用set方法给bean对象的属性赋值");
		this.brand = brand;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
}
