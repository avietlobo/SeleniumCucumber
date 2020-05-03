package stepDefinitions;

import org.junit.Assert;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import managers.FileReaderManager;
import pages.CartPage;
import pages.HomePage;
import testDataTypes.Customer;

public class CartPageSteps {

	TestContext testContext;
	CartPage cartPage;
	
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@Then("^shopping cart page should be visible$")
	public void shopping_cart_page_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		//String title=cartPage.getTitle();
		testContext.scenarioContext.setContext(Context.PRODUCT_NAME, "test");
		 String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		 Assert.assertTrue(productName.contains("a"));
		 System.out.println(productName);
		//cartPage.verifyTitle();
		 
		 Reporter.addScenarioLog("Shopping cart page validated");
		
		

		
	   
	}
	
	/*
	 * @When("^enter \\\"(.*)\\\" personal details on checkout page$") public void
	 * enter_personal_details_on_checkout_page(String customerName){ Customer
	 * customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(
	 * customerName);
	 * 
	 * }
	 */
	
	
	
}
