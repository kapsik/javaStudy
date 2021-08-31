package exception;

import java.util.Objects;

public class exceptionEx_chainedException {
	//cv
	static int a;
	static int b;
	
	public static void main(String[] args) {
		//객체생성후 사용
		TestVo testVo = new TestVo();
		testVo.setA(1);
		System.out.println(testVo.getA());
		System.out.println(testVo.toString());
	}
	

}




class TestVo extends Object{
	//iv
	private int a;
	
	public TestVo() {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "a : "+ this.a;
	}
}
