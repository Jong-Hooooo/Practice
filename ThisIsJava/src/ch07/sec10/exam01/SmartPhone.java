package ch07.sec10.exam01;

public class SmartPhone extends Phone{

	SmartPhone(String owner){
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 겁색을 합니다.");
	}
}
