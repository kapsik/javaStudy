package Thread;

public class AutoSaveThread implements Runnable{
	/*save method*/
	public void save() {
		System.out.println("saved");
	}
	
	/*implemented run method from Runnable interface*/
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			save();
		}
	}
	
}
