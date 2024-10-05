package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class activatepges {
	
	
	@FindBy(id = "userName")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_Password;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/form/div[3]/div/div/div/div/button")
	WebElement sign_in;
	
	@FindBy(xpath = "/html/body/div/section/aside/div/ul/li[2]/span")
	WebElement staff_txt;

	@FindBy(xpath = "/html/body/div/section/section/main/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/div[4]/div/div")
	WebElement activate_icon;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	WebElement yes_btn;
	
	
	WebDriver driver;
	
	 public activatepges (WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	 }
		  
		  public void logincredentails(String userName, String password) {
		    	txt_username.sendKeys(userName);
		    	txt_Password.sendKeys(password);
		    	sign_in.click();
		    }

		  
		  public void staff_text() {
			  staff_txt.click();
		  }
		  
		  public void activate() {
			  activate_icon.click();
		  }
		  
		  public void yes_btn() {
			  yes_btn.click();
		  }
}
