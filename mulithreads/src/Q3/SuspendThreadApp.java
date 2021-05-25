package Q3;

public class SuspendThreadApp {
	public static void main(String[] args) {

		//object of Runnable
		Runnable statementPrinter = new SuspendThread();
		Runnable statementPrinter2 = new SuspendThread();
		Runnable statementPrinter3 = new SuspendThread();

		//object of Thread
		Thread word1 = new Thread(statementPrinter, "word1");
		Thread word2 = new Thread(statementPrinter2, "word2");
		Thread text = new Thread(statementPrinter3, "text");

		word1.start();
		text.start();
		word2.start();

	}

}
