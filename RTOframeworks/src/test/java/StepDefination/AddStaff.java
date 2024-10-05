package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.AddStaffPages;

public class AddStaff {
	WebDriver driver = null;
	AddStaffPages addstaff;
	
	@Given("I want to login witth <email> as {string} and <password> as {string}")
	public void i_want_to_login_witth_email_as_and_password_as(String email, String password) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://clients.smartrto.com.au/auth/signin-college-url");
		AddStaffPages addstaff = new AddStaffPages(driver);
		addstaff.college_url();
		addstaff.logincredentails(email, password);
	}

	@Given("CLick on staff text")
	public void click_on_staff_text() {
		AddStaffPages addstaff = new AddStaffPages(driver);
		addstaff.staff();
	}

	@When("Add personal information")
	public void add_personal_information() {
		AddStaffPages addstaff = new AddStaffPages(driver);
		addstaff.personal();
	}

	@When("Add Employment information")
	public void add_Employment_information() {
		AddStaffPages addstaff = new AddStaffPages(driver);
		addstaff.employment();
	    
	}

	@When("Add System Access Information")
	public void add_System_Access_Information() {
		AddStaffPages addstaff = new AddStaffPages(driver);
		addstaff.systemaccess();
	    
	}


}
