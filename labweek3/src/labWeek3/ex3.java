package labWeek3;

import java.io.FileOutputStream;
import java.io.IOException;

public class ex3 {

	public static void main(String[] args) {
		
		
		// Declaration of target storage
		String targetStorage1 = "bin1.dat";
		String targetStorage2="bin2.dat";
		
		// Declaration of output stream object
		FileOutputStream fileOutputStream;
		FileOutputStream fileOutputStream1;
		
		try {
			
			// Create an output stream between this file and data.dat
			fileOutputStream = new FileOutputStream(targetStorage1);
			fileOutputStream1 = new FileOutputStream(targetStorage2);
			
			// Write three characters 
			fileOutputStream.write(64);
			fileOutputStream1.write(65);
			
			fileOutputStream.flush();
			
			// Close the stream
			fileOutputStream.close();  
	         
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		// Indicate end of program - Could be succcessful
		System.out.println("End of program.  Check the files "); //+ targetStorage);   
	}

}
