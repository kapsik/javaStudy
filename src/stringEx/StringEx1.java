package stringEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx1 {
	public static void main (String[] args) {
	// basic array
		//when you create basic array it will save in Heap memory Area with address
		String[] arr3 = {"apple", "grape", "pineaplle", "abc", "asdfasdfasdf"};
//		System.out.println("before change : "+arr3.length);
		
	//add more elements for array
		//1. make more bigger array and switch them
		arr3 = Arrays.copyOf(arr3, arr3.length+1);
//		System.out.println("after change : "+arr3.length);
//		System.out.println(Arrays.toString(arr3));
		
		//2. make arrayList for array
		List<String> arrList1 = new ArrayList<String>();
		arrList1.add("abc");
		arrList1.add("123");
//		System.out.println(arrList1);
		
		//split
		String abcd = "2001/05/22";
		String[] charSp = abcd.split("/");
		System.out.println(Arrays.toString(charSp));
		
		//join
		String StringJi = String.join("/", charSp);
		System.out.println(StringJi);
	}
}
