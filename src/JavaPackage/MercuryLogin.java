package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MercuryLogin 
{
	 WebDriver driver;
	 By UserName=By.name("userName");
	 By PassWord=By.name("password");
	 By SignIn=By.name("login");
	 By ReSignIn=By.linkText("sign-in");
	 
  public MercuryLogin(WebDriver driver) {
	  
		// TODO Auto-generated constructor stub
	  this.driver=driver;
	}
@Test
public void GetTitle()
{
	String strn=driver.getTitle();
	System.out.println(strn);
}
@Test
  public void SetDataFromExcelUser(String str) 
	{
	  System.out.println("Trying with invalid username");
	 driver.findElement(UserName).sendKeys(str);
	  }

public void SetDataFromExcelpwd(String pswd)
{
	System.out.println("Trying with invalid password");
	driver.findElement(PassWord).sendKeys(pswd);
}

public void SignInButton()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(SignIn).click();
}

public void ResignIn()
{
	System.out.println("Again trying to resign in ");
	driver.findElement(ReSignIn).click();
}


}
