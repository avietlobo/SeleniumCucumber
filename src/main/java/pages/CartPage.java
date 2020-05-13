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
    
    
  @FindBy(how=How.XPATH,using="//*[contains(text(),'My Cart')]")
  WebElement lbl_cart;
    
	public void verifyTitle()
    {
  
   System.out.println("CART PAGE");
  
    
    }
   
	public String getTitle()
    {
     return lbl_cart.getText();
    
    }
   
	
	
    
}
