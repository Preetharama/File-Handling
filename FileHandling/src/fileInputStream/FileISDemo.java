package fileInputStream;

import java.io.*;

public class FileISDemo {

	public static void main(String[] args) {

		try {
			
			File f=new File("D:\\New Full\\file_Input\\Text file.txt");
			
			FileInputStream fis=new FileInputStream(f);
			
			int byte_value;
			
			while((byte_value=fis.read())!=-1) {
				
				char ch=(char)byte_value;
				
				System.out.print(ch);
				
			}
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
