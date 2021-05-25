package Q1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DisplayThread extends Thread {

		public void displayThread(String currentThreadName) {
			LocalTime currentTime = LocalTime.now();
			DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
			String time = currentTime.format(timeFormat);
			
			for (int i=1;i<=10;i++) {
				System.out.print(i + " -- " + currentThreadName + " on " + time + "\n");
			}
			
		}
		
		public void run() {
			
			Thread thread = Thread.currentThread();
			displayThread(thread.getName());
		}
}
