package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/ApplicationContext.xml");
		
		Engineer eng = (Engineer) factory.getBean("Jeong");
		System.out.println(eng);
		
		Developer dev = (Developer) factory.getBean("Yoon");
		System.out.println(dev);
	}
}
