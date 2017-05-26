import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3OrderConfirmation 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"center_column\"]/h1");
	By success = By.xpath("//*[@id=\"center_column\"]/p[1]");
	
	public S3OrderConfirmation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public String getSuccess()
	{
		return driver.findElement(success).getText();
	}

}
