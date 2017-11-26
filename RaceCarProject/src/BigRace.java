
public class BigRace {

	public static void main(String[] args) {
		
		BlueCarRunnable blueCar = new BlueCarRunnable(5);
		RedCarRunnable redCar = new RedCarRunnable(5);
		
		Thread blue = new Thread(blueCar);
		Thread red = new Thread(redCar);
		
		blue.start();
		
//		try {
//			blue.join(1000);
//		} catch(InterruptedException e) {
//			
//		}
		red.start();
	}

}
