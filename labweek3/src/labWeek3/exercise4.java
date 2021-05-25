package labWeek3;

import java.io.FileInputStream;
//import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class exercise4 {

	public static void main(String[] args){
		
		try {
			
			// Construct input stream
			FileInputStream input = new FileInputStream("ProductUML.png");
			FileOutputStream output = new FileOutputStream("ProductUML2.png");
			
			BufferedInputStream bufferInput=new BufferedInputStream(input);
			BufferedOutputStream bufferOutput=new BufferedOutputStream(output);
			
			int i=0;
			while(i!=-1) {
				i=bufferInput.read();
				bufferOutput.write(i);
			}
			bufferInput.close();
			bufferOutput.close();
			
		} catch (IOException e) {
			
			System.out.println("Durian Tunggal... we got problem");
			
			e.printStackTrace();
		}  
		
		System.out.println("End of program.  Check out ");

		
	}

}
