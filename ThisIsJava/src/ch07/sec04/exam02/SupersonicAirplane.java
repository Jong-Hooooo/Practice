package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
	//상수 선언
	public static final int NORMAL = 1;			//static 상수 -> static final 대문자
	public static final int SUPERSONIC = 2;		//변수가 변하는 값 그냥 int age
	//필드 선언
	public int flyMode = NORMAL;				//이게 exam에 있는 9번 출력문
	//메소드 재정의
	@Override   //생략 가능
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();	//부모가 가지고 있는 걸 가져올 수 o
							//super가 없으면 11번의 fly가 되는 것
		}
	}
}
