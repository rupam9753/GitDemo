package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
	
	public WebDriver driver;
	
	By email=By.id("user_email");	
	By sendMeInstructions=By.name("commit");

	
	public ForgotPasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement sendMeInstructions()
	{
		return driver.findElement(sendMeInstructions);
	}
	
}
