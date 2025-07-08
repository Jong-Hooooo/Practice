package ch01.sec08;

public class Hello {

	public static void main(String[] args) {
//		지금부터 내가 작성하는 내용은 코드가 아니에요
//		좋은 코드는 주석처리가 많이 되어있어
//		문자는 ""안에 써요  숫자는 ""없이 그냥 써요
		
		int value1 = 10;
		int value2 = 210;
		
		int result = value1 - value2 + 30;
		System.out.println(result);
//		변수 선언
//		데이터타입 변수명 = 입력할 값;
//		선언된 변수가 가지고 있는 값 변경
//		변수명 = 변경할 값
		
		int hour = 3;
		System.out.println("변수 초기값 : " + hour);
		int minute = 5;
		hour = 20;
		System.out.println("변수 초기값 : " + hour);
		
		System.out.println(hour + " 시간" + minute + " 분");
		
		int totalminute = (hour * 60) + minute;
		System.out.println("총 " + totalminute + "분");
		

	}

}
