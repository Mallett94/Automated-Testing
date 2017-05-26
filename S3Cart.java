import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Cart 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
	By proceed = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	
	public S3Cart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickProcced()
	{
		driver.findElement(proceed).click();
	}

}
