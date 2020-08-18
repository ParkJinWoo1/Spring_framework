package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String name;
	private String addr;
	private String phone;
	
	public Address() {

	}
	@Autowired
	public Address(@Qualifier("a")String name,@Qualifier("b") String addr,@Qualifier("c") String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String toString() {
		return "이름 : " + name + "\t 주소 : " + addr + "\t 전화번호 : " + phone;
	}
}
