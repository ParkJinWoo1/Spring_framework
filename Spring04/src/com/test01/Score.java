package com.test01;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String grade;
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math, int sum, double avg, String grade) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
		this.grade = grade;
	}

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return kor+eng+math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return getSum()/3;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		if(getAvg() >= 90) {
			return "A";
		}else if(getAvg() >= 80) {
			return "B";
		}else if(getAvg() >= 70) {
			return "C";
		}else if(getAvg() >= 60) {
			return "D";
		}else {
			return "F";
		}
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name + "\t 국어점수 : " + kor + "\t 영어점수 : " + eng + "\t 수학점수 : " + math + "\t총점 : " + getSum() + 
				"\n 평균점수 : " + getAvg() + "\t 등급 : " + getGrade();
	}
	
	
	
	
	
	
}
