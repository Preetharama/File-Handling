package fileInputStream;

import java.io.*;
import java.util.*;

public class SequenceISDemo {

	public static void main(String[] args) {

		try {
			
			File f1=new File("D:\\New Full\\file_Input\\Text file.txt");
			
			File f2=new File("D:\\New Full\\file_Input\\Text1.txt");
			
			FileInputStream fis1=new FileInputStream(f1);
			BufferedInputStream bis1=new BufferedInputStream(fis1);
			
			FileInputStream fis2=new FileInputStream(f2);
			BufferedInputStream bis2=new BufferedInputStream(fis2);
			
			Vector<BufferedInputStream> v=new Vector();
			
			v.add(bis1);
			v.add(bis2);
			
			Enumeration<BufferedInputStream> e=v.elements();
			
			SequenceInputStream sis=new SequenceInputStream(e);
			
			int x;
			
			System.out.println("The read inputs are..........\n");
			
			while((x=sis.read())!=-1) {
				
				char ch=(char)x;
				
				System.out.print(ch);
				
			}
			
		
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
