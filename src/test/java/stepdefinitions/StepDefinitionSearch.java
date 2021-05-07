package stepdefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageobject.CheckoutPage;
import pageobject.HomePage;
import utility.BaseTest;

@RunWith(Cucumber.class)
public class StepDefinitionSearch extends BaseTest {

	HomePage homePage;
	CheckoutPage checkoutPage;
	
	@Given("^User is on GreenKart Landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {
		homePage = new HomePage(driver);
	}

	 @When("^User searched for (.+) vegetable$")
	public void user_searched_for_something_vegetable(String searchItem) throws Throwable {
		 homePage.searchItem(searchItem);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String resultItem) throws Throwable {
		String itemType = homePage.getSearchResultText();
		Thread.sleep(2000);
		System.out.println(itemType);
		System.out.println(resultItem);
		Assert.assertTrue(itemType.contains(resultItem));
	}

    @And("^User clicks on plus button once to add 2 items$")
    public void user_clicks_on_plus_button_once_to_add_2_items() throws Throwable {
    	homePage.clickOnAdditionalItems();
    	Thread.sleep(3000);
    }

    @And("^User clicks on Add To Cart Button$")
    public void user_clicks_on_add_to_cart_button() throws Throwable {
    	homePage.clickAddToCart();
    }

    @And("^User clicks on cart and clicks on Proceed To Checkout$")
    public void user_clicks_on_cart_and_clicks_on_proceed_to_checkout() throws Throwable {
    	homePage.clickCartIcon();
    	checkoutPage = homePage.clickCheckOutAndProceedToCart();
    }
    
    @Then("^verify (.+) items is present in checkout page$")
    public void verify_something_items_is_present_in_checkout_page(String strArg1) throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(checkoutPage.getTextItem().contains(strArg1));
    }
}
