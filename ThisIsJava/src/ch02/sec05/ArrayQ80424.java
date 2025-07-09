package ch02.sec05;

public class ArrayQ80424 {

	public static void main(String[] args) {
		
//		//1반 합
//	int class1Sum = 0;
//	for(int i = 0; i < array2[0].length; i++) {
//		class1Sum = class1Sum + array2[0][i];
//	}
//		//2반 합
//	int class2Sum = 0;
//	for(int i = 0; i < array2[1].length; i++) {
//		class2Sum = class2Sum + array2[1][i];
//	}
//	
//		//전체 합
//	int sum = 0;
//	for(int array3 : array2[0]) {
//		sum = sum + array3;
//	}
//	System.out.println("첫번째 점수 총합: " + sum);
//	
//		//전체 평균
//	int totalStu = 0;
//	int totalSum = 0;
//	for(int i = 0; i < array2.length; i++) {
//		totalStu = totalStu + array2[i].length;
//		for(int k = 0; k < array2[i].length; k++) {
//			totalSum = totalSum + array2[i][k];
//		}
//	}
//	double totalAvg = (double) total
		int[][] array = { 
				{95,86}, 
				{83,92,96}, 
				{78,83,93,87,88} 
		};
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			count = count + array[i].length;
		
			for(int k = 0; k < array[i].length; k++){
				sum = sum + array[i][k];	//0 0 01 10 11 12 20 21 22 23 24
			}
		}
			System.out.println("합계: " + sum);
			System.out.println("배열의 합계: " + count);
			double avg = (double) sum / count;
			System.out.println("평균: " + avg);
	}

}
