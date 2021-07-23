package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.id("user_email");	
	By password=By.id("user_password");
	By Loginbtn=By.name("commit");
	By forgotPassword=By.cssSelector("[href*='password/new']");
	By queryTextbox=By.cssSelector("[name='query']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLoginbtn()
	{
		return driver.findElement(Loginbtn);
	}
	public ForgotPasswordPage forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		ForgotPasswordPage fp=new ForgotPasswordPage(driver);
		return fp;
	}
	public WebElement getqueryTextbox()
	{
		return driver.findElement(queryTextbox);
	}
}
