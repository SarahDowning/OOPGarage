package main;

import garage.Garage;
import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Lorry;
import vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Vehicle car1 = new Car(1, 1, "Fiesta", "Ford", "Black", 16);
		Vehicle car2 = new Car(2, 2, "Fabia", "Skoda", "Red", 20);
		Vehicle motorbike1 = new Motorbike(1, true, "Pink", 3, "2-Wheeler", "Harley Davidson", "Black", 4);
		Vehicle lorry1 = new Lorry(true, false, false, 4, "Removals", "Vauxhall", "White", 8);
		

		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(motorbike1);
		garage.addVehicle(lorry1);
		
		System.out.println("");
		garage.printVehicles(); 
		
		System.out.println("");
		garage.repairsTotal(lorry1);
		
		System.out.println("");
		garage.removeVehicle(car2);
		garage.removeVehicleByID(1);
		
		System.out.println("");
		garage.printVehicles(); 
		
		
	}
}