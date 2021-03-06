package com.test01;


import org.springframework.stereotype.Component;

@Component("messagebeanimpl")
public class MessageBeanImpl implements MessageBean {

	private String fruit;
	private int cost;
	
	
	public MessageBeanImpl() {
		this.fruit = "apple";
		this.cost = 1000;
	}
	
	
	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}
	
	@Override
	public void sayHello() {
		System.out.printf("과일 : %s \t 가격 : %d\n", fruit, cost);
	}

}
