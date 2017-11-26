
public class Garage extends Building {

	private int parkingSpot;
	private double length;
	private double width;
	private String floorType;

	public Garage(int window, int parkingSpot, double length, double width, String floorType) {
		super(1, window);
		this.parkingSpot = parkingSpot;
		this.length = length;
		this.width = width;
		setFloorType(floorType);
	}

	public void setParkingSpot(int parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public int getParkingSpot() {
		return this.parkingSpot;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return this.length;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getFloorType() {
		return this.floorType;
	}

	public double floorSpace() {
		double result = this.width * this.length;
		return result;
	}

	public String toString() {
		String result;
		result = "GARAGE DETAILS :\n" + "Dimensions : " + getLength() + " L X " + getWidth() + " W." + "\n"
				+ "Floor space : " + floorSpace() + " Sq ft" + "\n" + super.toString() + "\n" + "Floor Cover : "
				+ getFloorType() + "\n" + "Parking Spot: " + getParkingSpot() + " cars";
		return result;
	}

}
