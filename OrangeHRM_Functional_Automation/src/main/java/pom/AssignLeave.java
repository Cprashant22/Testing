package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignLeave {
	
	 private WebDriverWait wait ;
	
		 @FindBy(xpath=("//input[@id='leave.assign_employee']"))
		 private  WebElement employeeName;
	 
		 @FindBy(xpath=("//div[@class='oxd-date-input-icon-wrapper']"))
		 private  WebElement fromDateField;
		 
		 @FindBy(xpath=("(//div[@class='oxd-calendar-date'])[25]"))
		 private  WebElement fromDate;
		 
		 @FindBy(xpath=("(//div[@class='oxd-date-input-icon-wrapper'])[2]"))
		 private  WebElement toDateField;
		 
		 @FindBy(xpath=("(//div[@class='oxd-calendar-date'])[28]"))
		 private  WebElement toDate;
		 
		 @FindBy(xpath=("//div[text()='Assign']"))
		 private  WebElement assignButton;
		 	
		 public AssignLeave(WebDriver driver)
		  {
			 PageFactory.initElements(driver,this);
			 wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		  }

		 public void sendOnEmployeeName (String name)
		 {
			 employeeName.click();
			 employeeName.sendKeys(name);
		 }
		 
		 public void selectfromDate ()
		 {
			 fromDateField.click();
			 wait.until(ExpectedConditions.visibilityOf(fromDate));
		     fromDate.click();		
		 }
		 
		 public void selectDToDate ()
		 {
			 toDateField.click();
			 wait.until(ExpectedConditions.visibilityOf(toDate));
		     toDate.click();		
		 }
		 
		 public void clickOnAssignButton ()
		 {
			 assignButton.click();		
		 }	   
		
	}



