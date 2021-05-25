package Q2;

public class TrackThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of runnable
		Runnable statementPrinter = new TrackThread();
		Runnable statementPrinter2 = new TrackThread();
		Runnable statementPrinter3 = new TrackThread();
		
		//object of thread
		Thread word1 = new Thread( statementPrinter, "word1");
		Thread word2 = new Thread( statementPrinter2, "word2");
		Thread text = new Thread( statementPrinter3, "text");
		
		word1.start();
		word2.start();
		text.start();
	}

}
