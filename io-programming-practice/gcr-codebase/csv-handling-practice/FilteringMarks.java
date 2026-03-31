package filehandling;
import java.io.*;
public class FilteringMarks {
  public static void main(String [] args) {
	  
	  String path="D:/NameMarks.csv";
	  try(BufferedReader bw = new BufferedReader(new FileReader(path))){
		  String line;
		
		  while((line =bw.readLine())!=null) {
			  String [] ans=line.split(",");
			  
			  if(ans[1].matches("\\d+")) {
				  int m=Integer.parseInt(ans[1]);
				  if(m > 80)
				  System.out.print("name is: "+ans[0]+", and marks is: "+ans[1]);
			  }
		  }
	
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
  }
}
