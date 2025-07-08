package ch02.sec05;

public class Array042223 {

	public static void main(String[] args) {
		// 배열 타입
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		

		
		
		int[] scores;
		scores = new int[] {89, 90, 87};
		//배열의 항목이 가지고 있는 값의 합계를 구하시오
		int sum1 = 0;	//합계를 구할 변수를 선언한다
		
		for(int i = 0; i <scores.length; i++) {
			sum1 = sum1 + scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		//배열은 값이 하나가 들어간다
		
		int[] num5 = new int[30];
		System.out.println(num5[0]);
		num5[0] = 20;
		System.out.println(num5[0]);
		
		
		int[] arr1 = new int[3];
		
		arr1[0] = 0;
		arr1[1] = 1;
		arr1[2] = 2;
		System.out.println("직접 입력 : " + arr1[0]);
		System.out.println("직접 입력 : " + arr1[1]);
		System.out.println("직접 입력 : " + arr1[2]);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i] + "' ");
			//"arr1[" + i + "] : " + arr1[0] arr1[1] : 0 arr1 ?
			//							ㄴ>arr1의 0번지
		}
		
		System.out.println();
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3 ; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		double[] arr2 = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		
		//배열 길이
		//변수이름.length()  변수가 가지고 있는 데이터 문자의 길이 (변수 안에 변수가 가지고 있는 길이를 구하는 것)
		//배열변수이름.length()  배열변수의 길이 (배열이 몇개짜리인지)
		
		//다차원 배열
		int[][] scores1 = {
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1차원 배열 길이(줄의 갯수): " + scores1.length);		//	배열이 몇줄짜리인지 행이 몇개인지 -> 행
		System.out.println("2차원 배열 길이(칸의 갯수): " + scores1[0].length);	// 첫번째 줄이 몇칸짜리 배열인지, 칸이 몇개인지 -> 열 
		System.out.println("2차원 배열 길이(칸의 갯수): " + scores1[1].length);
		
		//첫번째 반의 평균구하기
		//첫번째 불의 평균 구하기		첫번째 줄의 합계 구하기		첫번째 줄의 갯수
		int class1Sum = 0;
		for(int i = 0; i < scores1[0].length; i++) {
			class1Sum = class1Sum + scores1[0][i];
		}
		double class1Avg = (double)class1Sum / scores1[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		int class2Sum = 0;
		for(int i = 0; i < scores1[1].length; i++) {
			class2Sum = class2Sum + scores1[1][i];
		}
		double class2Avg = (double)class2Sum / scores1[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		//전체 학생의 평균 구하기
		//반복
		int totalStu = 0;
		int totalSum = 0;
		for(int i = 0; i < scores1.length; i++) {		//바깥쪽 for문은 줄 번호를 구하는 것 
			totalStu = totalStu + scores1[i].length;	//줄별로 칸의 갯수 더하기 
														// 실제 몇명인지는 줄이 중요한게 아닌 칸이 몇칸인지만 알면 된다. -> 몇줄의 누구가 알고싶은게 아닌 총 몇명인지가 궁금한것
//			System.out.println(i+1 + "번째 줄의 학생 수: " + scores1[i].length);		//각 줄의 학생 수
//			System.out.println(i+1 + "번째 줄까지의 학생 수: " + totalStu);				//i+1에서 +1은 결과값이 0번째 줄이 아닌 1번째 줄이라고 나오게 하기 위해 적용한 것
			
			for(int j = 0; j < scores1[i].length; j++) {
				totalSum = totalSum + scores1[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalStu;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
		
		
		//new 연산자 다차원 배열
		
		
		
		
		
		
		
		
		
		
	}

}
