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

public class LeaveListPage {
	

	 private WebDriver driver;
	 private WebDriverWait wait ;
	 private Actions act;
	 private JavascriptExecutor js;

	@FindBy(xpath = ("(//i[text()='date_range'])[1]"))
	private WebElement fromField;
	
	@FindBy(xpath = ("(//table//tr[1]/td[3]/div)[1]"))
	private WebElement fromDate;
	
	@FindBy(xpath = ("//sf-decorator[2]//span[1]//i"))
	private WebElement toField;
	
	@FindBy(xpath = ("(//table//tr[3]/td[4]/div)[2]"))
	private WebElement toDate;

	@FindBy(xpath = ("(//form//input)[5]"))
	private WebElement employee;

	@FindBy(xpath = ("(//form//input)[6]"))
	private WebElement subunit;

	@FindBy(xpath = ("(//form//input)[7]"))
	private WebElement location;

	@FindBy(xpath = ("(//form//input)[8]"))
	private WebElement leaveType;

	@FindBy(xpath = ("(//form//input)[9]"))
	private WebElement jobTitle;

	@FindBy(xpath = ("(//form//input)[10]"))
	private WebElement employmentStatus;

	@FindBy(xpath = ("(//form//input)[11]"))
	private WebElement jobCategory;

	@FindBy(xpath = ("(//form//input)[12]"))
	private WebElement workSchedule;

	@FindBy(xpath = ("(//form//input)[13]"))
	private WebElement costCentre;

	@FindBy(xpath = ("(//form//input)[14]"))
	private WebElement attachmentCentre;

	@FindBy(xpath = ("//label[@for='pastEmployee']"))
	private WebElement includePastEmployeesCheckbox;

	@FindBy(xpath = ("//label[@for='onlyShowMySubordinates']"))
	private WebElement onlyShowMySubordinatesLeaveCheckbox;

	@FindBy(xpath = ("//label[@for='statusAll']"))
	private WebElement statusAllCheckbox;

	@FindBy(xpath = ("//label[@for='cancelled']"))
	private WebElement cancelledCheckbox;

	@FindBy(xpath = ("//label[@for='taken']"))
	private WebElement takenCheckbox;

	@FindBy(xpath = ("//label[@for='rejected']"))
	private WebElement rejectedCheckbox;

	@FindBy(xpath = ("//button[text()='Search']"))
	private WebElement searchButton;
	
	@FindBy(xpath = ("//a[text()='Reset']"))
	private WebElement resetButton;
	
	@FindBy(xpath = ("//a[text()='Export Summary']"))
	private WebElement exportSummaryButton;
	
	@FindBy(xpath = ("//a[text()='Export Detail']"))
	private WebElement exportDetailButton;

	public LeaveListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		 js = (JavascriptExecutor)driver;

	}

	public void selectFromDate() {
		fromField.click();
		wait.until(ExpectedConditions.visibilityOf(fromDate));
		fromDate.click();
	}

	public void SelectOnToField() {
		toField.click();
		wait.until(ExpectedConditions.visibilityOf(toDate));
		toDate.click();
	}

	public void selectStatusAllCheckbox() {
		statusAllCheckbox.click();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

//	public void clickOnapply() {
//		apply.click();
//	}
//
//	public void clickOnMyLeaveUsage() {
//		myLeaveUsage.click();
//	}
//
//	public void clickOnEntitlements() {
//		entitlements.click();
//	}
//
//	public void clickOnAddEntitlements() {
//		addEntitlements.click();
//	}
//
//	public void clickOnMyEntitlements() {
//		myEntitlements.click();
//	}
//
//	public void clickOnEntitlementList() {
//		entitlementList.click();
//	}
//
//	public void clickOnConfigure() {
//		configure.click();
//	}
//
//	public void clickOnleavePeriod() {
//		leavePeriod.click();
//	}
//
//	public void clickOnLeaveTypes() {
//		leaveTypes.click();
//	}
//
//	public void clickOnHolidays() {
//		holidays.click();
//	}
//
//	public void clickOnWorkingWeekends() {
//		workingWeekends.click();
//	}
//
//	public void clickOnBradfordFactorThreshold() {
//		bradfordFactorThreshold.click();
//	}
//
//	public void clickOnNotifications() {
//		notifications.click();
//	}
//
//	public void clickOnLeaveCalender() {
//		leaveCalender.click();
//	}

}
