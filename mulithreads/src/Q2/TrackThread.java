package Q2;
import java.util.*;

public class TrackThread implements Runnable{

	public void displayRandom() {
		String word[]= {"It", "is", "recommended", "to", "use", "Calendar", "class"};
		Random randomNum=new Random();
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while(set.size()<word.length) {
			set.add(randomNum.nextInt(word.length));
		}
		
		Object orderedText[] = set.toArray();
		
		String arrangeText = "";
		for(int i=0; i< word.length;i++) {
			arrangeText += word[(int) orderedText[i]] + " ";
		}
		System.out.println(arrangeText);
	}
	
	public void extractText() {
		String text = "My name is Aisya Fatihah";
		String temp = "";
		char extract;
		
		for(int i=0; i<10;i++) {
			extract = text.charAt(i);
			temp += extract;
			System.out.println(temp);
		}
	}
	
	public void run() {
		Thread currentThrd = Thread.currentThread();
		if(currentThrd.getName().equals("text"))
			extractText();
		else
			displayRandom();
	}
}
