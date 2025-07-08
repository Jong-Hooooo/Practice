package ch01.sec08;

public class Oper0417 {

	public static void main(String[] args) {
		// 대입 연산자
		int result = 0;
		result += 10;
		System.out.println("result= " + result);
		
		result -= 5;
		System.out.println("result= " + result);
		
		result *= 3;
		System.out.println("result= " + result);
		
		result /= 5;
		System.out.println("result= " + result);
		
		result %= 3;
		System.out.println("result= " + result);
		
		
		//삼항(조건) 연산자
		//조건식 ? 은 무조건 true or false로 대답
		//조건식의 대답이 true(값, 조건식, 피연산자) : 조건식의 대답이 false(값, 조건식, 피연산자)
		//삼항연산자로 만드는 식은 if 구문으로 만들 수 있다
		int score = 85;
		char grade = score > 90 ? 'A' : 'B';
		System.out.println("등급은 " + grade + " 입니다.");
		
		int score1 = 70;
		char grade1 = score1 > 90 ? 'A' : (score1 > 80 ? 'B' : 'C');
		System.out.println("등급은 " + grade1 + " 입니다.");
	}

}
