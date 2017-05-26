import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Home 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"home-page-tabs\"]/li[1]/a");
	By tshirtLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	
	public S3Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickTshirt(){
		driver.findElement(tshirtLink).click();
	}
	

}
