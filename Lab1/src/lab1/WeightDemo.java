package lab1;

public class WeightDemo {

	public static void main(String[] args) {
		HumanWeight humanWeight = new HumanWeight();
		
		double weight=49.9;
		System.out.print("Human weight on Earth : " + weight);
		
	     humanWeight.calculateWeight();
		System.out.print("Human weight on Mars : " + humanWeight.getWeightInMars());
		}
	}


