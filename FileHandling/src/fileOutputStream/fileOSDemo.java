package fileOutputStream;

import java.io.*;
import java.util.Random;

public class fileOSDemo {

	public static void main(String[] args) {

		try {
			
			Random r =new Random();
			
			int rno=r.nextInt();
			
			File f=new File("D:\\New Full\\file_output\\1)fileOSDemo"+rno+".txt");
			FileOutputStream fout=new FileOutputStream(f);
			
			String msg="Lets start wrinting in a file";
			
			byte[] by=msg.getBytes();
			
			fout .write(by);
			
			fout.close();
			
			System.out.println("Succssfully created file name 1)fileOSDemo"+rno+".txt");
			
		}
		
		catch(Exception ob){
			ob.printStackTrace();
		}
	}

}
