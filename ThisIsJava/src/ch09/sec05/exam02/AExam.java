package ch09.sec05.exam02;

public class AExam {

	public static void main(String[] args) {
		A a = new A();
		
		a.useB();
		
		
		//static class A{} 는 A a = new A();로 가져오지만
		//class A{} 라는 인스턴스 클래스는 
		//A a = new A(); 로 가져오려는 클래스를 객체 선언 한 뒤
		//A.B b = a.new B(); 로 가져온다
	}
}
