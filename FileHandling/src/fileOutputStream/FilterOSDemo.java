package fileOutputStream;

import java.util.Random;
import java.io.*;

public class FilterOSDemo {

	public static void main(String[] args) {

		try {
			
			Random r=new Random();
			int rn=r.nextInt();
			
			File f=new File("D:\\New Full\\file_output\\3)FilterOSDemo_"+rn+".txt");
			FileOutputStream fout=new FileOutputStream(f);
	
			FilterOutputStream fos=new FilterOutputStream(fout);
			String msg="We are making";
			
			byte[] by=msg.getBytes();
			
			fos.write(by);
			
			fos.close();
			
			System.out.println("Filter => FilterOSDemo file as3)FilterOSDemo_"+rn+".txt");
		}
		catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
