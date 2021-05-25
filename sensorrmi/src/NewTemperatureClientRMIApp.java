import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TemperatureSensor;

public class NewTemperatureClientRMIApp {

	public static void main(String[] args) {
		
					
					
			try {
					// Get registry
					Registry rmiRegistry = LocateRegistry.getRegistry();
						
					// Look-up for the remote object
					TemperatureSensor remoteSensorAyerKeroh = (TemperatureSensor) rmiRegistry.lookup("SensorAyerKeroh");
						
					// Invoke method from the remote object
					int currentTemperature = remoteSensorAyerKeroh.getTemperature();
						
					System.out.println("Current temperature in Ayer Keroh is " + currentTemperature + " Celcius");
			
					// Display temperature for specific day
					String day = "Thursday";
					int temperature = remoteSensorAyerKeroh.temperatureDay(day);
					System.out.println("Current temperature in Ayer Keroh on " + day +" is " +  temperature + " Celcius");
					
					// Display average temperature
					double averageTemperature = remoteSensorAyerKeroh.averageTemperature();
					System.out.println("Average temperature in Ayer Keroh is " +  averageTemperature + " Celcius");
					
					
					
				} catch (RemoteException | NotBoundException e) {
						
						e.printStackTrace();
				}
					
					
		
	}

}
