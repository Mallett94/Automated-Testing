import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class S1S2Tests {
	WebDriver driver;
	
	ExtentReports report = new ExtentReports("C:\\Users\\Administrator\\Documents\\Nathan\\Selenium_Stuff\\S1S2FirefoxTestLog.html", false);
	
	S1Home homepage;
	S1Login loginPage;
	S1PostLogin postLoginPage;
	S2Logout logoutPage;
	
	@Before
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\LocalInstall\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\LocalInstall\\Selenium\\Selenium\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get("http://phptravels.com/");
	}

	@Test
	public void testLogin()
	{
		ExtentTest test = report.startTest("Verify testLogin");
		homepage = new S1Home(driver);
		test.log(LogStatus.INFO, "Browser started.");
		String homepageCaption = homepage.getCaption();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("The easy way to start your online travel business\n100% Opensource Code Applications", homepageCaption);
		test.log(LogStatus.PASS, "Homepage loaded.");
		homepage.clickLoginButton();
		test.log(LogStatus.INFO, "Loading login page.");
		
		loginPage = new S1Login(driver);
		String forgotPassword = loginPage.getText();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Forgot Password?", forgotPassword);
		test.log(LogStatus.PASS, "Login page loaded.");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		loginPage.login();
		test.log(LogStatus.INFO, "Attempting login.");
		
		postLoginPage = new S1PostLogin(driver);
		String welcomeBack = postLoginPage.getHeadingText();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Welcome Back, Darth", welcomeBack);
		test.log(LogStatus.PASS, "Login successful.");
		
		report.endTest(test);
		report.flush();
	}
	
	@Test
	public void testLogout()
	{
		ExtentTest test = report.startTest("Verify testLogout");
		homepage = new S1Home(driver);
		test.log(LogStatus.INFO, "Browser started.");
		String homepageCaption = homepage.getCaption();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("The easy way to start your online travel business\n100% Opensource Code Applications", homepageCaption);
		test.log(LogStatus.PASS, "Homepage loaded.");
		homepage.clickLoginButton();
		test.log(LogStatus.INFO, "Loading login page.");
		
		loginPage = new S1Login(driver);
		String forgotPassword = loginPage.getText();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Forgot Password?", forgotPassword);
		test.log(LogStatus.PASS, "Login page loaded.");
		loginPage.login();
		test.log(LogStatus.INFO, "Attempting login.");
		
		postLoginPage = new S1PostLogin(driver);
		String welcomeBack = postLoginPage.getHeadingText();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Welcome Back, Darth", welcomeBack);
		test.log(LogStatus.PASS, "Login successful.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		postLoginPage.logout();
		test.log(LogStatus.INFO, "Attempting logout.");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		logoutPage = new S2Logout(driver);
		String logoutCaption = logoutPage.getCaptionText();
		
		assertEquals("You have been successfully logged out.", logoutCaption);
		test.log(LogStatus.PASS, "Logout successful.");
		
		report.endTest(test);
		report.flush();
	}
	
	@After
	public void cleanUp()
	{
		try {
			driver.close();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	

}
