package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/ApplicationContext.xml");
		
		Engineer lee = (Engineer) factory.getBean("leess");
		System.out.println(lee);
		
		Developer park = (Developer) factory.getBean("parks");
		System.out.println(park);
	}
}
