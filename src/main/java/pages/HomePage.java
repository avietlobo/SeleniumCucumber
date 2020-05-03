package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;


public class HomePage{


	WebDriver driver; 
	  
    public HomePage(WebDriver driver) { 
    	this.driver = driver;
    	PageFactory.initElements(driver, this); 
    } 
  
    // Using FindBy for locating elements 
    @FindBy(how = How.XPATH, using = "//*[contains(@class,'mCR')]/*/*/button") 
    WebElement btn_close; 
  
    @FindBy(how = How.XPATH, using = "//*[contains(@href,'viewcart')]") 
    WebElement btn_cart; 
    
         // This method is to click on Next Button 
    public void clickOn_Cart() { 
    	btn_cart.click(); 
    	
    	
    	
    } 
    
    
    public void closePopUpWindow() { 
    	btn_close.click(); 
    }

    public void navigateTo_HomePage()
    {
    	driver.get("https://www.flipkart.com");
    	selenium.wait.untilJqueryIsDone(driver);
    	
    	 Reporter.addStepLog("Navigated to Home Page from POM");
    	
    }
	
	
	
}
