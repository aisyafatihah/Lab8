package Q1;

public class DisplayThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread printThread1 = new DisplayThread();
		Thread printThread2 = new DisplayThread();
		
		printThread1.setName("Thread-1");
		printThread1.setName("Thread-2");
		
		printThread1.start();
		printThread2.start();
	}

}
