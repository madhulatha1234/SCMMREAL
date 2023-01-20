package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GwritemultipledatatoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Sheet2.xlsx");
		Workbook c = WorkbookFactory.create(fis);
		Sheet u = c.getSheet("Organization");
		String str[]= {"tt","uu","ii","oo","uu"};
		for(int i=0;i<=str.length-1;i++) {
			u.createRow(i).createCell(0).setCellValue(str[i]);
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Sheet2.xlsx");
		c.write(fos);
		System.out.println("write multiple data");

	}

}
