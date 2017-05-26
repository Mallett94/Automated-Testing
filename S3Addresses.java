import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Addresses 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"center_column\"]/h1");
	By checkout = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	
	public S3Addresses(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickCheckout()
	{
		driver.findElement(checkout).click();
	}

}
