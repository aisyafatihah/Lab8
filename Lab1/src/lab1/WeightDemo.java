package lab1;

public class WeightDemo {

	public static void main(String[] args) {
		
		HumanWeight humanWeight = new HumanWeight();
		//print weight on Earth and Mars
		//double weight=49.9;
		//humanWeight.setWeightInEarth(49.9);
		System.out.print("Human weight on Earth : " + humanWeight.getWeightInEarth());
		
	     humanWeight.calculateWeight();
		System.out.print("\nHuman weight on Mars : " + humanWeight.getWeightInMars());
		}
	}


