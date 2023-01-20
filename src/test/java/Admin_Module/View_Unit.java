package Admin_Module;

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
public class View_Unit {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Get common data
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties pr=new Properties();
		pr.load(fis);
		String url = pr.getProperty("url");
		 String br = pr.getProperty("browser");
		 String un = pr.getProperty("username");
		 String pwd = pr.getProperty("password");
	//Read data from excel
		 FileInputStream fiss=new FileInputStream("./src/test/resources/Sheet2.xlsx");
		 Workbook book = WorkbookFactory.create(fiss);
		 Sheet sheet = book.getSheet("Organization");
		 WebDriver driver=new FirefoxDriver();
		 driver.get(url);
		 driver.findElement(By.id("login:username")).sendKeys(un);
		 driver.findElement(By.id("login:password")).sendKeys(pwd);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//body[@class='login-box']")).click();
		 Thread.sleep(2000);
		 WebElement admin = driver.findElement(By.id("login:type"));
		// admin.click();
		 Thread.sleep(2000);
		 Select se=new Select(admin);
		 se.selectByValue("admin");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[.='Manage Unit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='+ Add Unit']")).click();
		 Thread.sleep(2000);
		 ArrayList list=new ArrayList();
		 list.add("unitName");
		 list.add("unitDetails");
		 String value = null;
		 for(int i=0;i<=sheet.getLastRowNum();i++) {
			 value = sheet.getRow(i).getCell(1).getStringCellValue();	 
		driver.findElement(By.id((String) list.get(i))).sendKeys(value);
		 }
		 driver.findElement(By.xpath("//input[@value='Add Unit']")).click();
		 
		 Alert dd = driver.switchTo().alert();
		 dd.accept();
		 driver.findElement(By.xpath("//a[.='Manage Unit']")).click();
	String actualdata = driver.findElement(By.xpath("//td[.=' Kilogram ']")).getText();
System.out.println(actualdata);
if(actualdata.contains(value)) {
	System.out.println(value+"manage unit created is correct");
}
else {
	System.out.println("data is incorrect");
}
driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Alert dd1 = driver.switchTo().alert();
dd1.accept();

Thread.sleep(2000);
driver.findElement(By.xpath("(//img[@alt='edit'])[8]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Unit Name']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@placeholder='Details']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Unit Name']")).sendKeys("kgs");
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@placeholder='Details']")).sendKeys("kilograms");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Update Unit']")).click();
Thread.sleep(2000);
Alert dd2 = driver.switchTo().alert();
dd2.accept();
System.out.println("Successfully view unit page is displayed");
	}
}
