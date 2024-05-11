package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leave_Page {

	 private WebDriver driver;
	 private WebDriverWait wait ;
	 private Actions act;
	 private JavascriptExecutor js;
	
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[1]"))
	 private  WebElement leaveList;
 
	 @FindBy(xpath=("//a[@class='top-level-menu-item active']"))
	 private  WebElement assignLeave;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[2]"))
	 private  WebElement bulkAssign;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item '])[3]"))
	 private  WebElement more;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[3]"))
	 private  WebElement apply;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[4]"))
	 private  WebElement myLeaveUsage;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[6]"))
	 private  WebElement myLeave;
	 
	 @FindBy(xpath=("(//a[@class='sub-menu-item-link truncate'])[10]"))
	 private  WebElement entitlements;
	 
	 @FindBy(xpath=("//a[text()='Add Entitlements']"))
	 private  WebElement addEntitlements;
	 
	 @FindBy(xpath=("//a[text()='My Entitlements']"))
	 private  WebElement myEntitlements;
	 
	 @FindBy(xpath=("//a[text()='Entitlement List']"))
	 private  WebElement entitlementList;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement configure;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement leavePeriod;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement leaveTypes;
	
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement holidays;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement workingWeekends;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement bradfordFactorThreshold;
	 
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement notifications;
	 
	 @FindBy(xpath=("(//a[@class='top-level-menu-item'])[5]"))
	 private  WebElement leaveCalender;
	
	 public Leave_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 act = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		 js = (JavascriptExecutor)driver;
	
	  }

	 public void clickOnLeaveList ()
	 {
		 leaveList.click();		
	 }
	 
	 public void clickOnAssignLeave ()
	 {
		 assignLeave.click();		
	 }
	 
	 public void clickOnBulkAssign ()
	 {
		 bulkAssign.click();		
	 }	
     
	 public void clickOnMore ()
	 {
		 more.click();		
	 }	

	 public void clickOnapply ()
	 {
		 apply.click();		
	 }	

	 public void clickOnMyLeaveUsage()
	 {
		 myLeaveUsage.click();		
	 }
	 
	 public void clickOnEntitlements ()
	 {
		 entitlements.click();		
	 }	

	 public void clickOnAddEntitlements ()
	 {
		 addEntitlements.click();		
	 }	

	 public void clickOnMyEntitlements ()
	 {
		 myEntitlements.click();		
	 }	

	 public void clickOnEntitlementList ()
	 {
		 entitlementList.click();		
	 }
	 
	 public void clickOnConfigure ()
	 {
		 configure.click();		
	 }
	 
	 public void clickOnleavePeriod ()
	 {
		 leavePeriod.click();		
	 }
	 
	 public void clickOnLeaveTypes ()
	 {
		 leaveTypes.click();		
	 }
	 
	 public void clickOnHolidays ()
	 {
		 holidays.click();		
	 }
	 
	 public void clickOnWorkingWeekends ()
	 {
		 workingWeekends.click();		
	 }
	 
	 public void clickOnBradfordFactorThreshold ()
	 {
		 bradfordFactorThreshold.click();		
	 }
	 
	 public void clickOnNotifications ()
	 {
		 notifications.click();		
	 }
	 
	 public void clickOnLeaveCalender ()
	 {
		 leaveCalender.click();		
	 }

}
