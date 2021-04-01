package labw3;

/**
 * This program demonstrate the application of output stream that processed data as raw bytes.
 * The data is stored in a file.
 * 
 * @author emalianakasmuri
 * 
 */


import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) {
		
		
		// Declaration of target storage
		String targetStorage = "demo1.dat";
		
		// Declaration of output stream object
		FileOutputStream fileOutputStream;
		
		System.out.println("Generate binary data");
		
		try {
			
			// Create an output stream between this file and data.dat
			fileOutputStream = new FileOutputStream(targetStorage);
			
			// Write three characters 
			fileOutputStream.write(65);
			
			fileOutputStream.flush();
						
			// Close the stream
			fileOutputStream.close();  
	         
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		// Indicate end of program - Could be succcessful
		System.out.println("End of program.");
		System.out.println("Right click on labWeek3. Select Refresh.");
		System.out.println(targetStorage + " should be there. Check it out!");   
	}

}