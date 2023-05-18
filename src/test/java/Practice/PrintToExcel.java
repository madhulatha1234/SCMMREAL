package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintToExcel {
@Test
public void test() throws InterruptedException, EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	driver.findElement(By.xpath("//img[@alt='Kabzaa']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Book tickets']")).click();
	driver.findElement(By.xpath("(//span[.='2D'])[1]")).click();
	
	List<WebElement> ele = driver.findElements(By.xpath("//a[@class='__venue-name']"));
	//String text="";
	for (int i=0;i<ele.size();i++) {
		String text=ele.get(i).getText();
		System.out.println(text);
		FileInputStream fis=new FileInputStream("./src/test/resources/New Microsoft Office Excel Worksheet.xlsx");
		
		Workbook c = WorkbookFactory.create(fis);
		Sheet u = c.getSheet("Sheet1");
		u.createRow(i).createCell(0).setCellValue(text);
		FileOutputStream fos=new FileOutputStream("./src/test/resources/New Microsoft Office Excel Worksheet.xlsx");
		c.write(fos);

	}
//	FileInputStream fis=new FileInputStream("./src/test/resources/New Microsoft Office Excel Worksheet.xlsx");
//	
//	Workbook c = WorkbookFactory.create(fis);
//	Sheet u = c.getSheet("Sheet1");
//	
////	for (WebElement webElement : ele) {
////		u.createRow(i).createCell(0).setCellValue(text);
////	}
//	for(int i=0;i<=text.length();i++) {
//		//u.createRow(i).createCell(0).setCellValue(text);
//	
//		
//			u.createRow(i).createCell(0).setCellValue(text);
//		}
//	
		System.out.println("write multiple data");
}
}
