package ch02.sec05;

public class ArrayExam0423 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1차원 배열의 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열의 길이(첫번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열의 길이(두번째 반의 학생 수): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		
		int class1Sum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			class1Sum = class1Sum + scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("2차원 배열의 길이(첫 번째 반의 학생 수): " + class1Avg);
		
		int class2Sum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			class2Sum = class2Sum + scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("2차원 배열의 길이(두 번째 반의 학생 수): " + class2Avg);
		
		int totalStu = 0;
		int sum = 0;
		for(int i = 1; i < scores.length; i++) {
			totalStu = totalStu + scores.length
			
			for(int j = o; j < scores.length; j++) {
			}
		}
	}

}
