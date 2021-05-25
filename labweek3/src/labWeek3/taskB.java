package labWeek3;

import java.io.FileInputStream;
import java.io.IOException;

public class taskB {

	public static void main(String[] args) {
		
		// Declaration of source storage
		String sourceStorage = "bin1.dat";
		String sourceStorage2 = "bin2.dat";
		
		// Declaration of input stream object
		FileInputStream fileInputStream;
		
		FileInputStream fileInputStream2;
		
		try {
			
			// Construct input stream
			fileInputStream = new FileInputStream(sourceStorage);
			
			fileInputStream2 = new FileInputStream(sourceStorage2);
			
			// Read from input stream
			int data1 = fileInputStream.read();
			System.out.println(data1);
			int data2 = fileInputStream2.read();
			System.out.println(data2);
			
			// Close stream
			fileInputStream.close();  
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		
		System.out.println("End of program.  Check the console ");

	}

}
