package innerClassEx;

public class InnerClassEx2{
	private int outerIv = 0;
	private static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;	//ok
		int iiv2 = outerCv;	//ok
	}
	static class staticInner{
//		int siv = outerIv;
		int scv = outerCv;
	} 
	
	void myMethod() {
		final int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}