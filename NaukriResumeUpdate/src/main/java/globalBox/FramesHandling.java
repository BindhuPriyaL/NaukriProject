package globalBox;

public class FramesHandling extends TestBase{
	
	/**
	 * This method will switch to the frame on the page by taking frame attribute like 
	 * @param frameID
	 */
	public static void switchToFrame(String frameID){
		driver.switchTo().frame(frameID);
	}
	}

