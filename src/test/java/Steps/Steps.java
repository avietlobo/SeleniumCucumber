package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pages.CartPage;
import pages.HomePage;


public class Steps {
	
	
	
	HomePage homePage;
	CartPage cp;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	WebDriver driver;
	WebDriverManager webDriverManager;
	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		configFileReader= new ConfigFileReader();
		webDriverManager = new WebDriverManager();
		
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		 homePage = pageObjectManager.getHomePage();
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

	@Then("^shopping cart page should be visible$")
	public void shopping_cart_page_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 cp = pageObjectManager.getCartPage();
		 
	   cp.verifyTitle();
	   webDriverManager.closeDriver();
	   
	}
	
	
}
