package exception;

import java.io.File;
import java.io.IOException;

public class exceptionEx2_1{
	public static void main(String[] args) {
//			File f = createFile(args[0]);
			File f = createFile("");
			@SuppressWarnings({ "static-access" })
			String pathSeperater = f.pathSeparator;
			String absolutePath = f.getAbsolutePath();
			String fileName = f.getName();
			System.out.println("pathSeperater : "+pathSeperater);
			System.out.println("absolutePath : "+absolutePath);
			System.out.println("fileName : "+fileName);
			
	}
	
	private static File createFile(String fName) {
		//1) put name"제목없음" on no name file
		if(fName == "" || fName == null) {
			try {
				throw new Exception();
			}catch (Exception e) {
				e.printStackTrace();
				fName = "제목없음";
			}
		}
		
		File f = new File(fName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("완료되었습니다.");
		}
		
		return f;
	}
}
