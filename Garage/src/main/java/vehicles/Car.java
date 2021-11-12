package vehicles;

public class Car extends Vehicle {

	// Variables
	private int carID;

	// Getters and Setters
	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	// Constructor
	public Car(int carID, int iD, String type, String manufacturer, String colour, int ageOfVehicle) {
		super(iD, type, manufacturer, colour, ageOfVehicle);
		this.carID = carID;
	}

	// toString Method
	@Override
	public String toString() {
		return "Car [carID=" + carID + "]";
	}
}
