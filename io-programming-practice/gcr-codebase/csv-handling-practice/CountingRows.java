package filehandling;
import java.io.*;
public class CountingRows {
	
	public static void main(String [] args) {
		
		String path="D:/Names.csv";
		
		try(BufferedReader obj=new BufferedReader(new FileReader(path))) {
				String line;
				int count=0;
				while((line = obj.readLine())!=null) {
					count++;
				}
				
				System.out.print("number of counts is: "+count);
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
