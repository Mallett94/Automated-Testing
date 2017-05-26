import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4Register 
{
WebDriver driver;
	
	By heading = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td");
	By firstName = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input");
	By lastName = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input");
	By phone = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input");
	By email = By.xpath("//*[@id=\"userName\"]");
	By address = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input");
	By address2 = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input");
	By city = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input");
	By province = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input");
	By postcode = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input");
	By username = By.xpath("//*[@id=\"email\"]");
	By password = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");
	By confirmPassword = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input");
	By submit = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");
	
	public S4Register(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getHeading()
	{
		return driver.findElement(heading).getText();
	}
	
	public void enterFirstname()
	{
		driver.findElement(firstName).sendKeys("Test");
	}
	
	public String getFirstname()
	{
		return driver.findElement(firstName).getText();
	}
	
	public void enterLastname()
	{
		driver.findElement(lastName).sendKeys("Account");
	}
	
	public String getLastname()
	{
		return driver.findElement(lastName).getText();
	}
	
	public void enterPhone()
	{
		driver.findElement(phone).sendKeys("03450747999");
	}
	
	public String getPhone()
	{
		return driver.findElement(phone).getText();
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("TA@qa.com");
	}
	
	public String getEmail()
	{
		return driver.findElement(email).getText();
	}
	
	public void enterAddress()
	{
		driver.findElement(address).sendKeys("Empire State Building");
	}
	
	public String getAddress()
	{
		return driver.findElement(address).getText();
	}
	
	public void enterAddress2()
	{
		driver.findElement(address2).sendKeys("Floor 5");
	}
	
	public String getAddress2()
	{
		return driver.findElement(address2).getText();
	}
	
	public void enterCity()
	{
		driver.findElement(city).sendKeys("New York");
	}
	
	public String getCity()
	{
		return driver.findElement(city).getText();
	}
	
	public void enterProvince()
	{
		driver.findElement(province).sendKeys("New York");
	}
	
	public String getProvince()
	{
		return driver.findElement(province).getText();
	}
	
	public void enterPostcode()
	{
		driver.findElement(postcode).sendKeys("10118");
	}
	
	public String getPostcode()
	{
		return driver.findElement(postcode).getText();
	}
	
	public void enterUsername()
	{
		driver.findElement(username).sendKeys("Tester");
	}
	
	public String getUsername()
	{
		return driver.findElement(username).getText();
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("fakepass");
	}
	
	public String getPassword()
	{
		return driver.findElement(password).getText();
	}
	
	public void confirmPassword()
	{
		driver.findElement(confirmPassword).sendKeys("fakepass");
	}
	
	public String getConfirmPassword()
	{
		return driver.findElement(confirmPassword).getText();
	}
	
	public void clickSubmit(){
		driver.findElement(submit).click();
	}

}
