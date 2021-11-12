package garage;

import java.util.ArrayList;
import java.util.List;

import vehicles.Car;
import vehicles.Lorry;
import vehicles.Motorbike;
import vehicles.Vehicle;

public class Garage {

	private List<Vehicle> garageStock = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		garageStock.add(vehicle);
		System.out.println("Added " + vehicle);
	}

	public void removeVehicle(Vehicle vehicleID) {
		garageStock.remove(vehicleID);
		System.out.println("Removed vehicle with ID: " + vehicleID);
	}

	public void removeVehicleByID(int ID) {
		for (int id = 1; id < garageStock.size(); id++) {
			garageStock.remove(ID);
			System.out.println("Removed vehicle by ID with ID: " + ID);
		}

	}
	
	public void repairsTotal(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			System.out.println("The cost of this repair is: " + 80);
		} else if (vehicle instanceof Motorbike) {
			System.out.println("The cost of this repair is: " + 60);
		} else if (vehicle instanceof Lorry) {
			System.out.println("The cost of this repair is: " + 100);
		} else {
			System.out.println(0);
		}
	}

	public void emptyGarage() {
		garageStock.removeAll(garageStock);
		System.out.println("All garage stock gone!");
	}

	public void printVehicles() {
		for (Vehicle vehicle : this.garageStock)
			System.out.println(vehicle);
	}

}
