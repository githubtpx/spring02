package com.atguigu.spring.autowire;

public class Person {
	//�������������Զ�װ�䣬��Ҫ�ֶ�ָ�� 
	private String name;
	
	//�������͵����ԣ�����autowire�Զ�װ���
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
