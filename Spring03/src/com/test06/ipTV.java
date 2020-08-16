package com.test06;

public class ipTV implements TV {

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
