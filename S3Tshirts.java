import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3Tshirts 
{
	WebDriver driver;
	
	By heading = By.xpath("//*[@id=\"center_column\"]/h1/span[1]");
	By product = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
	By confirm = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]");
	By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	
	public S3Tshirts(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void addToBasket()
	{
		driver.findElement(product).click();
	}
	
	public String confirmAdded()
	{
		return driver.findElement(confirm).getText();
	}
	
	public void clickToCheckout()
	{
		driver.findElement(checkout).click();
	}

}
