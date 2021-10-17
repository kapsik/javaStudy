package algorithmEx;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSearch {
	public static void main(String[] args) {
		StudentEx1 studentEx1 = new StudentEx1("갑자","0001");
		StudentEx1 studentEx2 = new StudentEx1("민자","0002");
		
		ArrayList<StudentEx1> arrayList = new ArrayList<StudentEx1>();
		arrayList.add(studentEx1);
		arrayList.add(studentEx2);

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("검색을 하겠습니까?");
			String answer = sc.next();
			if(answer.toUpperCase().equals("Y")) {
				boolean flag = false;
				System.out.println("검색어를 입력하세요");
				String name = sc.next();
				for (StudentEx1 student : arrayList) {
					if(student.getName().equals(name)) {
						System.out.println(student.getName()+" 학번은 "+student.getNo());
						flag = true;
					}
				}
				if (!flag){
					System.out.println("없는 이름입니다.");
				}
			}else if(answer.toUpperCase().equals("N")) {
				break;
			}
			
		}
	}
}


class StudentEx1{
	private String name;
	private String no;
	
	public StudentEx1() {
	};
	
	public StudentEx1(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
}