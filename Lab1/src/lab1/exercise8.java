package lab1;
import java.util.ArrayList;
import java.util.List;

public class exercise8 {

	public static void main(String[] args) {
		//create List
		List<Double> WeightEarthList = new ArrayList<Double>();
		List<Double> WeightMarsList = new ArrayList<Double>();
		
		//HumanWeight human = new HumanWeight();
		
		//add weight on earth into List
		WeightEarthList.add(80.1);
		WeightEarthList.add(65.6);
		WeightEarthList.add(52.2);
		WeightEarthList.add(95.8);
		
		for(double weight: WeightEarthList) {
			
			//calculate and add the weight in mars into List
			double weightMars=weight*3.711;
			WeightMarsList.add(weightMars);
			//System.out.print("\tWeight in Mars: " + weightMars );
		}
		
			//print weight in the list
		    System.out.print("\tWeight on Earth: " + WeightEarthList);
			System.out.print("\n\tWeight in Mars: " + WeightMarsList);
		
	}
}
