package com.test01.anno;

import org.springframework.stereotype.Component;

// <bean id="nickName" class="com.test01.anno.NickName"/>
@Component
public class NickName {

	public String toString() {
		return "짱진구";
	}
}
