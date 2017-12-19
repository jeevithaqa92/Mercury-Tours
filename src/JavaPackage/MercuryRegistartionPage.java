package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MercuryRegistartionPage {
	WebDriver driver;
	By RegisterLink=By.linkText("registration \n" + 
			"        form");
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By Phn=By.name("phone");
	By Email=By.id("userName");
	By adrs=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By PostalCode=By.name("postalCode");
	By Country=By.name("country");
	By Uname=By.id("email");
	By Password=By.name("password");
	By ConfirmPassword=By.name("confirmPassword");
	By Submitt=By.name("register");
	
	public MercuryRegistartionPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@Test
	public void SetRegisterLink() 
	{
		System.out.println("clicking on register link");
		driver.findElement(RegisterLink).click();
	  }
	@Test
	public void SetFirstName(String str1) {
		System.out.println("Trying to register with new information");
		driver.findElement(Fname).sendKeys(str1);
	}
	@Test
	public void SetLastName(String str2)
	{
		driver.findElement(Lname).sendKeys(str2);
	}
	@Test
	public void SetPhone(String phnum) {
		// TODO Auto-generated method stub
		driver.findElement(Phn).sendKeys(phnum);
	}
	@Test
	public void SetEmail(String str3)
	{
		driver.findElement(Email).sendKeys(str3);
	}
	@Test
	public void SetAdrss(String str4)
	{
		driver.findElement(adrs).sendKeys(str4);
	}
	@Test
	public void SetCity(String str5)
	{
		driver.findElement(City).sendKeys(str5);
	}
	@Test
	public void SetState(String str6)
	{
		driver.findElement(State).sendKeys(str6);
	}
	@Test
	public void SetPostalCode(String str7)
	{
		
		driver.findElement(PostalCode).sendKeys(str7);
	}
	@Test
	public void SetCountry()
	{
		Select select=new Select(driver.findElement(Country));
		select.selectByVisibleText("INDIA");
	}
	@Test
	public void SetUserName(String str8)
	{
		driver.findElement(Uname).sendKeys(str8);
	}
	@Test
	public void SetPassword(String str9)
	{
		driver.findElement(Password).sendKeys(str9);
	}
	@Test
	public void SetConfirmPwd(String str10)
	{
		driver.findElement(ConfirmPassword).sendKeys(str10);
	}
	
	@Test
	public void Submit() {
		driver.findElement(Submitt).click();
		System.out.println("Registred successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	
}
