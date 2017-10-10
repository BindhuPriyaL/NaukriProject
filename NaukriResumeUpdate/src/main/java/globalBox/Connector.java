package globalBox;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Connector {
	static public Properties OR = null;
	static public Properties CONFIG = null;
	static public WebDriver driver = null;
	// static public WebDriver Firefox = null;
	// static public WebDriver Chrome = null;
	// static public WebDriver IE = null;
	// public enum browser {CHROME, FIREFOX, IE, PHANTOMJS};

	

	public Connector() {
		
		BrowserUtils.openBrowser(HandlingPropFile.readpropertyValue(constants.CONFIG_FILE_PATH, "browser"));
		BrowserUtils.navigate(HandlingPropFile.readpropertyValue(constants.CONFIG_FILE_PATH, "URL"));
		ExcelUtils xls=new ExcelUtils(constants.EXCEL_PATH);
		/*

		switch (browserType) {
		case "Firefox":
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			break;
		case "Chrome":
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			break;

		case "IE":
			if (driver == null) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			break;

		default:
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resources\\com\\selenium\\amx\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			break;
		}		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

	*/}

}
