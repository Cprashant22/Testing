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

public class HomePageOrangeHRM {
	

	 private WebDriver driver;
	 private WebDriverWait wait ;
	 private Actions act;
	 private JavascriptExecutor js;
	 
	@FindBy(xpath=("//input[@placeholder='Search']"))
	 private  WebElement search;
	
	@FindBy(xpath=("//i[@class='material-icons']"))
	 private  WebElement searchButton;
	
	 @FindBy(xpath=("//span[text()='HR Administration']"))
	 private  WebElement hrAdministration;
	
	 @FindBy(xpath=("//span[text()='Employee Management']"))
	 private  WebElement employeeManagement;
	
	 @FindBy(xpath=("//span[text()='Reports and Analytics']"))
	 private  WebElement reportsAndAnalytics;

	 @FindBy(xpath=("(//span[text()='Leave'])[1]"))
	 private  WebElement leave;
	 
	 @FindBy(xpath=("(//span[text()='Time Tracking'])[1]"))
	 private  WebElement timeTracking;
	 
	 @FindBy(xpath=("(//span[text()='Attendance'])[1]"))
	 private  WebElement attendance;
	 
	 @FindBy(xpath=("(//span[text()='Recruitment (ATS)'])[1]"))
	 private  WebElement requirement;
 
	 @FindBy(xpath=("(//span[text()='On/Off Boarding'])[1]"))
	 private  WebElement on_offBoarding;
	 
	 @FindBy(xpath=("(//span[text()='Training'])[1]"))
	 private  WebElement training;
	 
	 @FindBy(xpath=("(//span[text()='Performance'])[1]"))
	 private  WebElement performance;
	 
	 @FindBy(xpath=("(//span[text()='Career Development'])[1]"))
	 private  WebElement carrerDevelopment;
	 
	 @FindBy(xpath=("(//span[text()='Request Desk'])[1]"))
	 private  WebElement requestDesk;
	 
	 @FindBy(xpath=("(//span[text()='Integrations'])[1]"))
	 private  WebElement integration;
	 
	 
	
	 public HomePageOrangeHRM(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
		 wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		 js = (JavascriptExecutor)driver;
	  }

	 public void sendInputToSearchField (String searchinput)
	 {
		 search.click();	
		 search.sendKeys(searchinput);
	 }
	 
	 public void clickOnSearchButton ()
	 {
		 searchButton.click();		
	 }
	 
	 public void clickOnHRAdministration ()
	 {
		 hrAdministration.click();		
	 }	
     
	 public void clickOnEmployeeManagement ()
	 {
		 employeeManagement.click();		
	 }	

	 public void clickOnReportsAndAnalytics ()
	 {
		 reportsAndAnalytics.click();		
	 }	

	 public void clickOnLeave ()
	 {
		 leave.click();		
	 }
	 
	 public void clickOnAttendance ()
	 {
		 attendance.click();		
	 }	

	 public void clickOnTimeTracking ()
	 {
		 timeTracking.click();		
	 }	

	 public void clickOn_offBoarding ()
	 {
		 on_offBoarding.click();		
	 }	

	 public void clickOnOnRequirement ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",requirement);
		 wait.until(ExpectedConditions.visibilityOf(requirement));
		 requirement.click();		
	 }	
	 public void clickOntraining ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",training);
		 wait.until(ExpectedConditions.visibilityOf(training));
		 training.click();		
	 }	
	 public void clickOnPerformance ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",performance);
		 wait.until(ExpectedConditions.visibilityOf(performance));
		 performance.click();		
	 }	
	 public void clickOnCarrerDevelopment ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",carrerDevelopment);
		 wait.until(ExpectedConditions.visibilityOf(carrerDevelopment));
		 carrerDevelopment.click();		
	 }	
	 public void clickOnRequestDesk ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",requestDesk);
		 wait.until(ExpectedConditions.visibilityOf(requestDesk));
		 requestDesk.click();		
	 }	
	 public void clickOnIntegration ()
	 {
		 js.executeScript("arguments[0].scrollIntoView(true)",integration);
		 wait.until(ExpectedConditions.visibilityOf(integration));
		 integration.click();		
	 }	

}
