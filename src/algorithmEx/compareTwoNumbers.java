package algorithmEx;

import javax.swing.JOptionPane;

public class compareTwoNumbers {
	public static void main(String[] args) {
		try {
			String aStr="";
			String bStr="";
			while(aStr.equals("")) {
				aStr = JOptionPane.showInputDialog("A의 값을 입력하시오");
			}
			while(bStr.equals("")) {
				bStr = JOptionPane.showInputDialog("B의 값을 입럭하시오");
			}
			
			int a = Integer.valueOf(aStr);
			int b = Integer.valueOf(bStr);
			if(a > b) {
				System.out.println(">");
			}else if(a < b) {
				System.out.println("<");
			}else {
				System.out.println("==");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("빈값을 입력하셨습니다.");
		}
		
	}
	
}
