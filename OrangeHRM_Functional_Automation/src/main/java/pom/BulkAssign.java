package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BulkAssign {

	 private WebDriver driver;
	 private WebDriverWait wait ;
	 private Actions act;
	 private JavascriptExecutor js;
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement leaveTypeDropdown;
 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement annualLeave_AU;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement compassionateLeave_AU;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement maternityLeave_AU;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement paternityLeave_AU;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement sickLeave_AU;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement familyAndMedicalLeave_CA;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement compassionateCareLeave_CA;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement personalLeave_CA;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement vacationLeave_CA;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement sickLeave_CA;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement fromDate;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement toDate;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement comment;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement location;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement subunit;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement additionalEmployeesToInclude;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement assignButton;
	 
	
	 public BulkAssign(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 act = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		 js = (JavascriptExecutor)driver;
	
	  }

	 public void clickOnLeaveTypeDropdown ()
	 {
		 leaveTypeDropdown.click();		
	 }
	 
//	 public void selectAnnualLeave_AU ()
//	 {
//		 wait.until(ExpectedConditions.visibilityOf(selectAnnualLeave_AU));
//	     act.moveToElement(selectAnnualLeave_AU).click().perform();
//		 annualLeave_AU.click();		
//	 }
//	 
//	 public void clickOnBulkLeave ()
//	 {
//		 bulkLeave.click();		
//	 }	
//     
//	 public void clickOnMore ()
//	 {
//		 more.click();		
//	 }	
//
//	 public void clickOnapply ()
//	 {
//		 apply.click();		
//	 }	
//
//	 public void clickOnMyLeaveUsage()
//	 {
//		 myLeaveUsage.click();		
//	 }
//	 
//	 public void clickOnEntitlements ()
//	 {
//		 entitlements.click();		
//	 }	
//
//	 public void clickOnAddEntitlements ()
//	 {
//		 addEntitlements.click();		
//	 }	
//
//	 public void clickOnMyEntitlements ()
//	 {
//		 myEntitlements.click();		
//	 }	
//
//	 public void clickOnEntitlementList ()
//	 {
//		 entitlementList.click();		
//	 }
//	 
//	 public void clickOnConfigure ()
//	 {
//		 configure.click();		
//	 }
//	 
//	 public void clickOnleavePeriod ()
//	 {
//		 leavePeriod.click();		
//	 }
//	 
//	 public void clickOnLeaveTypes ()
//	 {
//		 leaveTypes.click();		
//	 }
//	 
//	 public void clickOnHolidays ()
//	 {
//		 holidays.click();		
//	 }
//	 
//	 public void clickOnWorkingWeekends ()
//	 {
//		 workingWeekends.click();		
//	 }
//	 
//	 public void clickOnBradfordFactorThreshold ()
//	 {
//		 bradfordFactorThreshold.click();		
//	 }
//	 
//	 public void clickOnNotifications ()
//	 {
//		 notifications.click();		
//	 }
//	 
//	 public void clickOnAssignButton ()
//	 {
//		 assignButton.click();		
//	 }


}
