package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.activatepges;

public class ActivateStaffStepDef {
	WebDriver driver = null;
	activatepges EditStaff;
	
	@Given("I want to login with <userName> as {string} and <password> as {string}")
	public void i_want_to_login_with_userName_as_and_password_as(String userName, String password) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://clients.smartrto.com.au/auth/login");
		activatepges activatestaff = new activatepges(driver);
		activatestaff.logincredentails(userName, password);
	}

	@Given("Click staff text")
	public void click_staff_text() {
		activatepges activatestaff = new activatepges(driver);
		activatestaff.staff_text();
	   
	}

	@When("Click on activate or deactivate button")
	public void click_on_activate_or_deactivate_button() {
		
		activatepges activatestaff = new activatepges(driver);
		activatestaff.activate();
		activatestaff.yes_btn();
	    
	}

	

}
