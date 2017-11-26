
public class ThreadsFun extends Thread {

	public static void main(String[] args) {
		
//		Thread t = new Thread();
//		t.start();
		
//		ThreadsFun tf = new ThreadsFun();
//		tf.start();
		
		
		MyRunnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t2.start();
		try {
			t2.join(4000); // Using join a thread should wait until the next one starts
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		
	}
	
	public void run() {
		System.out.println("I'm running");
	}

}
