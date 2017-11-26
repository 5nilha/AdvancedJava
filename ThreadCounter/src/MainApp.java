
public class MainApp {

	public static void main(String[] args) {
		Countdown countdown = new Countdown();
		
		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread 1");
		
		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();

	}
}



class Countdown {

	private int i;
	
	public void doCountdown() {
		switch(Thread.currentThread().getName()) {
		
		case "Thread 1":
			System.out.println("Running Thread 1");
			break;
		case "Thread 2":
			System.out.println("Running Thread 2");
			break;
		default: 
			System.out.println("Running Thread " + Thread.currentThread().getName());
		
		}
		
		for (i = 10; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : i = " + i);
		}
	}
}



class CountdownThread extends Thread {
	private Countdown threadCountdown;
	
	public CountdownThread(Countdown countdown) {
		threadCountdown = countdown;
	}
	
	public void run () {
		threadCountdown.doCountdown();
	}
}
