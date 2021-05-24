package ftmk.rmi.sensor.manager;
import java.util.HashMap;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ftmk.rmi.sensor.TemperatureSensor;

/**
 * This class manage the value of temperature from the sensor.
 * 
 * @author emalianakasmuri
 *
 */
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public TemperatureSensorManager() throws RemoteException {
		super();
	}

	public HashMap<String , Integer> insertTemperature(){
	    // create a hashmap
	    HashMap<String, Integer> temperature = new HashMap<>();

	    // add elements to hashmap
	    temperature.put("Monday", 32);
	    temperature.put("Tuesday", 31);
	    temperature.put("Wednesday", 33);
	    temperature.put("Thursday", 35);
	    temperature.put("Friday", 36);
	    temperature.put("Saturday", 33);
	    temperature.put("Sunday", 33);
	   // System.out.println("HashMap: " + languages);
	  
		return temperature;
		
	}
	
	@Override
	public int temperatureDay(String day) throws RemoteException {
		
		HashMap <String, Integer> tempDay = insertTemperature();
		
		int temperature = tempDay.get(day);
		
		return temperature;
	}
	
	public double averageTemperature() throws RemoteException {
		
			HashMap <String, Integer> tempValue = insertTemperature();
		
		int totalTemperature=0;
		for (int temperature : tempValue.values())
		{
			totalTemperature = temperature + totalTemperature;
		}
		
		double avgTemperature = totalTemperature/tempValue.size();
		
		return avgTemperature;
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}
	
		
	
}


