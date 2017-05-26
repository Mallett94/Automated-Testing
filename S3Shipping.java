import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Shipping 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"carrier_area\"]/h1");
	By proceed = By.xpath("//*[@id=\"form\"]/p/button/span");
	By checkbox = By.xpath("//*[@id=\"cgv\"]");
	
	public S3Shipping(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickProceed()
	{
		driver.findElement(proceed).click();
	}
	public void clickCheckbox()
	{
		driver.findElement(checkbox).click();
	}

}
