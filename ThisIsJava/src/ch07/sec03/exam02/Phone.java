package ch07.sec03.exam02;

public class Phone {
	//필드 선언
	public String model;
	public String color;
	//매개변수를 갖는 생성자 선언
	public Phone(String model, String color) {	//매개변수가 있으므로 생성자 자동 생성 x
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
	}
		
