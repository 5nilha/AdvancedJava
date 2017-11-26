package Synchronization;

public class Food {

	public synchronized static void eat(int eatTime) throws InterruptedException {
		
		Thread.sleep(eatTime);
	}
	
}
