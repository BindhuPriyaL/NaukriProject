package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Bindhu
 *
 */

public class ClickUtils extends TestBase{
	
	
	
	/**SHFT+ALT+J
	 * This Method is used to click on a webelement by taking the xpath as locator strategy
	 * @param xpathValue
	 */
	public static void clickWebElementByXpath(String xpathValue) {
		//System.out.println("xpath of element to be clicked is - "+xpathValue);
		new WebDriverWait(driver, 6000).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		driver.findElement(By.xpath(xpathValue)).click();
	}
	

	/**
	 * @param xpathValue
	 * @param index
	 */
	public static void clickWebElementByXpath(String xpathValue,String index) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathValue)));
		driver.findElement(By.xpath(xpathValue)).click();
	}
	
}
