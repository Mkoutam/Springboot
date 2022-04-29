package com.springdemo.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/set/config.xml");
		CarDealer hosp = (CarDealer) context.getBean("hosp");
		System.out.println(hosp);
		System.out.println(hosp.getClass());
	}
}
