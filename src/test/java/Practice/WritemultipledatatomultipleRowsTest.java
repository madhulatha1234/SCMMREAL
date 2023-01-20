package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritemultipledatatomultipleRowsTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
		Workbook c = WorkbookFactory.create(fis);
		Sheet u = c.getSheet("Organization");
		String arr[]= {"Anu","Kavitha","Usha","Abhi"};
		for(int i=0;i<=arr.length-1;i++) {
			u.createRow(i).createCell(0).setCellValue(arr[i]);	}
				}

}
