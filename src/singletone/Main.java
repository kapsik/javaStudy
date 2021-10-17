package singletone;

public class Main {
	public static void main(String[] args) {
		//객체1생성
		SystemSpeaker ss = SystemSpeaker.getInstance();
		
		//객체2생성
		SystemSpeaker ss2 = SystemSpeaker.getInstance();
		
		//객체주소 비교
		System.out.println(ss);
		System.out.println(ss2);
		
		//객체 필드값 읽어오기
		System.out.println(ss.getSystemVol());
		System.out.println(ss2.getSystemVol());
	}
}
