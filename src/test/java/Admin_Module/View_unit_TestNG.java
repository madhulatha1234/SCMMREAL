package Admin_Module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GeneticUtilities.BaseClass;
import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
import com.crm.POM.AdminAddUnitPage;
import com.crm.POM.AdminVewUnitsPage;
import com.crm.POM.Admin_Homepage;
import com.crm.POM.Admin_UpdateunitPage;
import com.crm.POM.AdminloginPage;
@Listeners(com.crm.GeneticUtilities.ListernewImplementationclass.class)
public class View_unit_TestNG extends BaseClass{
	@Test
public void script() throws Throwable, InterruptedException, IOException {
		System.out.println("Only script");
		AdminloginPage ap=new AdminloginPage(driver);
		ap.adminDropdown();
	Admin_Homepage hm=new Admin_Homepage(driver);
	hm.homepagee2();
	AdminVewUnitsPage vu=new AdminVewUnitsPage(driver);
	vu.clickaddunit();
	AdminAddUnitPage au=new AdminAddUnitPage(driver);
	au.aadunit(ex.readDataFromExcel("Organization", 0, 1), ex.readDataFromExcel("Organization", 1, 1));
	wu.acceptAlert(driver);
	hm.homepagee2();
	//Assert.fail();
	vu.clickOncheckboxAndDeleteButton();
	wu.acceptAlert(driver);
	vu.clickonedit();
	System.out.println("Only smoke");
	Assert.fail();
	Admin_UpdateunitPage up=new Admin_UpdateunitPage(driver);
	up.updatedata();
	up.againupdate("kgs", "kilograms");
	up.updateunit();
	wu.acceptAlert(driver);

}
	@Test
	public void simple1() {
		System.out.println("simple 1");
	}
	@Test
	public void simple2() {
		System.out.println("simple 2");
	}
}
