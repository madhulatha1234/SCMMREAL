package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MDEXCEL {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Organization");
WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/user/Desktop/Textfield.html");
for(int i=0;i<=sh.getLastRowNum()-1;i++) {
	String key = sh.getRow(i).getCell(3).getStringCellValue();
	String value = sh.getRow(i).getCell(4).getStringCellValue();
	
	driver.findElement(By.id(value)).sendKeys(key);
	
}
	}

}
