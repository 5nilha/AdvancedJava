import java.util.ArrayList;

public class House extends Building implements MLSListable {

	int bathroom;
	ArrayList<Room> rooms = new ArrayList<Room>();

	public House(int floors, int windows, ArrayList<Room> rooms, int bathroom) {
		super(floors, windows);
		this.bathroom = bathroom;
		this.rooms.addAll(rooms);
	}

	public double floorSpace() {
		double space = 0;

		for (int i = 0; i < rooms.size(); i++) {
			space += rooms.get(i).floorSpace();
		}

		return space;
	}

	public double roomsAvgSize() {
		double average;
		average = floorSpace() / rooms.size();
		return average;
	}

	public int numOfRooms() {
		return rooms.size();
	}

	public String roomDetails() {
		int i = 1;
		String result = "";

		for (Room room : rooms) {
			result += "Room #" + i + " :\n" + room + "\n\n";
			i++;
		}
		return result;
	}

	public String getMLSListing() {
		return "BUILTIFUL HOUSE FOR SALE";
	}

	public String toString() {
		String result;
		result = "HOME DETAILS : " + "\n" + "Floors : " + getNumFloors() + "\n" + "# of window : " + getWindow() + "\n"
				+ "Floor Space : " + floorSpace() + " Sq ft" + "\n" + "# of Rooms :  " + numOfRooms() + "\n\n"
				+ roomDetails();
		return result;
	}

}
