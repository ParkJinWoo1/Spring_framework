package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/ApplicationContext.xml");
		
		TV samsong = (TV) factory.getBean("samsong");
		samsong.powerOn();
		
	}
}