import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Login 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
	By enterEmail = By.xpath("//*[@id=\"email\"]");
	By enterPassword = By.xpath("//*[@id=\"passwd\"]");
	By submit = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	public S3Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void login()
	{
		driver.findElement(enterEmail).sendKeys("DV@qa.com");
		driver.findElement(enterPassword).sendKeys("fakepass");
		driver.findElement(submit).click();
	}

}
