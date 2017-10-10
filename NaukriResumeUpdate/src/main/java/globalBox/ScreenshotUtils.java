package globalBox;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils extends TestBase {

	
	/**
	 * This method will capture screenshot of web page
	 */
	public static void captureScreenShot() throws IOException {
	    File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(screenshotFile,new File(OR.getProperty(screenshotsPath)+GetTimeStampValue()+".png"));
	    FileUtils.copyFile(screenshotFile,new File(System.getProperty("user.dir")+"\\Output\\screenshots\\"+GetTimeStampValue()+".png"));
	}
	
	public static String GetTimeStampValue()throws IOException{
	    Calendar cal = Calendar.getInstance();       
	    Date time=cal.getTime();
	    String timestamp=time.toString();
	    String systime=timestamp.replace(":", "-");
	    return systime;
	}
}
