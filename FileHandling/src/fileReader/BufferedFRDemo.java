package fileReader;

import java.io.*;

public class BufferedFRDemo {

	public static void main(String[] args) {

		try {
			
			File f=new File("D:\\New Full\\file_Input\\Text file.txt");
			
			FileReader fr=new FileReader(f);
			
			BufferedReader b=new BufferedReader(fr);
			
			int x;
			
			System.out.println("Using Buffered FileReader => content are .........\n");
			
			while((x=b.read())!=-1){
				
				char ch=(char)x;
				
				System.out.print(ch);
				
			}
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
		
	}

}
