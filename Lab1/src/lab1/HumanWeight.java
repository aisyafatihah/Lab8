package lab1;

public class HumanWeight {
	private double weightInEarth=49.9;
	private double weightInMars;
	
	public double getWeightInEarth(){
	return weightInEarth;
	}

	public void setWeightInEarth(double weight){
		this.weightInEarth=weightInEarth;
		}
	

	public double getWeightInMars(){
		return weightInMars;
		}
	
	public void calculateWeight(){
	weightInMars = getWeightInEarth() * 3.711;
	}


}
