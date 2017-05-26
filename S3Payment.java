import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Payment 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"center_column\"]/h1");
	By cheque = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	
	public S3Payment(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void choosePayment()
	{
		driver.findElement(cheque).click();
	}
	

}
