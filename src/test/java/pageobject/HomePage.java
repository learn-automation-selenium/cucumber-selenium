package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchField = By.cssSelector("input.search-keyword");
	By searchResult = By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]");
	By addAdditionalItems = By.xpath("//a[contains(text(),'+')]");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartIcon = By.xpath("//header/div[1]/div[3]/a[4]/img[1]");
	By proceedToCheckOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	/*********** Getter Methods **************/
	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}
	
	
	public WebElement getSearchResult() {
		return driver.findElement(searchResult);
	}
	
	public WebElement getAddAdditionalItems() {
		return driver.findElement(addAdditionalItems);
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement getCartIcon() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement getProceedToCheckOut() {
		return driver.findElement(proceedToCheckOut);
	}
	
	/************* Added functions *************/
	
	public HomePage searchItem(String item) {
		getSearchField().sendKeys(item);
		return this;
	}
	
	public String getSearchResultText() {
		return getSearchResult().getText();
	}
	
	public HomePage clickCartIcon() {
		getCartIcon().click();
		return this;
	}
	
	public CheckoutPage clickCheckOutAndProceedToCart() {
		getProceedToCheckOut().click();
		return new CheckoutPage(this.driver);
	}
	
	public HomePage clickAddToCart() {
		getAddToCart().click();
		return this;
	}
	
	public HomePage clickOnAdditionalItems() {
		getAddAdditionalItems().click();
		return this;
	}
}
