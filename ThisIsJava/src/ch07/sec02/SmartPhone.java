package ch07.sec02;

public class SmartPhone extends Phone {		//extends 가 있어서 부모 클래스의 모든 것 사용 가능
	//super();		안보이지만 들어가 있다(생략 가능하기 때문) -> Phone phone = new Phone();을 의미		부모클래스의 생성자
	public boolean wifi;
	public SmartPhone(String model, String color) {
		//super(); 생략 된 것
		this.model = model;
		this.color = color;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}

}
