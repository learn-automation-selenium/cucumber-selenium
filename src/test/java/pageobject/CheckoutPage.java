package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	WebDriver driver;
	By itemText = By.cssSelector("p.product-name");
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getItemText() {
		return driver.findElement(itemText);
	}
	
	public String getTextItem() {
		return getItemText().getText().trim();
	}
}
