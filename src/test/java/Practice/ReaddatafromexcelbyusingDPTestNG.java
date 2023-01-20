package Practice;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.GeneticUtilities.ExcelUtility;

public class ReaddatafromexcelbyusingDPTestNG {
@Test(dataProvider = "dataproviderr")
public void readdata(String from,String to) {
System.out.println(from+"----->"+to);	
}
	@DataProvider
	public Object[][] dataproviderr() throws Throwable {
		ExcelUtility eu=new ExcelUtility();
		Object[][] data = eu.readMultipleDataInDataprovider("DataProvider");
		return data;
	}
	
}
