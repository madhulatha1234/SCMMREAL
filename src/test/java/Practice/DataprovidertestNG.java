package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidertestNG {
	
	@Test(dataProvider = "data")
	public void travel(String str,String dtr,int iy ) {
		System.out.println("from"+str+"to"+dtr+"RS"+iy);
	}
	
@DataProvider	
public Object[][] data() {
	Object obj[][]=new Object[3][3];
	obj[0][0]="Mysore";
	obj[0][1]="Bangalore";
	obj[0][2]=12;
	
	obj[1][0]="Bangalore";
	obj[1][1]="Mysore";
	obj[1][2]=55;
	
	obj[2][0]="Mysore";
	obj[2][1]="Mandya";
	obj[2][2]=14;
	return obj;
}
}
