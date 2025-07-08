package ch01.sec08;

public class IfExam0416Q11 {

	public static void main(String[] args) {
		
		int v1 = 1;
		int v2 = 0;
		int v3 = 0;
		System.out.println("v1: " + v1);
		
		if(true) {
			v2 = 2;
		if(true) {
			v3 = 2;
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			System.out.println("v3: " + v3);
		}
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		}
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
	}

}
