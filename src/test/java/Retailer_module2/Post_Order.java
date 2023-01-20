package Retailer_module2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Post_Order {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./src/test/resources/CommonData1.properties");
Properties pro=new Properties();
pro.load(fis);
//Send key value
String ur = pro.getProperty("url");
String un = pro.getProperty("username");
String pwd = pro.getProperty("password");
FileInputStream fis1=new FileInputStream("./src/test/resources/New_order.xlsx");
Workbook book = WorkbookFactory.create(fis1);
Sheet sheet = book.getSheet("Sheet1");
//String res = sheet.getRow(1).getCell(0).getStringCellValue();
WebDriver driver=new FirefoxDriver();
driver.get(ur);
driver.findElement(By.id("login:username")).sendKeys(un);
driver.findElement(By.id("login:password")).sendKeys(pwd);
WebElement dropdown = driver.findElement(By.id("login:type"));
Select sel =new Select(dropdown);
sel.selectByValue("retailer");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.linkText("New Order")).click();
String res = sheet.getRow(0).getCell(1).toString();
driver.findElement(By.xpath("//input[@class='quantity'and@id='1']")).sendKeys(res);
driver.findElement(By.id("btnSubmit")).click();
driver.findElement(By.xpath("(//tbody/tr/td[5])[last()]")).click();;
WebElement value1 = driver.findElement(By.xpath("((//tbody)[3]//td[1])[1]"));
String va = value1.getText();
System.out.println(va);
driver.findElement(By.xpath("//input[@value='Log out']")).click();
Thread.sleep(2000);
driver.get("http://rmgtestingserver/domain/Supply_Chain_Management/index.php");
driver.findElement(By.id("login:username")).sendKeys(un);
driver.findElement(By.id("login:password")).sendKeys(pwd);
driver.findElement(By.xpath("//body[@class='login-box']")).click();
Thread.sleep(2000);
WebElement dropdown1 = driver.findElement(By.id("login:type"));
Select sel1 =new Select(dropdown1);
sel1.selectByValue("admin");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.linkText("Orders")).click();
WebElement expected = driver.findElement(By.xpath("//tbody/tr/td[6]"));
expected.click();
WebElement expected2 = driver.findElement(By.xpath("//tbody/tr/td[1]"));
WebElement value3 = driver.findElement(By.xpath("(//tbody)[3]//tr[2]/td[1]"));
String va1 = value3.getText();
System.out.println(va1);
if(va.equals(va1)) {
	System.out.println("order is confirm");
}
else {
	System.out.println("order is not confirm");
}
	}
}
