package collectionEx;

import java.util.ArrayList;

public class arrayEx1 {
	public static void main(String[] args) {
		int sNum = 0;
		int eNum = 10;
		ArrayList<Object> objList = new ArrayList<Object>(eNum);
		for(int i = sNum;i < eNum;i++) {
			objList.add(i);
		}
		//삭제
		objList.add("9");
		objList.remove("9");
//		System.out.println(objList);
		
		//indexOf
//		System.out.println(objList.indexOf("9"));
//		System.out.println(objList.indexOf(9));
		
//		System.out.println(objList);
//		for(int i = 0; i < objList.size();i++) {
//			System.out.println("i = "+i);
//			objList.remove(i);
//		}
		
		for(int i = objList.size()-1;i >= 0;i--) {
			System.out.println("i = "+i);
			objList.remove(i);
		}
		
		System.out.println(objList);
		
	}
}
