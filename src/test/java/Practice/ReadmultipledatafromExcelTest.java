package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadmultipledatafromExcelTest {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Organization");
	int count = sheet.getLastRowNum();
for(int i=0;i<=count;i++) {
	String value = sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(value);
}
	}

}
