
class Worker implements Runnable {

	private volatile boolean isTerminated = false;

	@Override
	public void run() {

		while (!isTerminated) {

			System.out.println("Hello from worker class...");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public boolean isTerminated() {
		return isTerminated;
	}

	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}

}

public class App {

	public static void main(String[] args) {

		Worker worker = new Worker();

		Thread t1 = new Thread(worker);

		long startTime = System.currentTimeMillis();

		t1.start();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		worker.setTerminated(true);
		long endTime = System.currentTimeMillis();

		System.out.println("Finished...");

		System.out.println("Process' time : " + (endTime - startTime));

	}

}
