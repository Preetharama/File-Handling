package fileOutputStream;

import java.util.Random;
import java.io.*;

public class ByteArrayOSDemo {

	public static void main(String[] args) {

		try {
			
			String msg="Lets write in two files at same time";
			
			byte[] by=msg.getBytes();
			
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			
			bos.write(by);
		
			
			Random r=new Random();
			int rn1=r.nextInt();
			int rn2=r.nextInt();
			
			File f1=new File("D:\\New Full\\file_output\\4)ByteArrayOSDemo1=="+rn1+".txt");
			FileOutputStream fout1=new FileOutputStream(f1);
			
			File f2=new File("D:\\New Full\\file_output\\4)ByteArrayOSDemo2=="+rn2+".txt");
			FileOutputStream fout2=new FileOutputStream(f2);
				
			bos.writeTo(fout1);
			bos.writeTo(fout2);
			
			bos.close();
			
			fout1.close();
			fout2.close();
			
			System.out.print("Success....");
			System.out.println("File1 => 4)ByteArrayOSDemo1=="+rn1+".txt");
			System.out.println("File2 => 4)ByteArrayOSDemo1=="+rn2+".txt");
			
			
	}catch(Exception ob) {
		
		ob.printStackTrace();
	}

	}
	
}
