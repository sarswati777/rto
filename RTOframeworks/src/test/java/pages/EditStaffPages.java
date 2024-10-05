package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditStaffPages {
	
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
	
	@FindBy(xpath = "/html/body/div/section/aside/div/ul/li[2]/span")
	WebElement staff_txt;
	
	@FindBy(xpath = "/html/body/div[1]/section/section/main/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[2]/td[9]/div/div[1]/div")
	WebElement edit_staff;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[10]/div/div/div/div/div/button")
	WebElement personal_next;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[2]/div[2]/div/div/div/div")
	WebElement employ_next;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/div/div/div")
	WebElement sys_next;
	
	
	 public EditStaffPages(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	 }
	 
	     public void collegeurl() {
	    	college_url.sendKeys("prasantasujal");
	    	submit.click();
	       }
		  
		  public void logincredentails(String Username, String password) {
		    	txt_username.sendKeys(Username);
		    	txt_Password.sendKeys(password);
		    	sign_in.click();
		    }
		  
		  public void staff_txt() {
			  staff_txt.click();
		  }
		  
		  public void edit_staff() {
			  edit_staff.click();
		  }
		  
		  public void edit_personal() {
			  personal_next.click();
		  }
		  
		  public void edit_employ() {
			  employ_next.click();
		  }
		  
		  public void edit_sys() {
			  sys_next.click();
		  }
	  }


