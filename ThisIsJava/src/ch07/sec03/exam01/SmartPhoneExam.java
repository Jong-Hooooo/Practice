package ch07.sec03.exam01;

public class SmartPhoneExam {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		//Phone으로부터 상속 받은 필드 출력
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

	}

}
