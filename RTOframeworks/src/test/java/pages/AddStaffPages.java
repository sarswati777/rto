package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddStaffPages {

	 WebDriver driver;
	  By college_url = By.xpath("//*[@id=\"url\"]");
	  By submit_url = By.xpath("/html/body/div/div/div[1]/form/button");
	  By txt_username = By.xpath("//*[@id=\"userName\"]");
	  By txt_password = By.xpath("//*[@id=\"password\"]");
	  By btn_login = By.xpath("//*[@id=\"root\"]/div/div[1]/form/div[3]/div/div/div/div/button");
	  
	  By txt_staff = By.xpath("/html/body/div/section/aside/div/ul/li[2]/span");
	  
	  By btn_add = By.xpath("/html/body/div/section/section/main/div[2]/div[1]/div[1]/div[2]/button");
	  
	 // By select_title = By.xpath("/html/body/div[3]/div/div[3]/div/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div/div/div/div/span[2]");
	  
	  //By select = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/div/div[1]");
	  
	  By first_name = By.id("firstName");
	  By last_name = By.id("lastName");
	  By country = By.id("country");
	  By select_country = By.className("ant-select-item-option-content");
	  
	  By add_address = By.id("address");
	  By add_city = By.id("city");
	  By add_state = By.id("state");
	  By post_code = By.id("postCode");
	  By phone_number = By.id("phoneNo");
	  By mobile_number = By.id("mobileNo");
	  By email = By.id("email");
	  By college_email = By.id("collegeEmail");
	  By signature = By.id("signatoryText");
	  By Egncy_con_name = By.id("emergencyContactName");
	  By Emgncy_con_no = By.id("emergencyContactNumber");
	  By btn_next = By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[10]/div/div/div/div/div/button");
	  By add_staff_no = By.xpath("//*[@id=\"staffNumber\"]");
	  By position = By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div/span[2]");
	  By select_position = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[2]");
	  By next_btn = By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[2]/div[2]/div/div/div/div/button");
	  By password = By.id("password");
	  By confirm_pass = By.id("confirmPassword");
	  By add_staff = By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/div/div/div/button");
	  
	  public AddStaffPages(WebDriver driver) {
		  this.driver= driver;
	  }
    
	  public void college_url() {
		  driver.findElement(college_url).sendKeys("prasantasujal");
		  driver.findElement(submit_url).click();
	  }
	  
	  public void logincredentails(String email, String password) {
			  driver.findElement(txt_username).sendKeys(email);
			  driver.findElement(txt_password).sendKeys(password);
              driver.findElement(btn_login).click();
}
	  public void staff() {
		  driver.findElement(txt_staff).click();
		  driver.findElement(btn_add).click();
	
}
	  public void personal() {
	//	  driver.findElement(select_title).click();
//		  driver.findElement(select).click();
		  driver.findElement(first_name).sendKeys("Meera");
		  driver.findElement(last_name).sendKeys("Sharma");
		  driver.findElement(country).click();
		  driver.findElement(select_country).click();
		  driver.findElement(add_address).sendKeys("Maitland Hospital, Metford Road, Australia");
		  driver.findElement(add_city).sendKeys("Nsw");
		  driver.findElement(add_state).sendKeys("Sydney");
		  driver.findElement(post_code).sendKeys("7878");
		  driver.findElement(phone_number).sendKeys("9809898789");
		  driver.findElement(mobile_number).sendKeys("9889896780");
		  driver.findElement(email).sendKeys("defoxo3171@fna6.com");
		  driver.findElement(college_email).sendKeys("gojodi5354@fna6.com");
		  driver.findElement(signature).sendKeys("meera");
		  driver.findElement(Egncy_con_name).sendKeys("Sajin Shrestha");
		  driver.findElement(Emgncy_con_no).sendKeys("9878787987");
		  driver.findElement(btn_next).click();
		  driver.findElement(first_name).sendKeys("Meera");
		  driver.findElement(last_name).sendKeys("Sharma");
		  driver.findElement(btn_next).click();
	  }
	  
	  public void employment() {
		  driver.findElement(add_staff_no).sendKeys("7898");
		  driver.findElement(position).click();
		  driver.findElement(select_position).click();
		  driver.findElement(next_btn).click();
		  
	  }
	  
	  public void systemaccess() {
		  driver.findElement(password).sendKeys("Admin123@");
		  driver.findElement(confirm_pass).sendKeys("Admin123@");
		  driver.findElement(add_staff).click();
		  
	  }
}
