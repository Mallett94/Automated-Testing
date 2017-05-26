import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S1Home 
{
	WebDriver driver;
	
	By caption = By.xpath("/html/body/section[1]/div/div/div[1]/div");
	By loginLink = By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a");
	
	public S1Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getCaption()
	{
		return driver.findElement(caption).getText();
	}
	
	public void clickLoginButton()
	{
		driver.get(driver.findElement(loginLink).getAttribute("href"));
	}
}