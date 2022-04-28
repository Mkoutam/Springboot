package com.springdemo.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/list/config.xml");
		hospital hosp = (hospital) context.getBean("hosp");
		System.out.println(hosp);
	}
}
