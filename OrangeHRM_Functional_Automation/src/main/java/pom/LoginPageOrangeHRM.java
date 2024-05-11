package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrangeHRM {

	 
	 @FindBy(xpath=("//input[@id='txtUsername']"))
	 private  WebElement userName;
	
	 @FindBy(xpath=("//input[@id='txtPassword']"))
	 private  WebElement password;

	 @FindBy(xpath=("//button[@type='submit']"))
	 private  WebElement loginButton;
	
	
	 public LoginPageOrangeHRM(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }

	public void sendUserName (String userID)
	 {
		 userName.click();
		 userName.sendKeys(userID);
	 }
	
	 public void sendPassword (String passwordID)
	 {
		 password.click();
		 password.sendKeys(passwordID);
	 }

	 public void clickOnLoginButton ()
	 {
		 loginButton.click();		
	 }	

}
