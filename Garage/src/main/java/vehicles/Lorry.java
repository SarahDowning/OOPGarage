package vehicles;

public class Lorry extends Vehicle {

	// Variables
	private boolean smallLorry;
	private boolean mediumLorry;
	private boolean largeLorry;

	// Getters and Setters
	public boolean isSmallLorry() {
		return smallLorry;
	}

	public void setSmallLorry(boolean smallLorry) {
		this.smallLorry = smallLorry;
	}

	public boolean isMediumLorry() {
		return mediumLorry;
	}

	public void setMediumLorry(boolean mediumLorry) {
		this.mediumLorry = mediumLorry;
	}

	public boolean isLargeLorry() {
		return largeLorry;
	}

	public void setLargeLorry(boolean largeLorry) {
		this.largeLorry = largeLorry;
	}

	// Constructor Method
	public Lorry(boolean smallLorry, boolean mediumLorry, boolean largeLorry, int iD, String type, String manufacturer,
			String colour, int ageOfVehicle) {
		super(iD, type, manufacturer, colour, ageOfVehicle);
		this.smallLorry = smallLorry;
		this.mediumLorry = mediumLorry;
		this.largeLorry = largeLorry;
	}

	// toString Method
	@Override
	public String toString() {
		return "Lorry [smallLorry=" + smallLorry + ", mediumLorry=" + mediumLorry + ", largeLorry=" + largeLorry + "]";
	}

}
