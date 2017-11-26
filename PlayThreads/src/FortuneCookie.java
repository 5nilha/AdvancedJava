
public class FortuneCookie implements Runnable {

	private String first;
	private String last;
	private int sleepTime;

	public FortuneCookie(String first, String last, int sleepTime) {
		this.first = first;
		this.last = last;
		this.sleepTime = sleepTime;
	}

	public void run() {
		
		while (true) {
			
			Thread.yield();
			
			System.out.print(first);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(last);
		}
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

}
