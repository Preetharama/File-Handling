package fileWriter;

import java.io.*;
import java.util.Random;

public class BufferedFWDemo {

	public static void main(String[] args) {

		try {
			
			Random r=new Random();
			int rn=r.nextInt();
			
			File f=new File("D:\\New Full\\file_output\\6)Buffered File Writer_"+rn+".txt");
			
			FileWriter fw=new FileWriter(f);
			
			String msg="Lets write in buffered file method";
			
			fw.write(msg);
			
			fw.close();
			
			System.out.println("6)Buffered File Writer_"+rn+".txt");
			
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
