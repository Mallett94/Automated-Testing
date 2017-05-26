import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4PostRegister 
{
	WebDriver driver;
	
	By welcome = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]");
	
	public S4PostRegister(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getWelcome()
	{
		return driver.findElement(welcome).getText();
	}

}
