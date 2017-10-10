package globalBox;

public class WaitMethods {
	
	public static void Wait(int seconds){
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
