import java.util.Scanner;

public class Processor {

	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread running .....");
			wait();
			System.out.println("Resumed.");
		}
	}
	
	public void consume() throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized (this) {
			System.out.println("Waiting for return key");
			scanner.nextLine();
			System.out.println("Return key Pressed");
			notify();   // Will notify the other thread in the same object, so it will resume the other thread
			Thread.sleep(5000);
			 scanner.close();
		}
	}
	
}