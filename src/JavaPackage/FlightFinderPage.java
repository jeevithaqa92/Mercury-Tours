package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class FlightFinderPage {
	WebDriver driver;
	By RadioBtn=By.name("tripType");
	By Passengrs=By.name("passCount");
	By DepartFrom=By.name("fromPort");
	By DepatOn=By.name("fromMonth");
	By DepatOn1=By.name("fromDay");
	By Arrive=By.name("toPort");
	By ReturnOn=By.name("toMonth");
	By ReturnOn1=By.name("toDay");
	By ServiceCls=By.name("servClass");
	By Airline=By.name("airline");
	By Contin=By.name("findFlights");
	
  public FlightFinderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  this.driver=driver;
	}

public void TripType() {
	  
	   java.util.List<WebElement> lstbuton=driver.findElements(RadioBtn);
	 boolean bval=false;
	 bval=lstbuton.get(0).isSelected();
	 if(bval==true)
	 {
		 lstbuton.get(1).click();
	 }
	 else {
		 lstbuton.get(0).click();
	 }
	 System.out.println("Selecting the trip type");
  }
	 
public void passengers()
{
	Select sel1=new Select(driver.findElement(Passengrs));
	sel1.selectByIndex(2);
    System.out.println("Selecting no of passengers");
	
}
	  
 public void departingFrom()
 {
	 Select sel2=new Select(driver.findElement(DepartFrom));
	 sel2.selectByVisibleText("Seattle");
	 System.out.println("Selecting source location");
 }
 
 public void departingOn()
 {
	 Select sel3=new Select(driver.findElement(DepatOn));
	 sel3.selectByValue("12");
	Select sel4=new Select(driver.findElement(DepatOn1));
	sel4.selectByValue("14");
	System.out.println("Selecting starting date");
	 
 }
 
 public void arrivingIn()
 {
	 Select sel4=new Select(driver.findElement(Arrive));
	 sel4.selectByValue("San Francisco");
	 System.out.println("Selecting destination");
 }
 
 public void returnOn()
 {
	 Select sel3=new Select(driver.findElement(ReturnOn));
	 sel3.selectByValue("1");
	Select sel4=new Select(driver.findElement(ReturnOn1));
	sel4.selectByValue("10");
	System.out.println("Selecting destination date");
 }
 
 public void serviceClass()
 {
	 java.util.List<WebElement> lst1=driver.findElements(ServiceCls);
	 boolean bval=false;
	 bval=lst1.get(0).isSelected();
	 if(bval==true)
	 {
		 lst1.get(1).click();
		 
	 }
	 else 
	 {
		 lst1.get(0).click();
	 }
	 System.out.println("Selecting service class type");
}
 
 public void airLineType()
 {
	 Select sel=new Select(driver.findElement(Airline));
	 sel.selectByVisibleText("Unified Airlines");
	 System.out.println("Selecting airlines type");
 }
 
 public void continueForNextPage()
 {
	 driver.findElement(Contin).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 System.out.println("Continuing for the next page");
 }
 
}