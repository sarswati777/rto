package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddOfferPages;

public class AddOfferStepdefination {
	
	WebDriver driver = null;
	AddOfferPages AddOffer;
	
	
	@Given("I want to login with <Email> as {string} and <password> as {string}")
	public void i_want_to_login_with_Email_as_and_password_as(String Email, String password) {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://clients.smartrto.com.au/auth/login");
		AddOfferPages AddOffer = new AddOfferPages(driver);
		AddOffer.logincredentails(Email, password);
	}

	@Given("Click on offer text")
	public void click_on_offer_text() {
	    
	}

	@When("Click on add button")
	public void click_on_add_button() {
	    
	}

	@When("Add Personal Information")
	public void add_Personal_Information() {
	   
	}

	@When("Address Information")
	public void address_Information() {
	 
	}

	@Then("Specific Information")
	public void specific_Information() {
	    
	}

	@Then("Course Information")
	public void course_Information() {

	}

	@Then("Service Information")
	public void service_Information() {
	    
	}

}
