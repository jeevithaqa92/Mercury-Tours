package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MercuryHomePage {
	
	
	
  @Test
  public void mercuryTours() throws Exception {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		Thread.sleep(3000);
		
		MercuryLogin data=new MercuryLogin(driver);
		
		data.GetTitle();
		data.SetDataFromExcelUser("jeevitha");
		data.SetDataFromExcelpwd("jeevitha123");
		data.SignInButton();
		Thread.sleep(3000);
		
		MercuryRegistartionPage reg=new MercuryRegistartionPage(driver);
		
		reg.SetRegisterLink();
		
		reg.SetFirstName("Raj");
		reg.SetLastName("kanala");
		reg.SetPhone("9981121114");
		reg.SetEmail("raj123@gmail.com");
		reg.SetAdrss("canoga park");
		reg.SetCity("LA");
		reg.SetState("CA");
		reg.SetPostalCode("91303");
		reg.SetCountry();
		reg.SetUserName("Rajasekhar");
		reg.SetPassword("raja@1234");
		reg.SetConfirmPwd("raja@1234");
		reg.Submit();
		
		
		data.ResignIn();
		Thread.sleep(3000);
		
		data.SetDataFromExcelUser("Rajasekhar");
		data.SetDataFromExcelpwd("raja@1234");
		data.SignInButton();
		
		data.GetTitle();
		
		FlightFinderPage finder=new FlightFinderPage(driver);
		
		finder.TripType();
		finder.passengers();
		finder.departingFrom();
		finder.departingOn();
		finder.arrivingIn();
		finder.returnOn();
		finder.serviceClass();
		finder.continueForNextPage();
		
		/*ForManyUserCombinations users=new ForManyUserCombinations(driver);
		users.dataFromExcelSheet();*/
		
		
  }
}
