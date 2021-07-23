package Academy.E2EProject;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateNavBar extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void ValidateNavBar() throws IOException
	{

		
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getContact().isDisplayed());
		log.info("Navigation Bar is displayed");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	

	
}
