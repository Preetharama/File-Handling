package fileReader;

import java.io.*;

public class FileRDemo {

	public static void main(String[] args) {

		try {
			
			File f=new File("D:\\New Full\\file_Input\\Text file.txt");
						
			FileReader fr=new FileReader(f);
			
			int x;
			
			System.out.println(" Using FileReader =>File has read .......");

			while((x=fr.read())!=-1) {
				
				char ch=(char)x;
				
				System.out.print(ch);
			}
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
