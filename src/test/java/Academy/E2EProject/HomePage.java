package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	
	@Test(dataProvider="gatData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().click();
		LoginPage lop=new LoginPage(driver);
		lop.getEmail().sendKeys(Username);
		lop.getPassword().sendKeys(Password);
		//lop.getLoginbtn().click();
		
		log.info(text);
		
		ForgotPasswordPage fp=lop.forgotPassword();
		fp.getEmail().sendKeys("xyz");
		fp.sendMeInstructions().click();
		
	}
	
	@DataProvider
	public Object[][] gatData()
	{
		//Rows stands for how many different data types test should run
		//coloumn stands for how many values for each test
		Object[][] data= new Object[2][3];
		//0th row
		data[0][0]="nonRestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restricted user";
		//1st row
		data[1][0]="restricted user@qw.com";
		data[1][1]="123";
		data[1][2]="Non Restricted user";
		
		return data;
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
