package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ereaddatafromexcel {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sheet = book.getSheet("Organization");
String value = sheet.getRow(1).getCell(0).getStringCellValue();
System.out.println(value);
	}

}
