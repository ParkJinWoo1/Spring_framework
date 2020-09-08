package com.annotest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFood {

	@Autowired
	private Food myfood;

	public MyFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyFood(Food myfood) {
		super();
		this.myfood = myfood;
	}

	@Override
	public String toString() {
		return "MyFood [내가제일 좋아하는것" + myfood + "]";
	}
	
	
}
