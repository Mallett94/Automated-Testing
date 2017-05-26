import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4Home 
{
WebDriver driver;
	
	By heading = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font");
	By register = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	
	public S4Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void clickRegister(){
		driver.findElement(register).click();
	}

}
