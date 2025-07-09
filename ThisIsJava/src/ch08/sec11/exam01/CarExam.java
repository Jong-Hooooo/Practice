package ch08.sec11.exam01;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		
		car.tire1 = new KumhoTire();
		car.tire2 = new KumhoTire();
		
		car.run();
	}

}
