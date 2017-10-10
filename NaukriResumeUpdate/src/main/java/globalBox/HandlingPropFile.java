package globalBox;

import java.io.FileInputStream;
import java.util.Properties;

public class HandlingPropFile extends TestBase {
	
	
	 public static void loadpropertiesFile(String propFilePath){
		 CONFIG = new Properties();
				try(FileInputStream fs = new FileInputStream(propFilePath);) {
					CONFIG.load(fs);
				} catch (Exception e) {
					e.printStackTrace();
				}
	 }
	 
	 public static String readpropertyValue(String propFilePath, String key){
		 loadpropertiesFile(propFilePath);
		 return CONFIG.getProperty(key);
		 
	 }
	 
}