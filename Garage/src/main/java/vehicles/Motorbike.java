package vehicles;

public class Motorbike extends Vehicle {

	// Variables
	private int motorbikeID;
	private boolean saddleBags;
	private String helmetColour;

	// Getters and Setters
	public int getMotorbikeID() {
		return motorbikeID;
	}

	public void setMotorbikeID(int motorbikeID) {
		this.motorbikeID = motorbikeID;
	}

	public boolean isSaddleBags() {
		return saddleBags;
	}

	public void setSaddleBags(boolean saddleBags) {
		this.saddleBags = saddleBags;
	}

	public String getHelmetColour() {
		return helmetColour;
	}

	public void setHelmetColour(String helmetColour) {
		this.helmetColour = helmetColour;
	}

	// Constructor Method
	public Motorbike(int motorbikeID, boolean saddleBags, String helmetColour, int iD, String type, String manufacturer,
			String colour, int ageOfVehicle) {
		super(iD, type, manufacturer, colour, ageOfVehicle);
		this.motorbikeID = motorbikeID;
		this.saddleBags = saddleBags;
		this.helmetColour = helmetColour;

	}

	// toString Method
	@Override
	public String toString() {
		return "Motorbike [motorbikeID=" + motorbikeID + ", saddleBags=" + saddleBags + ", helmetColour=" + helmetColour
				+ "]";
	}

}
