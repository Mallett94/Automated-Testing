import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2Logout 
{
	WebDriver driver;
	
	By caption = By.xpath("//*[@id=\"main-body\"]/div[1]/div/div/div[2]");
	
	public S2Logout (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getCaptionText()
	{
		return driver.findElement(caption).getText();
	}

}
