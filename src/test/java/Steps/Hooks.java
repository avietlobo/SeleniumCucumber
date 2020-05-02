package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.WebDriverManager;

public class Hooks {

   WebDriver driver;
	
	WebDriverManager webDriverManager;
	
	 
	 @Before
	 public void BeforeSteps() {
		 
		
		/*
		 * System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().
		 * getConfigReader().getDriverPath()); driver = webDriverManager.getDriver(); //
		 * To maximize browser driver.manage().window().maximize();
		 * driver.get(FileReaderManager.getInstance().getConfigReader().
		 * getApplicationUrl());
		 */	 }
	 
	 @After
	 public void AfterSteps() {
	
		//driver.quit();
		 
	 }
	
	
	
}
