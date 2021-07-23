package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By contact=By.xpath("//a[contains(text(),'Contact')]");
	By bannerText=By.cssSelector("div[class*='video-banner'] p");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin() throws InterruptedException
	{
		return driver.findElement(signin);		
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
	public WebElement bannerText()
	{
		return driver.findElement(bannerText);
	}
	
}
