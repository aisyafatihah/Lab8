package Q3;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class SuspendThread implements Runnable{
	// To detect word1 running status
		private static boolean status = false;
		
		// rearrange the sentence in random order
		 
		public void displayRandom() {
		
			String word[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
			Random randomNum = new Random();
			// set is used to avoid duplicate data
			Set<Integer> set = new LinkedHashSet<Integer>();

			while (set.size() < word.length) {

				set.add(randomNum.nextInt(word.length));
			}

			Object orderedText[] = set.toArray();

			String arrangeText = "";
			for (int i = 0; i < word.length; i++) {
				status = true;
				arrangeText += word[(int) orderedText[i]] + " ";
				System.out.println(arrangeText);
				
			}		
			
		}
		
		public void displayRandom(String threadName) {
			
			String word[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
			Random randomNum = new Random();
			
			Set<Integer> set = new LinkedHashSet<Integer>();

			while (set.size() < word.length) {

				set.add(randomNum.nextInt(word.length));
			}

			Object orderedText[] = set.toArray();

			String arrangeText = "";
			for (int i = 0; i < word.length; i++) {
				arrangeText += word[(int) orderedText[i]] + " ";
				try {	
					if (status == true) {
						// suspend current thread for 5 seconds
						System.out.println("\n\n"+ threadName + " is sleeping\n\n");
						Thread.sleep(5000);
						status = false;
					}

				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(threadName + " : " + arrangeText);
			}
			
	}

		
		public void extractText() {

			String text = "My name is Aisya Fatihah";
			String temp = "";
			char extract;

			for (int i = 0; i < 10; i++) {

				extract = text.charAt(i);
				temp += extract;
				System.out.println(temp);

			}

		}

		@Override
		public void run() {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			if (name.equals("text"))
				extractText();
			else if (name.equals("word1"))
				displayRandom();
			else
				displayRandom(thread.getName());
		}

}
