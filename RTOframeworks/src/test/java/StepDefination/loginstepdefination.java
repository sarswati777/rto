package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import pages.loginpages;

public class loginstepdefination {
	WebDriver driver= null;
	loginpages login;
	@Given("I want to login with <username> as {string} and <password> as {string}")
	public void i_want_to_login_with_username_as_and_password_as(String username, String password) {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://clients.smartrto.com.au/auth/login");
		loginpages login = new loginpages(driver);
		login.logincredentails(username, password);
	    
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
		loginpages login = new loginpages(driver);
		login.clicksignin();
	   
	}

}
