package Contact_Modules;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

public class CreateContactUsingOrgName {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./src/test/resources/Commondata_VTIGER.properties");
Properties po=new Properties();
po.load(fis);
String ur = po.getProperty("url");
String un = po.getProperty("username");
String pw = po.getProperty("password");
FileInputStream fis1=new FileInputStream("./src/test/resources/New_order.xlsx");
Workbook work = WorkbookFactory.create(fis1);
Sheet sh = work.getSheet("Sheet1");

WebDriver driver=new FirefoxDriver();
driver.get(ur);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pw);

driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Organizations")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
String orgname = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();

	}

}
