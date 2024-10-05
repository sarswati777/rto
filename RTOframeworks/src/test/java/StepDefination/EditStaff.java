package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EditStaffPages;

public class EditStaff {
	
	WebDriver driver = null;
	EditStaffPages EditStaff;
	
	@Given("I want to login with <Username> as {string} and <password> as {string}")
	public void i_want_to_login_with_Username_as_and_password_as(String Username, String password) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://clients.smartrto.com.au/auth/signin-college-url");
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.collegeurl();
		EditStaff.logincredentails(Username, password);
		
	}

	@Given("Click on staff text")
	public void click_on_staff_text() {
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.staff_txt();
	  
	}

	@When("CLick on edit icon")
	public void click_on_edit_icon() {
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.edit_staff();
	    
	}

	@When("Edit personal information")
	public void edit_personal_information() {
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.edit_personal();
	}

	@When("Edit employment information")
	public void edit_employment_information() {
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.edit_employ();
	}

	@Then("Edit System Access Information")
	public void edit_System_Access_Information() {
		EditStaffPages EditStaff = new EditStaffPages(driver);
		EditStaff.edit_sys();
	}


}
