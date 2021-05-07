package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

	private Properties properties;
	private static String propPath = "C:\\Users\\mohammad.iqbal\\eclipse-workspace\\Learn_Cucumber\\src\\test\\resources\\Application.properties";

	public ConfigReader() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(propPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String applicationURL() {
		String driverPath = properties.getProperty("URL");
		if (driverPath != null) {
			return driverPath;
		} else {
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		}
	}
}
