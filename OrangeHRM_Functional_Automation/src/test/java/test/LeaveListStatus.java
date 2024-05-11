package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.HomePageOrangeHRM;
import pom.LeaveListPage;
import pom.LoginPageOrangeHRM;
import utils.Utility;

public class LeaveListStatus {
	private WebDriver driver;
	private  String testID;
	private LoginPageOrangeHRM loginPageOrangeHRM;
	private HomePageOrangeHRM homePageOrangeHRM;
	private LeaveListPage leaveListPage;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) 
	{
		
	   if (browser.equals("Chrome"))
		{
		driver = Base.openChromeBrowser();	
		}
		if (browser.equals("Firefox"))
		{
			driver = Base.openFirefoxBrowser();	
		}
		if (browser.equals("Edge"))
		{
			driver = Base.openEdgeBrowser();
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void initiallizePOMClasses ()
	{
		driver.get("https://testprojectgroup9-trials712.orangehrmlive.com/auth/login");
		loginPageOrangeHRM = new LoginPageOrangeHRM(driver);
		homePageOrangeHRM = new HomePageOrangeHRM(driver);
		leaveListPage = new LeaveListPage(driver);
	}
	@BeforeMethod
	public void loginUser() throws EncryptedDocumentException, IOException
	{   
		 String username = Utility.getDataFromExcelSheet("LoginDataOrangeHRM", 2, 1);
		 String password = Utility.getDataFromExcelSheet("LoginDataOrangeHRM", 2, 2);
		loginPageOrangeHRM.sendUserName(username);
		loginPageOrangeHRM.sendPassword(password);
		loginPageOrangeHRM.clickOnLoginButton();
	}
	
	@Test(priority=1 )
	public void verifyUserCheckLeaveStatusOfEmployees() throws InterruptedException, IOException 
	{    	 
		homePageOrangeHRM.clickOnLeave();
		leaveListPage.selectFromDate();
		//leaveListPage.SelectOnToField();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		leaveListPage.selectStatusAllCheckbox();
		leaveListPage.clickOnSearchButton();
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		File Source2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		for (int i=0; i<1;i++)
	      { 
			File Destination2 = new File("D:\\Screenshots\\OrangeHRM\\image3"+i+".jpg");
	        FileHandler.copy(Source2, Destination2);
	      }
		
	}
	

	
	@AfterMethod
	public void takeScreenshotOfFailedTest(ITestResult result) throws IOException 
	    {
		  
//		  if (ITestResult.FAILURE == result.getStatus())
//		  {
//			  Utility.captureScreenshot(testID, driver);
//	  }
	
	}
	@AfterClass
	public void closePOMclasses()
	{
		loginPageOrangeHRM = null;
		homePageOrangeHRM= null;
		leaveListPage = null;
	}
	@AfterTest
	public void closeBrowser()
	{
//		driver.close();
//		driver = null;
//		System.gc();
	} 
}
