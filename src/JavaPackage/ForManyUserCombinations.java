package JavaPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ForManyUserCombinations extends MercuryLogin {
	By SignOff=By.linkText("SIGN-OFF");
	
	public ForManyUserCombinations(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}


/*public class ForManyUserCombinations{
	WebDriver driver;
	By UserName=By.name("userName");
	 By PassWord=By.name("password");
	 By SignIn=By.name("login");
	 By SignOff=By.linkText("SIGN-OFF");
	
  public ForManyUserCombinations(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  this.driver=driver;
	}*/

@Test
  public void dataFromExcelSheet() throws Exception {
	  
	  File myfile=new File("C:\\Users\\Sashank\\Documents\\DataDrivenSample.xlsx");
	  FileInputStream readFile=new FileInputStream(myfile);
	  XSSFWorkbook wb=new XSSFWorkbook(readFile);
	  XSSFSheet sheet=wb.getSheet("Sheet1");
	  int rc=sheet.getLastRowNum();
	  System.out.println(rc);
	  String result="";
	  
	  for(int i=1;i<=rc;i++)
	  {
		  XSSFRow hr=sheet.getRow(i);
		  XSSFCell cell1=hr.getCell(0);
		  XSSFCell cell2=hr.getCell(1);
		  
		  String UName=cell1.getStringCellValue();
		  String Pwd=cell2.getStringCellValue();
		  
		  driver.findElement(UserName).sendKeys(UName);
		  driver.findElement(PassWord).sendKeys(Pwd);
		  driver.findElement(SignIn).click();
		  Thread.sleep(3000);
		  
		  if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
		  {
			  result="Success";
			 driver.findElement(SignOff).click(); 
			 Thread.sleep(3000);
		  }
		  else
		  {
			  result="Invalid credentials";
		  }
		  
		  System.out.println(result);
	  }
	  wb.close();
	  readFile.close();
	  driver.close();
  }
}
