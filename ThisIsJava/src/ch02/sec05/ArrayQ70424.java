package ch02.sec05;

public class ArrayQ70424 {

	public static void main(String[] args) {
		
		int[] array = {1,5,3,8,2};
		
		int max = 0;
		
		for(int score : array) {
//			System.out.println("원래 최대값: " + max);
			if(max < score) {
				max = score;
//				System.out.println("현재 최대값: " + max);
			}
		}
		System.out.println("최대값: " + max);
		
		//최댓값은 제일 작은것과 비교
		//최솟값은 제일 큰것과 비교
	}

}
