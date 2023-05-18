package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
@Test
public void prrrr() throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/s?k=laptop&crid=QV3QIXVLPQJS&sprefix=laptop%2Caps%2C1931&ref=nb_sb_ss_ts-doa-p_1_6");
List<WebElement> li = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
TreeSet<String> set=new TreeSet<String>();


for(int i=0;i<li.size();i++) {
	String tess = li.get(i).getText();
 set.add(tess);
	//System.out.println(tess);
	Thread.sleep(2000);
	for(String sorted:set) {
	FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet shh = wb.getSheet("Sheet3");
	shh.createRow(i).createCell(0).setCellValue(sorted);
	Thread.sleep(2000);
	FileOutputStream fos=new FileOutputStream("./src/test/resources/Sheet2.xlsx");
	wb.write(fos);
	
}}
}
}
