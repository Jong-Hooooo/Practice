package ch08.sec05;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//주상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다");
		}
	}
}
