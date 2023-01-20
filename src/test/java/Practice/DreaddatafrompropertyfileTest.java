package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DreaddatafrompropertyfileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//step1: get object representation for physical file
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		//step1:creat object for properties
		Properties pr=new Properties();
		//step3;load the file
		pr.load(fis);
	 String url = pr.getProperty("url");
	 String br = pr.getProperty("");
	 String un = pr.getProperty("username");
	 String pwd = pr.getProperty("passwors");
	 
	 System.out.println(url);
	 System.out.println(br);
	 System.out.println(un);
	 System.out.println(pwd);
		
	// webDriver driver=new fire
		
	}

}
