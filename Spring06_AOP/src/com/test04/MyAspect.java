package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("출석카드를 찍는다.");
	}
	
	@After("execution(public String *(..))")
	public void after(JoinPoint join) {
		System.out.println("집에간다.");
	}
	
	//target에서 정상적으로 동작하지 않을 때, 밑에 returning을 받지 못하고
	//예외처리를 하여 동작한다.
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는날이었다.");
	}
	
	//target 정상적으로 작동 후, return해주는 값을 받아서 동작
															//target
	@AfterReturning(pointcut = "execution(public * *(..))", returning = "returnVal")
	public void returning(JoinPoint join, Object returnVal) {
		System.out.println(returnVal + "공부하는 날이었다.");
	}
}
