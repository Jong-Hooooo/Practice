package Lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoA {

	public static void main(String[] args) {

		int[] selectNumber = new int[6];
		Random random = new Random(2);
		System.out.println("선택번호: ");
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;   //시작번호 알려줘야하므로
//			int num = (int) (Math.random() * 45) + 1;   //Random random = new Random();랑 같다
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] winningNumber = new int[6];
		random = new Random(2);
		System.out.println("당첨번호: ");
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;  //시작번호 알려줘야하므로
//			int num = (int) (Math.random() * 45) + 1;
			System.out.println(winningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등 당첨");
		}else {
			System.out.println("꽝");
		}
	}

}
