package fileWriter;

import java.util.Random;
import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {
			
			Random r=new Random();
			int rn=r.nextInt();
			
			File f=new File("D:\\New Full\\file_output\\5)FileWriter_"+rn+".txt");
			
			FileWriter fw=new FileWriter(f);
			
			String msg="File Writer .....";
						
			fw.write(msg);
			
			fw.close();
			
			System.out.print(" File Writer file name as 5)FileWriter_"+rn+".txt");
			
		}catch(Exception ob) {
			
			ob.printStackTrace();
			
		}
		
	}

}
