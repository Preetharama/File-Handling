package fileInputStream;

import java.io.*;

public class BufferedISDemo {

	public static void main(String[] args) {

		try {
						
			File f=new File("D:\\New Full\\file_Input\\Text file.txt");
			
			FileInputStream fis=new FileInputStream(f);
			
			BufferedInputStream b=new BufferedInputStream(fis);
			
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
