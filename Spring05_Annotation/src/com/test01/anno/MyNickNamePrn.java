package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// <bean id="myNickNamePrn" class="com.test01.anno.MyNickNamePrn" >
@Component
public class MyNickNamePrn {

	// autowire="default" 
	@Autowired
	private NickName nickName;

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "내 별명은 " + nickName + "입니다.";
	}
	
	
}
