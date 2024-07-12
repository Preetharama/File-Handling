package fileWriter;

import java.util.Random;
import java.io.*;

public class FilterFWDemo {

	public static void main(String[] args) {

		try {
			
			Random r=new Random();
			int rn=r.nextInt();
			
			File f=new File("D:\\New Full\\file_output\\7)Filter file writer_"+rn+".txt");
			
			FileWriter fw=new FileWriter(f);
			
			FilterWriter ffw=new FilterWriter(fw) {};
			
			String msg="Filter .......";
			
			ffw.write(msg);
			
			ffw.close();
			
			System.out.println("7)Filter file writer_"+rn+".txt");
			
		}catch(Exception ob) {
			ob.printStackTrace();
		}
	}

}
