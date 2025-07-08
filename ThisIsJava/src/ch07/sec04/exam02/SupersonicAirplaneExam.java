package ch07.sec04.exam02;

public class SupersonicAirplaneExam {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();	//자식에 없으므로 부모꺼 인식 -> 부모보다 자식 먼저 인식!
		sa.fly();	//자식의 fly
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
