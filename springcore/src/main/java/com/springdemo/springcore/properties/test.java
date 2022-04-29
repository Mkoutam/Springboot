package com.springdemo.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/properties/config.xml");
		Locations Location= (Locations) context.getBean("Location");
		System.out.println(Location);
		System.out.println(Location.getDialect().getClass());
	}
}
