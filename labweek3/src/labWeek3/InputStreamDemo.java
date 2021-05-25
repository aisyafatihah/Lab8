package labWeek3;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		// Declaration of source storage
		String sourceStorage = "demo1.dat";

		// Declaration of input stream object
		FileInputStream fileInputStream;
		
		System.out.println("Read binary data");

		try {

			// Construct input stream
			fileInputStream = new FileInputStream(sourceStorage);

			// Read from input stream
			int data = fileInputStream.read();
			while (data != -1) {
				
				System.out.println(data);
				
				// Read next data
				data = fileInputStream.read();
				
			}

			System.out.println("\n");

			// Close stream
			fileInputStream.close();  

		} catch (IOException e) {

			System.out.println("Durian Tunggal... we got problem");

			e.printStackTrace();
		}  

		System.out.println("End of program.");

	}

}
