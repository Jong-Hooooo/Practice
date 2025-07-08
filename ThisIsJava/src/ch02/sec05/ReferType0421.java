package ch02.sec05;

import java.util.Scanner;

public class ReferType0421 {

	public static void main(String[] args) {
		// 전시간 복습
		
		//점수가 90점 이상일때 A, 90점 미만일때 B 
		//조건이 하나 -> a에 조건(90점 이상)이 하나 결과는 둘 (조건과 결과를 나누어보고 식 세우기)
//	    if(조건식 대답은 true or false) {
//	    	true일때 실행문;
//	    }else {
//	    	false일때 실행문;
		
		int score = 90;
		if(score >= 90) {
			System.out.println('A');
		}else {
			System.out.println('B');
		}
		//if 조건문
		//for while 반복문
//		for(초기값; 조건값; 증감식) {
//			실행문;
//		}
		//초기값 -> 조건값 -> 실행문 ->증감식 -> 조건식 -> 실행문 -> 증감식 -> 조건문 -> 실행문 -> 증감식 
		//->조건식 -> 실행문 -> 증감식 -> 조건식 -> 실행문 -> 증감식 -> 조건식(false) -> for문 빠져나가기
		
		//초기->조건->실행문(초기->조건->실행->증감->조건->실행->증감->조건->실행->증감->조건(false))->for문 빠져나가기
		//->증감->조건->실행문(초기->조건->실행->증감->조건->실행->증감->조건->실행->증감->조건(false))->for문 빠져나가기
		//1~10까지의 합계
		
		
		//참조타입 변수
		//참조 타입의 변수를 ==주소가 같은지 같은 객체인지 묻는 것
		
		//[]배열
		//데이터 여러개 가능하다는 표시
		int[] arr1;  //int띄어쓰기[] ->x
		//원래 int arr4; -> 데이터 하나만 가능
		int[] arr2;
		int[] arr3;
		
		int arr4;
		int arr5;
		arr4 = 10;
		arr5 = arr4;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		
	    //null
		String hobby = "여행";
		hobby = null;   //null을 넣어서 "여행"은 필요없는 쓰레기 객체가 되어버림
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;   //kind1은 null로 인해 비어있고 kind2만 자동차를 가리키게 된다.
		
		System.out.println("kind2 : " + kind2);
		
		int[] arr6 = new int[] {1,2,3};
		Scanner scanner = new Scanner(System.in);
		
		//문자열 비교
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열 같음");
		}
		
		String hobby1 = "";
		if(hobby1.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
		
		//문자 추출
		
		
		
		
		
		
		
		
		

	    }
		
	}
