
public class Room extends Building implements Comparable {

	private double length;
	private double width;
	private String floorCovering;
	private int closets;

	public Room(int window, double length, double width, int closets, String floorCovering) {
		super(1, window);
		this.length = length;
		this.width = width;
		this.closets = closets;
		this.floorCovering = floorCovering;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getClosets() {
		return closets;
	}

	public void setClosets(int closets) {
		this.closets = closets;
	}

	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	public String getFloorCovering() {
		return this.floorCovering;
	}

	public double floorSpace() {
		double result = this.width * this.length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Room)) {
			return false;
		}

		boolean result = false;
		if (this.floorSpace() == ((Room) obj).floorSpace()) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		String result;
		result = "Dimensions : " + getLength() + " L X " + getWidth() + " W" + "\n" + "Available Space : "
				+ floorSpace() + " Sq ft" + "\n" + "Floor Covering : " + getFloorCovering();
		return result;
	}

	@Override
	public int compareTo(Object obj) {
		int result;
		result = (int) (this.floorSpace() - ((Room) obj).floorSpace());
		return result;
	}

}
