package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/ApplicationContext.xml");
		
		Engineer eng = (Engineer) factory.getBean("parks");
		System.out.println(eng);
		
		Developer dev = (Developer) factory.getBean("kims");
		System.out.println(dev);
	}
}
