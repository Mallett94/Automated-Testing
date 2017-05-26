import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S1Login 
{
	WebDriver driver;
	
	By forgotPassword = By.xpath("//*[@id=\"main-body\"]/div[1]/div/div/form/div[4]/a");
	By enterUsername = By.cssSelector("html body section#main-body.container div.row div.col-xs-12.main-content div.logincontainer form div.form-group input#inputEmail.form-control");
	By enterPassword = By.id("inputPassword");
	By submit = By.id("login");
	
	public S1Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getText()
	{
		return driver.findElement(forgotPassword).getText();
	}
	
	public void login()
	{
		driver.findElement(enterUsername).sendKeys("DV@qa.com");
		driver.findElement(enterPassword).sendKeys("Fakepass!");
		driver.findElement(submit).click();
	}
	
	
}
