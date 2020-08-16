package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/ApplicationContext.xml");
		
		Emp yoon = (Emp)factory.getBean("Yoon");
		System.out.println(yoon);
		Emp jeong = (Emp)factory.getBean("Jeong");
		//Emp jeong = factory.getBean("Jeong", Emp.class);로 선언 가능
		System.out.println(jeong);
	}
}
