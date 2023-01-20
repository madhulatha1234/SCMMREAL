package Manufacturer_module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;

public class Productadded {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileUtility fu=new FileUtility();
		ExcelUtility eu=new ExcelUtility();
		WebDriverUtility wu=new WebDriverUtility();
		
FileInputStream fis=new FileInputStream("./src/test/resources/CommonData1.properties");
Properties po=new Properties();
po.load(fis);
String ur = po.getProperty("url");
String un = po.getProperty("username");
String ps = po.getProperty("password");
FileInputStream fis1=new FileInputStream("./src/test/resources/Sheet2.xlsx");
Workbook book = WorkbookFactory.create(fis1);
Sheet sh = book.getSheet("Organization");
WebDriver driver=new FirefoxDriver();
driver.get(ur);
driver.findElement(By.id("login:username")).sendKeys(un);
driver.findElement(By.id("login:password")).sendKeys(ps);
Thread.sleep(2000);
driver.findElement(By.xpath("//body[@class='login-box']")).click();
Thread.sleep(2000);
WebElement admin = driver.findElement(By.id("login:type"));
Thread.sleep(2000);
Select se=new Select(admin);
se.selectByValue("manufacturer");
driver.findElement(By.xpath("//input[@value='Login']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Add Products")).click();
ArrayList list=new ArrayList();
list.add("product:name");
list.add("product:price");
list.add("product:description");
for(int i=0;i<=sh.getLastRowNum();i++) {
	String value = sh.getRow(i).getCell(2).getStringCellValue();
	driver.findElement(By.id((String) list.get(i))).sendKeys(value);

}
WebElement drop1 = driver.findElement(By.id("product:unit"));
Select sel=new Select(drop1);
sel.selectByVisibleText("KG");
Thread.sleep(2000);
WebElement drop2 = driver.findElement(By.xpath("//select[@id='product:category']"));
Select sel1=new Select(drop2);
sel1.selectByIndex(2);
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@name='rdbStock'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Add Product']")).click();
Thread.sleep(2000);
Alert ale = driver.switchTo().alert();
ale.accept();
driver.findElement(By.linkText("Products")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("((//tbody)[2]/tr)[last()]/td[8]")).click();
Thread.sleep(1000);
WebElement edit = driver.findElement(By.id("product:name"));
edit.clear();
Thread.sleep(1000);
edit.sendKeys("veg puffs");
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@name='rdbStock'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Update Product']")).click();
Alert ale1 = driver.switchTo().alert();
ale1.accept();
Thread.sleep(1000);
driver.findElement(By.xpath("((//tbody)[2]/tr)[last()]/td[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(1000);
Alert ale2 = driver.switchTo().alert();
ale2.accept();
Thread.sleep(1000);

System.out.println("Successfully completed");
	}

}
