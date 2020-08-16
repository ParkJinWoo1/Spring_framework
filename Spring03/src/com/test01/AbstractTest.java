package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class AbstractTest {

	public abstract String dayInfo();
	
								//singletone pattern : 메모리에 단 하나의 객체만 존재하게 함 
								//ex: 캘린더 클래스
	public static AbstractTest getInstance() {
				//나 객체를 만들어서 리턴해줄게
		
		GregorianCalendar cal = new GregorianCalendar();
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		
		//다형성에 의해서 자식 타입 객체가 부모타입 객체를 상속받을 수 있음
		switch(day) {
		case 1: return new Sunday();
		case 2: return new Monday();
		case 3: return new Tuesday();
		case 4: return new Wednesday();
		case 5: return new Thursday();
		case 6: return new Friday();
		case 7: return new Saturday();
		}
		
		return null;
	}
}
