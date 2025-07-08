package ch07.sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");		//SmartPhone + Phone 클래스에 있는거 다 사용 가능
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 성아영인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
