package Academy.E2EProject;

import java.io.IOException;

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

public class ValidateTitle extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	LandingPage lp=new LandingPage(driver);
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void ValidateTitle() throws IOException
	{
				
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
		log.info("Successfully Validated Text Message");
		
	}
	
	@Test
	public void ValidateHeader() throws IOException
	{
				
		Assert.assertEquals(lp.bannerText().getText(), "An Academy to learn Everything about Testing");
		log.info("Successfully Validated Header Text Message");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
}
