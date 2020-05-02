package Steps;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pages.CartPage;
import pages.HomePage;

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
	
		cartPage.verifyTitle();
		testContext.getWebDriverManager().closeDriver();
	   
	}
	
	
}
