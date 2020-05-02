package Steps;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import dataProviders.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pages.HomePage;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;
	/*
	 * WebDriverManager webDriverManager; PageObjectManager pageObjectManager;
	 * WebDriver driver;
	 */
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		/*
		 * webDriverManager = new WebDriverManager();
		 * 
		 * driver = webDriverManager.getDriver(); pageObjectManager = new
		 * PageObjectManager(driver); homePage = pageObjectManager.getHomePage();
		 */
		 homePage.navigateTo_HomePage(); 
			
	}
	
	
	@Given("^I click on close popup window$")
	public void i_click_on_close_popup_window() throws Throwable {
		
		 homePage.closePopUpWindow();
	}
	
	
	@Given("^I click on shopping cart$")
	public void i_click_on_shopping_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickOn_Cart();
	}
	
}
