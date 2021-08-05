package Thread;

public class DaemonExample {
	public static void main(String[] args) {
		System.out.println("1) get ready for DaemonThread");
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		Thread thread = new Thread(autoSaveThread);
		thread.setDaemon(true);
		thread.start();
		try {
		Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("2) the main Thread is over");
	}
}
