package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttribute extends TestBase {
	
	
	public static String objAttribute(String XpathValue, String attributetype){
		String attribute = null;
		try{
		new WebDriverWait(driver, 8).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathValue)));
		attribute = driver.findElement(By.xpath(XpathValue)).getAttribute(attributetype);
			}
		catch (Exception e){
			System.out.println("Unable to locate element -> " +e.getMessage()+"Attribute is null - " +attribute);
		}
		return attribute;
	}
}
