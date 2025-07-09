package ch02.sec05;

public class ArrayStr0424 {

	public static void main(String[] args) {
		//객체를 참조하는 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
		//배열 항목 반복을 위한 향상된 for문
		//for(초기값 ; 조건식 ; 증감식){실행문}
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		//향상된 for문(차피 int i = 0 에서 0에서 시작하는건 변치않은 정해진건데 굳이 매번 적어야할까?) -> 배열을 이용하여 반복할 때 씀
		//for(배열값을 가져다넣을 변수 : 배열변수){실행문}
		int[] scores1 = {95,71,84,93,87};
		int sum1 = 0;
		for(int score : scores1) {
			System.out.println(score);
			sum1 = sum1 + score;
		}
		System.out.println("행상된 for문 합계" + sum1);
		
		double avg = (double) sum1 / scores1.length;
		System.out.println(avg);
		
		//main 메소드의 string 매개변수 용도
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		
	}

}
