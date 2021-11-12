package vehicles;

public abstract class Vehicle {

	private int ID;
	private String type;
	private String manufacturer;
	private String colour;
	private int ageOfVehicle;
	
	public Vehicle() {

	}

	// Constructor

	public Vehicle(int iD, String type, String manufacturer, String colour, int ageOfVehicle) {
		super();
		ID = iD;
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.ageOfVehicle = ageOfVehicle;
	}

	// Getters and Setters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAgeOfVehicle() {
		return ageOfVehicle;
	}

	public void setAgeOfVehicle(int ageOfVehicle) {
		this.ageOfVehicle = ageOfVehicle;
	}

	// toString Method

	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", type=" + type + ", manufacturer=" + manufacturer + ", colour=" + colour
				+ ", ageOfVehicle=" + ageOfVehicle + "]";
	}

}
