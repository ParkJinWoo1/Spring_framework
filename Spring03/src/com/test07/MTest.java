package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/ApplicationContext.xml");
		
		System.out.println("Spring Bean Container 생성!");
		
		ipTV ip = (ipTV) factory.getBean("ip");
		ip.powerOn();
		//ip.powerOff();
		//ip.volumeUp();
		//ip.volumeDown();
		
		//SamsongTV samsong = (SamsongTV) factory.getBean("samsong");
		//samsong.powerOn();
		//samsong.powerOff();
		//samsong.volumeUp();
		//samsong.volumeDown();
	}
}
