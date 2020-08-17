package com.test02;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String name;
	private String addr;
	private String phone;
	
	public Address() {
//		this.name = "박";
//		this.addr = "중랑";
//		this.phone = "010-000-0000";
	}
	public Address(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String toString() {
		return "이름 : " + name + "\t 주소 : " + addr + "\t 전화번호 : " + phone;
	}
}
