package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//기존 방식
		//1.
		//Resource res = new FileSystemResource("src/com/test03/beans.xml");
		//2.
		//Resource res = new ClassPathResource("com/test03/beans.xml");
		//BeanFactory factory = new XmlBeanFactory(res);	//Bean을 만들어주는애
		
	    //3. classpath(어떤경로에)에서 xml파일을 읽어와서 applicationcontext라는 객체를 만들거다 ()안에있는 경로에서!
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//그럼 com/test03/beans.xml을 읽어와서 applicationContext라는 객체를 만들어주는 것.
		//beans.xml에서 사용가능
		MessageBean english = (MessageBean)factory.getBean("bean01");
		//어떤 bean이 들어올지 몰라서 오브젝트로 받아짐
		english.sayHello("Spring");
		
		MessageBean korean = (MessageBean)factory.getBean("bean02");
		korean.sayHello("스프링");
		
		
	}

}


/*
BeanFactory -> ApplicationContext <- ClassPathXmlApplicationContext
 
 스프링의 ApplicationContext 객체는 스프링 컨테이너 인스턴스 이다.
 스프링은 ApplicationContext 인터페이스의 여러 객체를 제공한다.
ClassPathXmlApplicationContext : 지정된 ClassPath에서 Xml 파일을 읽어서 bean 생성
 */
