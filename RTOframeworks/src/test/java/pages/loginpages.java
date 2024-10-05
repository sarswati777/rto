package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpages {
	
  WebDriver driver;
  By txt_username = By.xpath("//*[@id=\"userName\"]");
  By txt_password = By.xpath("//*[@id=\"password\"]");
  By btn_login = By.xpath("//*[@id=\"root\"]/div/div[1]/form/div[3]/div/div/div/div/button");
  
  public loginpages(WebDriver driver) {
	  this.driver= driver;
	  
  }
  
  public void logincredentails(String username, String password) {
	  driver.findElement(txt_username).sendKeys(username);
	  driver.findElement(txt_password).sendKeys(password);
	 
  }
  
  public void clicksignin() {
	  driver.findElement(btn_login).click();
  }
}
	


