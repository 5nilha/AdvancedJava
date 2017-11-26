
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("I am running even faster");
		
		try {
			Thread.sleep(8000);
		} catch(InterruptedException e){
			System.out.println("Sleeping now...");
		}
		System.out.println("I woke up now");
	}

}
