package Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
//import com.crm.POM.AddUnit2;
import com.crm.POM.AdminAddUnitPage;
import com.crm.POM.AdminVewUnitsPage;
import com.crm.POM.Admin_Homepage;
import com.crm.POM.Admin_UpdateunitPage;
import com.crm.POM.AdminloginPage;

//import com.crm.POM.Updateunit2;
//import com.crm.POM.VIewUnits2;


public class Viewunit_POM {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=null;
FileUtility fis=new FileUtility();
ExcelUtility ex=new ExcelUtility();
WebDriverUtility wbu=new WebDriverUtility();
String browswe = fis.readdatafromPropertyFile("browser");
String url=fis.readdatafromPropertyFile("url");
String username = fis.readdatafromPropertyFile("username");
String password = fis.readdatafromPropertyFile("password");
driver=new FirefoxDriver();
driver.get(url);
AdminloginPage lp=new AdminloginPage(driver);
lp.admin(username, password);
Admin_Homepage hm=new Admin_Homepage(driver);
hm.homepagee2();
AdminVewUnitsPage vu=new AdminVewUnitsPage(driver);
vu.clickaddunit();
AdminAddUnitPage au=new AdminAddUnitPage(driver);
Thread.sleep(2000);
au.aadunit(ex.readDataFromExcel("Organization", 0, 1), ex.readDataFromExcel("Organization", 1, 1));
wbu.acceptAlert(driver);
hm.homepagee2();
vu.clickOncheckboxAndDeleteButton();
wbu.acceptAlert(driver);
vu.clickonedit();
Thread.sleep(2000);
Admin_UpdateunitPage up=new Admin_UpdateunitPage(driver);
up.updatedata();
Thread.sleep(2000);
up.againupdate("kgs", "kilograms");
Thread.sleep(2000);
up.updateunit();
Thread.sleep(2000);
wbu.acceptAlert(driver);

	}

}
