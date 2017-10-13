package globalBox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotUtils extends TestBase {

	public static void copyPasteUsingRobot(String text) {
		

		try {
			Thread.sleep(2000);
			Robot rb = new Robot();
			StringSelection user = new StringSelection(text);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(user, null);
			// Copy Username data using Ctrl+v as below
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			// Now release the KEYs
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			// Press Enter using VK_ENTER key
			rb.keyPress(KeyEvent.VK_ENTER);
			// Now Release the key ENTER
			rb.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}