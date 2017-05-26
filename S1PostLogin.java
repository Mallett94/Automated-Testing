import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S1PostLogin 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"main-body\"]/div[1]/div[1]/div/h1");
	By logout = By.xpath("//*[@id=\"Secondary_Sidebar-Client_Shortcuts-Logout\"]");
	
	public S1PostLogin (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeadingText()
	{
		return driver.findElement(heading).getText();
	}
	
	public void logout()
	{
		driver.findElement(logout).click();
	}

}
