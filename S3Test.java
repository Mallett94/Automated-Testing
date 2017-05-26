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

public class S3Test {
	
	WebDriver driver;
	
	ExtentReports report = new ExtentReports("C:\\Users\\Administrator\\Documents\\Nathan\\Selenium_Stuff\\S3TestLog.html", false);
	
	S3Home homepage;
	S3Tshirts productPage;
	S3Cart cartPage;
	S3Login loginPage;
	S3Addresses addressPage;
	S3Shipping shippingPage;
	S3Payment paymentPage;
	S3ConfirmOrder confirmOrderPage;
	S3OrderConfirmation orderConfirmationPage;
	
	@Before
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\LocalInstall\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\LocalInstall\\Selenium\\Selenium\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
	}

	@Test
	public void testBuyProduct() 
	{
		ExtentTest test = report.startTest("Verify testBuyProduct");
		homepage = new S3Home(driver);
		test.log(LogStatus.INFO, "Browser started.");
		String homepageHeading = homepage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("POPULAR", homepageHeading);
		test.log(LogStatus.PASS, "Homepage loaded.");
		homepage.clickTshirt();
		test.log(LogStatus.INFO, "Loading Tshirt products page.");
		
		
		productPage = new S3Tshirts(driver);
		String tshirtPageHeading = productPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("T-SHIRTS ", tshirtPageHeading);
		test.log(LogStatus.PASS, "Tshirt products page loaded.");
		productPage.addToBasket();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		String productAdded = productPage.confirmAdded();
		assertEquals("There is 1 item in your cart.", productAdded);
		test.log(LogStatus.PASS, "Product added to cart.");
		productPage.clickToCheckout();
		test.log(LogStatus.INFO, "Loading cart summary page.");
		
		
		cartPage = new S3Cart(driver);
		String cartPageHeading = cartPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Your shopping cart", cartPageHeading);
		test.log(LogStatus.PASS, "Shopping cart summary page loaded.");
		cartPage.clickProcced();
		test.log(LogStatus.INFO, "Loading Sign in page.");
		
		
		loginPage = new S3Login(driver);
		String loginPageHeading = loginPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("Authentication", loginPageHeading);
		test.log(LogStatus.PASS, "Sign in page loaded.");
		loginPage.login();
		test.log(LogStatus.INFO, "Loading addresses page.");
		
		
		addressPage = new S3Addresses(driver);
		String addressPageHeading = addressPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("ADDRESSES", addressPageHeading);
		test.log(LogStatus.PASS, "Addresses page loaded.");
		addressPage.clickCheckout();
		test.log(LogStatus.INFO, "Loading shipping page.");
		
		
		shippingPage = new S3Shipping(driver);
		String shippingPageHeading = shippingPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("SHIPPING", shippingPageHeading);
		test.log(LogStatus.PASS, "Shipping page loaded.");
		shippingPage.clickCheckbox();
		shippingPage.clickProceed();
		test.log(LogStatus.INFO, "Loading payment page.");
		
		
		paymentPage = new S3Payment(driver);
		String paymentPageHeading = paymentPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", paymentPageHeading);
		test.log(LogStatus.PASS, "Payment page loaded.");
		paymentPage.choosePayment();
		test.log(LogStatus.INFO, "Loading order summary page.");
		
		
		confirmOrderPage = new S3ConfirmOrder(driver);
		String confirmOrderPageHeading = confirmOrderPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("ORDER SUMMARY", confirmOrderPageHeading);
		test.log(LogStatus.PASS, "Order summary loaded.");
		confirmOrderPage.clickSubmit();
		test.log(LogStatus.INFO, "Loading order confirmation page.");
		
		
		orderConfirmationPage = new S3OrderConfirmation(driver);
		String orderConfirmationPageHeading = orderConfirmationPage.getHeading();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		assertEquals("ORDER CONFIRMATION", orderConfirmationPageHeading);
		test.log(LogStatus.PASS, "Order summary loaded.");
		String orderSuccess = orderConfirmationPage.getSuccess();
		assertEquals("Your order on My Store is complete.", orderSuccess);
		test.log(LogStatus.PASS, "Product bought successfully.");
		
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
