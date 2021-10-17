package basicEx;

import java.util.Scanner;

public class forEx1 {
	//main method
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하시오");
		a = sc.nextInt();
		System.out.println("b를 입력하시오");
		b = sc.nextInt();
		System.out.println("a + b = "+(a+b));
		sc.close();
	}
}
