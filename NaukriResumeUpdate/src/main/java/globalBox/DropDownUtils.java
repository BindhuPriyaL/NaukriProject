package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownUtils extends TestBase {
	
	
	
	public static void handlingDropDown (String ObjectName, String sendKeysValue)
    {
		//new WebDriverWait(driver, 3000).until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty(ObjectName))));
		WebElement web_element = driver.findElement(By.xpath(OR.getProperty(ObjectName)));
		//new WebDriverWait(driver, 6000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty(xpathValue))));
		//WebElement web_element = driver.findElement(webElement);
        //web_element.click();
        web_element.sendKeys(sendKeysValue);
        web_element.sendKeys(Keys.ENTER);
    }
}
