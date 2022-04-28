package com.springdemo.springcore.dibasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
 public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemo/springcore/dibasic/config.xml");
	employee emp=(employee)context.getBean("emp");
	System.out.println(emp);
}
}
