package com.crm.GeneticUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.mysql.cj.jdbc.Driver;
import com.crm.POM.AdminloginPage;
import com.crm.POM.ManufacturerLoginPage;
import com.crm.POM.RetailerLoginpage;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
public DatabaseUtility du=new DatabaseUtility();
public ExcelUtility ex=new ExcelUtility();
public FileUtility fu=new FileUtility();
public WebDriverUtility wu=new WebDriverUtility();
public AdminloginPage ap;


//@BeforeSuite(groups= {"smoke","regression"})
@BeforeSuite
public void configBS() throws Throwable {
	du.connectToDB();
	System.out.println("connect to database");
}

@Parameters("")
//@Parameters("BROWSER")
//@BeforeClass(groups= {"smoke","regression"})
@BeforeClass
public void configBC() throws Throwable {
	
	String BROWSER = fu.readdatafromPropertyFile("browser");
	fu.readdatafromPropertyFile(BROWSER);
	
	if(BROWSER.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
}
	else if(BROWSER.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	sdriver=driver;
	
	String URL = fu.readdatafromPropertyFile("url");
	wu.maximizeWindow(driver);
	wu.waitForPageLoad(driver);
	driver.get(URL);
	System.out.println("Launch the browser");
}
//@BeforeMethod(groups= {"smoke","regression"})
@BeforeMethod
public void congigBM() throws Throwable {
String USERNAME = fu.readdatafromPropertyFile("username");	
String PASSWORD = fu.readdatafromPropertyFile("password");
ap=new AdminloginPage(driver);
ap.admin(USERNAME, PASSWORD);
//String ADMIN = fu.readdatafromPropertyFile("Admin");
//String MANUFACTURER = fu.readdatafromPropertyFile("Manufacturer");
//String RETAILER = fu.readdatafromPropertyFile("Retailer");
//if(ADMIN.equalsIgnoreCase("admin")) {
//	AdminloginPage ap=new AdminloginPage(driver);
//	ap.admin(USERNAME, PASSWORD);
//
//}
//else if(MANUFACTURER.equalsIgnoreCase("manufacturer")) {
//	ManufacturerLoginPage mlp=new ManufacturerLoginPage(driver);
//
//	mlp.logintoapp(USERNAME, PASSWORD);
//
//}
//else {
//	RetailerLoginpage rp=new RetailerLoginpage(driver);
//	rp.retailer(USERNAME);
//}
System.out.println("login to application");
}

//@AfterMethod(groups= {"smoke","regression"})

@AfterMethod
public void configAM() {
	ap.loggout();
	//System.out.println("logout from the application");
	
	
}
//@AfterClass(groups= {"smoke","regression"})
@AfterClass
public void configAC() {
	System.out.println("close the browser");
}
//@AfterSuite(groups= {"smoke","regression"})
@AfterSuite
public void configAS() throws Throwable {
	du.closeDB();
	System.out.println("disconnect to database");
}
}
