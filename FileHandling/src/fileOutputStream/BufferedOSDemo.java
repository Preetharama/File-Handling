package fileOutputStream;

import java.io.*;
import java.util.Random;

public class BufferedOSDemo {

	public static void main(String[] args) {

		try {
			
			Random r=new Random();
			int rn=r.nextInt();
			
			File f= new File("D:\\New Full\\file_output\\2)BufferedOSDemo_"+rn+".txt");
			FileOutputStream fount= new FileOutputStream(f);
			
			BufferedOutputStream bos=new BufferedOutputStream(fount);
			
			String msg="We are moved to next level";
			
			byte[] by=msg.getBytes();
			
			fount.write(by);
			
			fount.close();
		
			System.out.println("File created and added message with buffer as file name 2)BufferedOSDemo_"+rn+".txt");

		}catch(Exception ob) {
			
			ob.printStackTrace();
		}
	}

}
