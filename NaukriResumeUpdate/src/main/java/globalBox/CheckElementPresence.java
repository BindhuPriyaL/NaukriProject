package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckElementPresence extends TestBase  {
	
	/**
	 * This method will try to find the presence of the element based on the xpath locator strategy 
	 * and returns boolean value
	 * @param xPathName
	 * @return
	 */
	public static boolean isElementPresent(String xpathValue) {
		
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
		int count = driver.findElements(By.xpath(xpathValue)).size();
		if(count==0)
		{
			System.out.println("Unable to find element : "+xpathValue);
			return false;
		}	
		else
		{
			System.out.println("Element is present on the page : "+xpathValue+" Total elements on the page with this xpath are - "+count);
			return true;
		}
		
	}
}
