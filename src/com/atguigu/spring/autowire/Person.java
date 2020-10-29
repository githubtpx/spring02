package com.atguigu.spring.autowire;

public class Person {
	//字面量：不能自动装配，需要手动指定 
	private String name;
	
	//对象类型的属性：可以autowire自动装配的
	private Car car;
	
	private Address address;
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", address=" + address + "]";
	}
	
	
	
	
}
