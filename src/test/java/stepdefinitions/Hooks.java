package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseTest;

public class Hooks extends BaseTest {

	@Before("@MobilePlatform")
	public void beforeMethodMobilePlatform() {
		System.out.println("This methods runs before each scenario for the 'MobilePlatform' tags");
	}

	@After("@MobilePlatform")
	public void afterMethodMobilePlatform() {
		System.out.println("This methods runs after each scenario for the 'MobilePlatform' tags");
	}

	@Before("@WebPlatform")
	public void beforeMethodWebPlatform() {
		System.out.println("This methods runs before each scenario for the 'WebPlatform' tags");
	}

	@After("@WebPlatform")
	public void afterMethodWebPlatform() {
		System.out.println("This methods runs after each scenario for the 'WebPlatform' tags");
	}

	@Before("@SmokeTest")
	public void initObjectsSmoke() {
		driver = getDriver();
	}
	
	@Before("@RegressionTest")
	public void initObjectsRegression() {
		driver = getDriver();
	}
	
	@Before("@SanityTest")
	public void initObjectsSanity() {
		driver = getDriver();
	}

	@After("@SmokeTest")
	public void cleanUpSmoke() {
		driver.close();
	}
	
	@After("@RegressionTest")
	public void cleanUpRegression() {
		driver.close();
	}
	
	@After("@SanityTest")
	public void cleanUpSanity() {
		driver.close();
	}
}
