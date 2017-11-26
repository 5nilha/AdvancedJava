import java.util.ArrayList;
	
public class Testting {
	
	public static String  listingHouses(MLSListable house) {
		
		return house.getMLSListing() + "\n" + house.toString();
	}

	public static void main(String[] args) {
		Room room1 = new Room(2, 10 , 11 , 1, "Carpet");
		Room room2 = new Room(2, 15 , 14 , 2, "Carpet");
		Room room3 = new Room(2, 10, 11, 1, "Carpet");
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room1);
		rooms.add(room2);
		
		Garage garage1 = new Garage(1, 2, 20, 20, "Gravel");
		House arcadia = new House(2, 12,rooms, 3);

		ArrayList<Building> buildings = new ArrayList<Building>();
		buildings.add(arcadia);
		buildings.add(garage1);
		
		for (Building element : buildings) {
			System.out.println(element);
			System.out.println("-----------------------------------------");
		}
		
		System.out.println("");
		System.out.println(listingHouses(arcadia));
		
		
		System.out.println(room3.compareTo(room1));
		System.out.println(room3.equals(room1));
		System.out.println(room1.compareTo(room2));
		System.out.println(-room2.compareTo(room1));
	}

}
