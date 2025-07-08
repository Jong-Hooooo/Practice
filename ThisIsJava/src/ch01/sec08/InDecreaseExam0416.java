package ch01.sec08;

public class InDecreaseExam0416 {

	public static void main(String[] args) {
		// 부호, 증감 연산자
		//변수 단독 증감 연산자 -> 변수 앞뒤 어디든 값 동일
		//변수 여러개 증감 연산자 -> 연산자 위치에따라 값 다름
		int x = 10;
		int y = 10;
		int z;
		
		x++;	//11
		++x;	//12
		System.out.println("x= " + x);
		System.out.println("------------------");
		y--;	//9
		--y;	//8
		System.out.println("y= " + y);
		
		System.out.println("------------------");
		z = x++;	//z 12	x 13
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z = ++x;	//z 14	x 14
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------");
		z = ++x + y++;	//z 15+8 23		x 15	y 9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		//산술 연산자
		//나머지 % 는 정수 (제일 많이 씀)
		byte v1 = 10;
		byte v2 = 4;
		byte v3 = 5;
		long v4 = 10L;
		
		int result = v1 + v2;
		System.out.println(result);
		
		long result2 = v1 + v2 - v4;
		System.out.println(result2);
		
		double result3 = (double) v1 / v2;
		System.out.println(result3);
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
		
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean result5 = num1 == num2;
		boolean result6 = num1 != num2;
		boolean result7 = num1 <= num2;
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result8 = (char1 < char2);
		System.out.println("result8: " + result8);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result9 = (num3 == num4);
		System.out.println("result9: " + result9);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result10 = (num5 == num6);
		boolean result11 = (num5 == (float)num6);
		System.out.println("result10: " + result10);
		System.out.println("result11: " + result11);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result12 = (str1.equals(str2));
		boolean result13 = (!str1.equals(str2));
		System.out.println("result12: " + result12);
		System.out.println("result13: " + result13);

	}

}
