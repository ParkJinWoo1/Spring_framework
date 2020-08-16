package com.test01;



import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/ApplicationContext.xml");
		
		MyClass my = factory.getBean("myClass", MyClass.class);
		my.prn();
		
		Date date = (Date) factory.getBean("date");
		System.out.println(date);
	}
}
