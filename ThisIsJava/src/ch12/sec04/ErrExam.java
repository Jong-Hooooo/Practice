package ch12.sec04;

public class ErrExam {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("loo");
		}catch(NumberFormatException e) {
			System.out.println("[에러 내용]");
			System.out.println(e.getMessage());
		}

	}

}
