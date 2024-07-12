package fileInputStream;

import java.io.*;

public class FilterISDemo {
	
	public static void main(String arg[]) {

	try {
		
		File f=new File("D:\\New Full\\file_Input\\Text file.txt");
		
		FileInputStream fis=new FileInputStream(f);
		
		FilterInputStream b=new FilterInputStream(fis) {};
		
		int x;
		
		while((x=b.read())!=-1) {
			
			char ch=(char)x;
			
			System.out.print(ch);
			
		}
		
		b.close();
		
		fis.close();
			
	}catch(Exception ob) {
		
		ob.printStackTrace();
	
	}

	}
}
