package stepdefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitionUserLogin {

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		// navigate to landing page
		System.out.println("user is on landing page");
	}

	@When("^user login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		// login into application with username and password
		System.out.println("user login into application with username and password");
	}

	@When("user login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String username, String password)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Username is : " + username + " and password : " + password);
	}

	@Then("^application welcome page is opened after successful login$")
	public void application_welcome_page_is_opened_after_successful_login() throws Throwable {
		// validate the welcome page
		System.out.println("application welcome page is opened after successful login");
	}

	@And("^all cards are displayed \"([^\"]*)\"$")
	public void all_cards_are_displayed_something(String isCardDisplayed) throws Throwable {
		// validate if cards are displayed
		System.out.println("Cards are displayed : " + isCardDisplayed);
	}

	@When("user signup by using the following details")
	public void user_signup_by_using_the_following_details(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		List<String> row0Data = data.get(0);
		for (String string : row0Data) {
			System.out.println("Get all columns data : " + string);
		}
	}

	@Then("user successfully signed up")
	public void user_successfully_signed_up() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user successfully signed up");
	}

	@Then("verify the new user details")
	public void verify_the_new_user_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("verify the new user details");
	}

	@When("^user login into application with username (.+) and password (.+) for below users$")
	public void user_login_into_application_with_username_and_password_for_below_users(String username, String password)
			throws Throwable {
		System.out.println("Username is : " + username + " and password : " + password);
	}

	@Given("^the browser is installed in machine$")
	public void the_browser_is_installed_in_machine() throws Throwable {
		System.out.println("check the browser is installed");
	}

	@When("^user click on browser icon to invoke the browser$")
	public void user_click_on_browser_icon_to_invoke_the_browser() throws Throwable {
		System.out.println("clicking on the browser icon");
	}

	@Then("^browser is invoked$")
	public void browser_is_invoked() throws Throwable {
		System.out.println("invoking the browser");
	}

}
