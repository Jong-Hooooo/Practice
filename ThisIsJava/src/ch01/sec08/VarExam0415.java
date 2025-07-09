package ch01.sec08;

public class VarExam0415 {

	public static void main(String[] args) {
		// 실수타입 예재
		int x = 10;
		boolean result = (x == 10);
		boolean result1 = (x != 20);
		System.out.println("result: " + result);
		System.out.println("result1: " + result1);
		
		//자동 타입 변환 예재
		char charValue = 'A';
		int intValue = charValue;
		System.out.println("intValue: " + intValue);
		
		byte byteValue = 10;
		int intValue1 = byteValue;
		System.out.println("intValue1: " + intValue1);
		
		char charValue1 = '가';
		intValue1= charValue1;
		System.out.println("가의 유니코드: " + intValue1);
		
		intValue1 = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		
		//강제 타입 변환 예재
		int var = 10;
		byte var1 = (byte) var;
		System.out.println(var1);
		
		long var2 = 300;
		int var3 = (int) var2;
		System.out.println(var3);
		
		int var4 = 65;
		char var5 = (char) var4;
		System.out.println(var5);
		
		double var6 = 3.14;
		int var7 = (int) var6;
		System.out.println(var7);
		
		
		//연산식 자동 타입 변환 예재
		byte result2 = 10 + 20;
		System.out.println(result2);
		
		byte v1 = 10;
		byte v2 = 20;
		int result3 = v1 + v2;
		System.out.println(result3);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result4 = v3 + v4 + v5;
		System.out.println("result4: " + result4);
		
		char v6 = 'Q';
		char v7 = 1;
		int result5 = v6 + v7;
		System.out.println("result5: " + result5);
		System.out.println("result5: " + (char)result5);
		
		int v8 = 10;
		int result6 = v8 / 4;
		System.out.println("result6: " + result6);
		
		int v9 = 10;
		double result7 = v9 / 4.0;
		System.out.println("result7: " + result7);
		
		int v10 = 1;
		int v11 = 2;
		double result8 = (double) v10 / v11;
		System.out.println("result8: " + result8);
		
		
		//문자열을 기본 타입으로 변환 예재
		//문자 -> 숫자
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		//숫자 -> 문자
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println(str1 + 10);
		System.out.println(str2 + 10);
		System.out.println(str3 + 10);
		
	}

}
