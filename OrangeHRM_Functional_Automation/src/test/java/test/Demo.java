package test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import pom.HomePageOrangeHRM;
import pom.LeaveListPage;
import pom.LoginPageOrangeHRM;

public class Demo {
public static void main(String[] args) throws InterruptedException, IOException {

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	driver.get("https://testprojectgroup9-trials712.orangehrmlive.com/auth/login");
	
	LoginPageOrangeHRM login_Page_OrangeHRM = new LoginPageOrangeHRM(driver);
	login_Page_OrangeHRM.sendUserName("Admin");
	login_Page_OrangeHRM.sendPassword("b@tmNIFF05");
	login_Page_OrangeHRM.clickOnLoginButton();
	
	HomePageOrangeHRM home_Page_OrangeHRM = new HomePageOrangeHRM(driver);
	home_Page_OrangeHRM.clickOnLeave();
	Thread.sleep(7000);
	
	LeaveListPage leaveListPage = new LeaveListPage(driver);
	leaveListPage.selectFromDate();
	leaveListPage.SelectOnToField();
	leaveListPage.selectStatusAllCheckbox();
	leaveListPage.clickOnSearchButton();
	Thread.sleep(3000);
	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(1000);

	 File Source1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File Destination1 = new File("D:\\Screenshots\\OrangeHRM\\image1.png");
     FileHandler.copy(Source1, Destination1);
	}
}

