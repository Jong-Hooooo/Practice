package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	//자식 생성자선언
	public SmartPhone (String model, String color) {
		super(model, color);	//부모에 매개변수(String model, String color)가 있기 때문에 생략 x
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
}
}
