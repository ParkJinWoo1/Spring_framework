package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/ApplicationContext.xml");
		
		MyFood mf = (MyFood) factory.getBean("myFood");
		System.out.println(mf);
	}
}
