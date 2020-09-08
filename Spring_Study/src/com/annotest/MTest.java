package com.annotest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/annotest/ApplicationContext.xml");
		
		MyFood myfood = (MyFood) factory.getBean("myFood");
		System.out.println(myfood);
	}
}
