package scanner;

import java.lang.*;
import java.util.*;

import javax.swing.JOptionPane;

public class ScannerEx1 {
	private static final String ANSWER = "갑자";
	private static final String QUESTION = "WHO IS THE SEXIEST GUY IN THIS UNIVERSE?";
	
	public static void main(String[] args) {
		int maxCnt = 10;
		int cnt = 0;
		ScannerEx1 scannerEx1 = new ScannerEx1();
		//1.최초질문
		String answer = scannerEx1.question();
		//2.정답확인(맞을때까지 반복)
		while(!answer.equals(ANSWER)) {
			JOptionPane.showMessageDialog(null, "틀렸어");
		//3.재질문
			answer = scannerEx1.question();
			cnt++;
			System.out.println(cnt);
		//4.10번이상 틀리면
			if(cnt == maxCnt) {
				scannerEx1.message("징하다");
				break;
			}
			continue;
		}
		//5.정답출력
		scannerEx1.message("정답");
	}
	
	/***
	 * 질문팝업 
	 * */
	public String question() {
		return JOptionPane.showInputDialog(QUESTION);
	}
	
	/***
	 * 메시지출력 
	 * */
	public void message(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
