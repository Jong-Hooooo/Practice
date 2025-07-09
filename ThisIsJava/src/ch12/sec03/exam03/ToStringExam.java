package ch12.sec03.exam03;

public class ToStringExam {

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("삼성", "안드로이드");
		
		String strObj = sm.toString();
		System.out.println(strObj);
		
		System.out.println(sm);
	}

}
