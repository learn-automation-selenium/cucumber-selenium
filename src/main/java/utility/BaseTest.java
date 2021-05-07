package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	private ConfigReader configReader = new ConfigReader();
	
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(configReader.applicationURL());
		driver.manage().window().maximize();
		return driver;
	}
}
