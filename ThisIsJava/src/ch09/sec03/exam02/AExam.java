package ch09.sec03.exam02;

public class AExam {

	public static void main(String[] args) {
	
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(b.field2);
		b.method2(); 

	}

}
