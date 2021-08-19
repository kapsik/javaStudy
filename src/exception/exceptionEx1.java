package exception;

public class exceptionEx1{
	
	public static void main(String[] args) throws Exception{
		try {
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
		//throw new Exception();
		//throw new RuntimeException();
		method1();
		
	}
	
	public static void method1 ()throws Exception {
		int a = 1/0;
		System.out.println(a);
	}
}