package globalBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class HandlingAlerts extends TestBase{
	
	public static void acceptAlert(){
	Alert al = driver.switchTo().alert();
	al.accept();
	}
	
	public static boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()
}
