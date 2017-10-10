package globalBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxUtils extends TestBase {
	
	
	public static void type(String text, String xpath) {
		new WebDriverWait(driver, 6000).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.TAB);
	}
}
