package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitUtils extends TestBase {
	
	public static void submit(String xpathValue) {
		//new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		driver.findElement(By.xpath(xpathValue)).submit();
	}

}
