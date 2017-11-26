
public abstract class Building {

	private int numFloors;
	private int numWindow;

	public Building(int numFloors, int numWindow) {
		this.numFloors = numFloors;
		this.numWindow = numWindow;
	}

	public int getNumFloors() {
		return this.numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public int getWindow() {
		return this.numWindow;
	}

	public void setWindow(int numWindow) {
		this.numWindow = numWindow;
	}

	abstract public double floorSpace();

	public String toString() {
		String result;
		result = "Window: " + getWindow() + "\n" + "Floor: " + getNumFloors();
		return result;
	}

}
