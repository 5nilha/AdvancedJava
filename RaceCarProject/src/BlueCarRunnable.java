//Slower car
public class BlueCarRunnable implements Runnable {

	int laps;

	BlueCarRunnable(int laps) {
		this.laps = laps;
	}

	@Override
	public void run() {
		while (laps != 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			laps--;
		}
		System.out.println("Blued Car has finished the race!");
		
	}
}
