package globalBox;

public class TearDownDriver extends TestBase {
	
	public static void closeDriver(){
		if(driver!=null){
			driver.close();
		}
		else{
			System.out.println("Driver is null");
		}
		
	}


	public static void quitDriver(){
		if(driver!=null){
		driver.quit();
		
	}
		else{
			System.out.println("Driver is null");
		}
	}
}
