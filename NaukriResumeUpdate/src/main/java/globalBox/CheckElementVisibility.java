package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckElementVisibility extends TestBase{
	
public static boolean isElementVisible(String xpathValue) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
		if(driver.findElement(By.xpath(xpathValue)).isDisplayed())
		{
			System.out.println("Element is visible - "+xpathValue);
			return true;
		}	
		else{
			System.out.println("Element is NOT visible on the page - "+xpathValue);
			return false;
		}
			
	}

}
