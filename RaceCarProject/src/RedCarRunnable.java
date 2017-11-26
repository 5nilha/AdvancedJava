//Faster car
public class RedCarRunnable implements Runnable {

	int laps;

	RedCarRunnable(int laps) {
		this.laps = laps;
	}

	@Override
	public void run() {
		while (laps != 0) {
			try {
				if (laps % 2 == 0) {
					Thread.sleep(2000); // The car will go to PitStop to refuel
				}
			} catch (InterruptedException e) {

			}
			laps--;
		}
		System.out.println("Red car has finished the race!");

	}
}
