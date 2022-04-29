package com.springdemo.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/map/config.xml");
		customer cust= (customer) context.getBean("cust");
		System.out.println(cust);
		System.out.println(customer.getProducts().getClass());
	}
}
