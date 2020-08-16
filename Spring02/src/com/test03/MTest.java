package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/ApplicationContext.xml");
		
		Address addr1 = (Address) factory.getBean("lee");
		System.out.println(addr1);
		
		Address addr2 = (Address) factory.getBean("hong");
		System.out.println(addr2);
		
		((ClassPathXmlApplicationContext)factory).close();
		//일반적으로 객체를 생성하고 객체를 닫아주는데 변수.close();는 사용할 수 없다 -> close메소드가 없기 때문
		//ClassPathXmlApplicationContext는 close메소드가 오버라이드 되어있기 때문에 close메소드 사용가능
	}
}
