package Spring;

public class SamsungTv implements TV {

	public void powerOn() {
		System.out.println("Sasung Tv 전원을 켭니다");
	}
	
	public void volumeUp() {
		System.out.println("Samsung Tv 볼륨을 높입니다");
	}
	
	public void volumeDown() {
		System.out.println("Samsung Tv 볼륨을 낮춥니다");
	}
	
	public void powerOff() {
		System.out.println("Samsung Tv 전원을 끕니다");
	}
}
