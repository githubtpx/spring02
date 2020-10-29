package com.atguigu.spring.lifecycle;


/**
 * �鿴bean�������������
 * 	�� ͨ���乹�����򹤳���������beanʵ��
 *	�� Ϊbean����������ֵ�Ͷ�����bean������
 *	�� ����bean�ĳ�ʼ������
 *	�� bean����ʹ����
 *	�� �������ر�ʱ������bean�����ٷ���
 *
 *
 ���bean���ô�������bean����������:
 	��ͨ���������򹤳���������beanʵ��
	��Ϊbean����������ֵ�Ͷ�����bean������
	�۽�beanʵ�����ݸ�bean���ô�������postProcessBeforeInitialization()����
	�ܵ���bean�ĳ�ʼ������
	�ݽ�beanʵ�����ݸ�bean���ô�������postProcessAfterInitialization()����
	��bean����ʹ����
	�ߵ������ر�ʱ����bean�����ٷ���
 */
public class Car {

	private String brand;
	private Double price;
	
	public Car() {
		System.out.println("===>1. ���ù���������bean����");
	}
	
	/**
	 * bean�ĳ�ʼ������
	 * ��Ҫͨ��init-method������ָ���ĳ�ʼ������
	 * @return
	 */
	public void init() {
		System.out.println("===>3. ���ó�ʼ������");
	}
	
	/**
	 * bean�����ٷ�����IOC�����رգ�bean����ִ�����ٷ���������bean����
	 * ��Ҫͨ��destroy-method������ָ���ĳ�ʼ������
	 * @return
	 */
	public void destroy() {
		System.out.println("===>5. �������ٷ���");
	}
	
	

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		System.out.println("===>2. ����set������bean��������Ը�ֵ");
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
