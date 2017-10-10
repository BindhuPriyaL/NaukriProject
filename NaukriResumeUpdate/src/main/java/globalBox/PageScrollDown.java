package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PageScrollDown extends TestBase {

	public static void scrollDown(int height) {
		((JavascriptExecutor) driver)
				.executeScript("scroll(0, " + height + ")");
	}

	public static void scrollDown(int start, int end) {
		((JavascriptExecutor) driver).executeScript("scroll(" + start + ","
				+ end + ")");
	}

	public static void scrollUntilElementIsVisible(String xpathValue) {
		// scrollIntoView is true if the object you're scrolling to is beneath
		// where you currently are
		// and false if the object you're scrolling to is above where you
		// currently are

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(xpathValue)));

	}
}
