package Method2;

class Runner1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1 : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Runner2 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner2 : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class App {

	public static void main(String[] args) {

		Runner1 runner1 = new Runner1();
		Runner2 runner2 = new Runner2();

		runner1.start();
		runner2.start();
		
		try {
			runner1.join();
			runner2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finished the tasks...");

	}

}