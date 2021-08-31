package exception;

public class exceptionEx1{
	
	public static void main(String[] args) throws Exception{
		try {
			throw new Exception();
		}catch(Exception e){
			System.out.println("첫번째 예외");
		}
		//throw new Exception();
		//throw new RuntimeException();
		method1();
		System.out.println("프로그램 종료");
	}
	
	public static void method1 () {
		try {
			int a = 1/0;
			System.out.println(a);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}