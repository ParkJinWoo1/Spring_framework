package com.test06;

public class BeanFactory {

	Object getBean(String beanName) {
		
		if(beanName.equals("samsong")) {
			return new SamsongTV();
		}else if(beanName.equals("ip")) {
			return new ipTV();
		}
		
		return null;
	}
}
