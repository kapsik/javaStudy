package exception;

import java.io.File;

public class exceptionEx2{
	public static void main(String[] args) {
			File f = createFile("");
			System.out.println(f.getName()+" file created successfuly");
	}
	
	static File createFile(String fileName) {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		}catch (Exception e) {
			fileName = "제목없음.txt";
		}
		
		File f = new File(fileName);			//File 클래스의 객체를 만든다.
		try {
			f.createNewFile();						//실제파일을 생성한다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;								//생성된 객체의 참조를 반환한다.
	}
}