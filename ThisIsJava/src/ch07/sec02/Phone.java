package ch07.sec02;

public class Phone {
	//Phone(){			기본 생성자(자동으로 들어가는 데 생략 된 것)
	//}
	public String model;	//public 패키지랑 상관없이 가져다 쓸 수 있음
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	}