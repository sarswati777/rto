package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOfferPages {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"url\"]")
	WebElement college_url;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/form/button")
	WebElement submit;
	
	@FindBy(id = "userName")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_Password;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/form/div[3]/div/div/div/div/button")
	WebElement sign_in;
	
	
	
	 public AddOfferPages(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	 }
	 
	 public void college_url() {
	    	college_url.sendKeys("prasantasujal");
	    	submit.click();
	       }
	 
	 public void logincredentails(String Email, String password) {
	    	txt_username.sendKeys(Email);
	    	txt_Password.sendKeys(password);
	    	sign_in.click();


	 }

	}


