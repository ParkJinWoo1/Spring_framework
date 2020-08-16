package com.test07;

public class ipTV implements TV {

	public ipTV() {
		System.out.println("ipTV 생성!");
	}
	@Override
	public void powerOn() {
		System.out.println("ip tv power on");

	}

	@Override
	public void powerOff() {
		System.out.println("ip tv power off");

	}

	@Override
	public void volumeUp() {
		System.out.println("ip tv volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("ip tv volume down");

	}

}
