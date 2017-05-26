import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class S4Test {
	
WebDriver driver;
	
	ExtentReports report = new ExtentReports("C:\\Users\\Administrator\\Documents\\Nathan\\Selenium_Stuff\\S4TestLogFinal.html", true);
	
	S4Home homepage;
	S4Register registration;
	S4PostRegister accountCreated;
	
	@Before
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\LocalInstall\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void testCreateAccount() 
	{
		ExtentTest test = report.startTest("Verify testCreateAccount");
		homepage = new S4Home(driver);
		test.log(LogStatus.INFO, "Browser started.");
		String homepageHeading = homepage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("User Name:", homepageHeading);
		test.log(LogStatus.PASS, "Homepage loaded.");
		homepage.clickRegister();
		test.log(LogStatus.INFO, "Loading account registration page.");
		
		
		registration = new S4Register(driver);
		String registrationHeading = registration.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("  Contact Information", registrationHeading);
		test.log(LogStatus.PASS, "Registration page loaded.");
		test.log(LogStatus.INFO, "Inputting first name.");
		registration.enterFirstname();
		
		
		//String firstName = registration.getFirstname();
		//assertEquals("Test", firstName);
		test.log(LogStatus.INFO, "Inputting last name.");
		registration.enterLastname();
		
		//String lastName = registration.getLastname();
		//assertEquals("Account", lastName);
		test.log(LogStatus.INFO, "Inputting phone number.");
		registration.enterPhone();
		
		//String phoneNo = registration.getPhone();
		//assertEquals("03450747999", phoneNo);
		test.log(LogStatus.INFO, "Inputting email.");
		registration.enterEmail();
		
		
		//String email = registration.getEmail();
		//assertEquals("TA@qa.com", email);
		test.log(LogStatus.INFO, "Inputting address line 1.");
		registration.enterAddress();
		
		
		//String address = registration.getAddress();
		//assertEquals("Empire State Building", address);
		test.log(LogStatus.INFO, "Inputting address line 2.");
		registration.enterAddress2();
		
		
		//String address2 = registration.getAddress2();
		//assertEquals("Floor 5", address2);
		test.log(LogStatus.INFO, "Inputting city.");
		registration.enterCity();
		
		
		//String city = registration.getCity();
		//assertEquals("New York", city);
		test.log(LogStatus.INFO, "Inputting province.");
		registration.enterProvince();
		
		
		test.log(LogStatus.INFO, "Inputting postcode.");
		registration.enterPostcode();
		
		//String postcode = registration.getPostcode();
		//assertEquals("10118", postcode);
		test.log(LogStatus.INFO, "Inputting username.");
		registration.enterUsername();
		
		
		//String username = registration.getUsername();
		//assertEquals("DarthMaul", username);
		test.log(LogStatus.INFO, "Inputting password.");
		registration.enterPassword();
		
		
		//String password = registration.getPassword();
		//assertEquals("fakepass", password);
		test.log(LogStatus.INFO, "Confirming password.");
		registration.confirmPassword();
		
		
		//String confirmPassword = registration.getConfirmPassword();
		//assertEquals("fakepass", confirmPassword);
		//test.log(LogStatus.INFO, "Inputting last name.");
		registration.clickSubmit();
		test.log(LogStatus.INFO, "Account creation confirmation page loading.");
		
		accountCreated = new S4PostRegister(driver);
		String welcome = accountCreated.getWelcome();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Dear Test Account,", welcome);
		test.log(LogStatus.PASS, "Account created successfully.");
		
		report.endTest(test);
		report.flush();
		
	}

}
