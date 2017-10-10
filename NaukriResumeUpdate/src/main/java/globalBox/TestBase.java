package globalBox;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver = Connector.driver;
	public static Properties OR = Connector.OR;
	public static Properties CONFIG = Connector.CONFIG;

}
