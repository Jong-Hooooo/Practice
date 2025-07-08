package ch01.sec08;

public class IfExam0416 {

	public static void main(String[] args) {
		// 변수 사용 범위 예재
		int v1 = 15;
		int v2 = 0;
		
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}
