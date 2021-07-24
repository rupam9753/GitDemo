package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class stepDefination extends base{


@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver=initializeDriver();
	System.out.println("To test GIT feature");
}

@And("^Navigate to \"([^\"]*)\" Site$")
public void navigate_to_Site(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get(arg1);
}

@And("^click on Login link in home page to land on Secure sign in page$")
public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String Username, String Password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	LoginPage lop=new LoginPage(driver);
	lop.getEmail().sendKeys(Username);
	lop.getPassword().sendKeys(Password);
	lop.getLoginbtn().click();
}

@Then("^Verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    portalHomePage p=new portalHomePage(driver);
    Assert.assertTrue(p.getqueryTextbox().isDisplayed());
}

}
