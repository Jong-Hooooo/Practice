package ch06.sec09;

import java.util.Scanner;

public class Contents0428 {

	public static void main(String[] args) {
		// 인스턴스 멤버
		//객체를 생성해야만 사용할 수 있는 멤버
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		scanner.nextLine();
		
		//정적 멤버
		//객체 없이도 사용 할 수 있는 멤버
		//정적 필드, 정적 메소드로 선언하려면 static을 추가한다
		//static은 Car car = new Car(); 필요없다
		
		//인스턴스 필드		new 객체를 생성해야 사용 가능
		
		//인스턴스 메소드	new 객체를 생성해야 사용 가능
		
		//정적 메소드 new 객체를 만들지 않고 클래스 이름, 메소드 이름으로 호출해서 사용 가능
		
	}

} 