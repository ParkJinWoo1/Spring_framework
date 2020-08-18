package com.test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before("qClass()")
	public void before() {
		System.out.println("출석카드를 찍는다.");
	}
	
	@After("qClass()")
	public void after() {
		System.out.println("집에간다.");
	}
	
	//메소드가 point cut역할을 해줌
	@Pointcut("execution(public * *(..))")
	public void qClass() {
		
	}
}
