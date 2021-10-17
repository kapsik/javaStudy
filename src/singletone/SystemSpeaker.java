package singletone;

public class SystemSpeaker {
	//1.변수
	private int systemVol = 5;
	
	public int getSystemVol() {
		return systemVol;
	}

	public void setSystemVol(int systemVol) {
		this.systemVol = systemVol;
	}

	//2.private static 인스턴스변수
	private static SystemSpeaker ss;
	
	//3.public static getInstance() method 구현(외부에서 객체생성하지않고 호출가능)
	public static SystemSpeaker getInstance() {
		return ss == null ? new SystemSpeaker() : ss;
	}
	
	//private 생성자 (외부에서 new 연산자를 통해 객체를 생성할수없음)
	private SystemSpeaker() {}
}
