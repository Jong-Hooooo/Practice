package ch16.sec05.exam01;

public class MethodReferenceExam {

	public static void main(String[] args) {

		Person person = new Person();
		
//		person.action(() -> Computer.staticMethod(x, y));
//		person.action(Computer.staticMethod(x, y));
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		
//		person.action(() -> com.instanceMethod(x, y));
//		person.action(com.instanceMethod(x, y));
		person.action(com :: instanceMethod);
	}

}
