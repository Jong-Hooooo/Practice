package ch01.sec08;

public class Exam0417 {

	public static void main(String[] args) {
		// Q1
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("Q1");
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		//Q2
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println("Q2 = " + result);
		
		//Q3
		int pencils = 534;
		int students = 30;
			//학생 한명이 가지는 연필 수
		int pencilPerStudent = (pencils / students);
		System.out.println(pencilPerStudent);
		
			//남는 연필 수
		int pencilLeft = (pencils / students);
		System.out.println(pencilLeft);
		
		//Q4
		int value = 365;
		System.out.println(value - 56);
		
		//Q5
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)((lengthTop + lengthBottom) * height / 2));
		System.out.println(area);

		//Q6
		int x1 = 10;
		int y1 = 5;
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));
	}

}
