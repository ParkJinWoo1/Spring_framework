package com.annotest02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/annotest02/ApplicationContext.xml");
		
		Drink soju = (Drink) factory.getBean("soju");
		soju.dink();
	}
}
