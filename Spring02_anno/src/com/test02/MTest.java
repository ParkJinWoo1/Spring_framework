package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/UserAddress.xml");
		
		Address addr1 = (Address) factory.getBean("address");
		
		//return "이름 : " + name + "\t 주소 : " + addr + "\t 전화번호 : " + phone;
		//이미 리턴으로 반환이 되어 있는데 콘솔에서 확인을 하려면 syso문으로 변수를 찍어서 보여줘야함!!!!
		
		
		System.out.println(addr1);
		
		
	}
}
