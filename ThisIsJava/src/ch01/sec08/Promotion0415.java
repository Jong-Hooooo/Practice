package ch01.sec08;

import java.util.Scanner;

public class Promotion0415 {

	public static void main(String[] args) {
		// 자동 타입 변환
			//데이터타팁 변수명 = 데이터타입에 맞는 데이터;
			//큰 범위의 데이터 타입 = 작은 범위의 데이터 타입;
		
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(intValue);
		
		char charValue = '가';
		System.out.println("charValue : " + charValue);
		int intValue1 = charValue;
		System.out.println("intValue1 : " + intValue1);
		
		long longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		//강제 타입 변환
		//작은 범위의 데이터 타입 = (작은 범위의 타입) 큰 범위의 데이터 타입
		//큰게 작은곳에 들어갈리 없으니 작게 쪼개어서 바꿔주기
		int intValue2 = 10;
		byte byteValue1 = (byte)intValue2;
		System.out.println(byteValue1);
		
		long var1 = 300;
		int var2 = (int) var1;
		System.out.println(var2);
		
		int var3 = 65;
		System.out.println(var3);	//65
		char var4 = (char) var3;	//A
		System.out.println(var4);
		
		int var5 = var4;	//65
		System.out.println(var5);
		
		double var6 = 3.14;
		System.out.println(var6);
		int var7 = (int)var6;
		System.out.println(var7);
		
		//예약어 쓰면 안된다.(class 이름, 메소드 이름에도 x)
		//예약어 : 만들어져 있는 단어, 자바에서 사용하고 있는 이름 ex)int, string, double,...
		//만약 예약어를 써서 오류가 생겼을 경우 변경하고자 하는 class 오른쪽 버튼 ->refactor -> rename
		//클래스 이름 첫글자 대문자 나머지 소문자
		//변수 메소드 이름 소문자로 시작 if 두 단어 이상 일 경우 붙는 단어 첫글자 대문자
		
		//연산식 자동 차입 변환
		int x = 10;
		int y = 20;
		int result1 = x + y;
		System.out.println(result1);
		
		byte x1 = 10;
		byte x2 = 20;
		int result2 = x1 + x2;	//'byte+byte'는 반드시 int -> byte 값이 변수이기 때문에 -> byte는 최대 127인데 변수를 변경하면 127이 넘을수도 있기 때문에
		System.out.println(result2);
		
		byte result3 = 10 + 20;
		System.out.println(result3);
		
		int x3 = 1;
		int y3 = 2;
		double result4 = (double)x3 / y3;
		//여기서 int는 정수이기 때문에 int x3 = 1 나누기(/) int y3 = 2는 0.5가 아닌 0이 나온다
		//그러므로 double로 바꾸고 나누면 0.5가 나온다
		//(double)->작은 허용 타입을 앞에 한번 적으면 뒤에도 한번에 적용이 된다
		System.out.println(result4);
		
		

	}

}
