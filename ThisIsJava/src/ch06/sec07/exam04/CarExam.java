package ch06.sec07.exam04;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();	//Car 클래스의 10번 생성자
		System.out.println("회사: "+ car.company);
		System.out.println("모델: " + car.model);
		System.out.println("색상: "+ car.color);
		System.out.println("속도: " + car.maxspeed);
		System.out.println();
		
		Car car1 = new Car("그랜져");		//12번 생성자
		System.out.println("회사: " + car1.company);
		System.out.println("모델: " + car1.model);
		System.out.println("색상: " + car1.color);
		System.out.println("속도: " + car1.maxspeed);
		System.out.println();
		
		Car car2 = new Car("그랜져", "검정");		//16번 생산자
		System.out.println("회사: " + car2.company);
		System.out.println("모델: " + car2.model);
		System.out.println("색상: " + car2.color);
		System.out.println("속도: " + car2.maxspeed);
		System.out.println();
		
		Car car3 = new Car("그랜져", "검정", 200);		//21번 생산자
		System.out.println("회사: " + car3.company);
		System.out.println("모델: " + car3.model);
		System.out.println("색상: " + car3.color);
		System.out.println("속도: " + car3.maxspeed);

	}

}
