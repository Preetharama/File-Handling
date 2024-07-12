package fileReader;

import java.io.*;

public class FilterFRDemo {

	public static void main(String[] args) {

		try {
			
			File f=new File("D:\\New Full\\file_Input\\Text file.txt");
			
			FileReader fr=new FileReader(f);
			
			FilterReader ffr=new FilterReader(fr) {};
			
			int x;
			
			System.out.print("Content in file are.....\n");
			
			while((x=ffr.read())!=-1) {
				
				char ch=(char)x;
				
				System.out.print(ch);
			}
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
