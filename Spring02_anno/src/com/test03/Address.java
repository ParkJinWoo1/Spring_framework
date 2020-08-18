package com.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String name;
	private String addr;
	private String phone;
	
	public String getName() {
		return name;
	}
	@Autowired
	@Qualifier("a")
	public void setName(String name) {
		this.name = "name";
	}
	public String getAddr() {
		return addr;
	}
	@Autowired
	@Qualifier("b")
	public void setAddr(String addr) {
		this.addr = "addr";
	}
	public String getPhone() {
		return phone;
	}
	@Autowired
	@Qualifier("c")
	public void setPhone(String phone) {
		this.phone = "phone";
	}
	
	
	@Override
	public String toString() {
		return name + " \t 주소 : " + addr + "\t 전화번호 : " + phone;
	}
}
