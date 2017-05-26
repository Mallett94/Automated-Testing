import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3ConfirmOrder 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"center_column\"]/h1");
	By submit = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
	
	public S3ConfirmOrder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
		

}
