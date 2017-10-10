package globalBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonUtils extends TestBase{
	

	public static void handlingRadioButton(WebDriver driver, String xpathValue, String buttonValue) {

		new WebDriverWait(driver, 6000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty(xpathValue))));
		List<WebElement> radioList = driver.findElements((By.xpath(OR.getProperty(xpathValue))));

		int count = 0;
		if (radioList.get(count).getText().equalsIgnoreCase(buttonValue)) {

			driver.findElement(By.xpath(OR.getProperty(xpathValue))).click();
			return;

		}
		count++;
	}
}
