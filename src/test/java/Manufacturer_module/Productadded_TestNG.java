package Manufacturer_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.GeneticUtilities.BaseClass;
import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
import com.crm.POM.AddProductPage;
import com.crm.POM.EditProductPage;
import com.crm.POM.ManufacturerLoginPage;
import com.crm.POM.Manufacturer_HomePage;
import com.crm.POM.Manufacturer_ViewProductsPage;

public class Productadded_TestNG extends BaseClass{
	@Test(groups= {"regression"})
	public void scriptt() throws InterruptedException {
		System.out.println("only regression");
		ManufacturerLoginPage mp=new ManufacturerLoginPage(driver);
		mp.manufacturerdropdown();
	Manufacturer_HomePage mh=new Manufacturer_HomePage(driver);
	mh.clickonhome();
	
	AddProductPage add=new AddProductPage(driver);
	add.addproducts();
	
	wu.acceptAlert(driver);
	mh.productClick();
	Manufacturer_ViewProductsPage vp=new Manufacturer_ViewProductsPage(driver);
	vp.editbutton();
	
	EditProductPage ep=new EditProductPage(driver);
	ep.editProduct();
	add.getEnable().click();
	
	ep.updateproduct();
	
	wu.acceptAlert(driver);

	vp.checkbox();

	wu.acceptAlert(driver);
	}
}
