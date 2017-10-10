package globalBox;

import java.util.Iterator;
import java.util.Set;


public class WindowHandling extends TestBase{
	
	public static void windowHandling(){
		for(String winHandle : driver.getWindowHandles()){
			System.out.println("Total windows are "+ driver.getWindowHandles().size());
			driver.switchTo().window(winHandle);
		}
	}
	
	public static String parentWindow(){
		
		String parent=driver.getWindowHandle();
		return parent;
	}
	public static int totalWindows(){
		int totalwin = 0;
		for(String winHandle : driver.getWindowHandles()){
		totalwin = driver.getWindowHandles().size();
		
		}
		
		return totalwin;
		
	}
	
	public static void closeChilds_SwitchtoParent(){
		
	
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		// This will return the number of windows opened by Web driver and will return Set of Strings
		Set<String>s1=driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())
		{
		   String child_window=I1.next();
		// Here we will compare if parent window is not equal to child window then we will close
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();
		if(HandlingAlerts.isAlertPresent()){
			HandlingAlerts.acceptAlert();
		}
		}
	}
	// once all pop up closed now switch to parent window
	driver.switchTo().window(parent);
	}
}
