package com.annotest02;

import org.springframework.stereotype.Component;

@Component
public class Soju implements Drink {

	@Override
	public void dink() {
		System.out.println("내가 좋아하는 음료수는 소주다!");
	}

}
