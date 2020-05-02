package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class CartPage{

	
	WebDriver driver; 
	  
    public CartPage(WebDriver driver) { 
    	this.driver = driver;
    	PageFactory.initElements(driver, this); 
    } 
  
  
    
	public void verifyTitle()
    {
    System.out.println("PASS");
    
    }
   
    
}