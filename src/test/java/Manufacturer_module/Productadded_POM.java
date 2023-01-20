package Manufacturer_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
import com.crm.POM.AddProductPage;
import com.crm.POM.EditProductPage;
//import com.crm.POM.EditProduct;
//import com.crm.POM.HomePage;
//import com.crm.POM.LoginPage;
import com.crm.POM.ManufacturerLoginPage;
import com.crm.POM.Manufacturer_HomePage;
import com.crm.POM.Manufacturer_ViewProductsPage;
//import com.crm.POM.ViewProducts;

public class Productadded_POM {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ExcelUtility eu=new ExcelUtility();
		FileUtility fu=new FileUtility();
		WebDriverUtility wu=new WebDriverUtility();
		WebDriver driver=null;
		String url =fu.readdatafromPropertyFile("url");
		String un = fu.readdatafromPropertyFile("username");
	String pwd = fu.readdatafromPropertyFile("password");
	String bro = fu.readdatafromPropertyFile("browser");
	if(bro.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(bro.equals(bro)) {
		driver=new ChromeDriver();
	}
	
	driver.get(url);
	Thread.sleep(2000);
	ManufacturerLoginPage lp=new ManufacturerLoginPage(driver);
	lp.logintoapp(un, pwd);
	Manufacturer_HomePage hp=new Manufacturer_HomePage(driver);
	Thread.sleep(2000);
	hp.clickonhome();
	//ExcelUtility eu1=new ExcelUtility();
	//eu1.readMultipleData(driver, "Organization", 2, 3);
	AddProductPage add=new AddProductPage(driver);
	Thread.sleep(2000);
	add.addproducts();
	Thread.sleep(3000);
	wu.acceptAlert(driver);
	Thread.sleep(3000);
	hp.productClick();
	Manufacturer_ViewProductsPage vp=new Manufacturer_ViewProductsPage(driver);
	Thread.sleep(2000);
	vp.editbutton();
	EditProductPage ep=new EditProductPage(driver);
	Thread.sleep(2000);
	ep.editProduct();
	add.getEnable().click();
	Thread.sleep(2000);
	ep.updateproduct();
	Thread.sleep(2000);
	wu.acceptAlert(driver);
	Thread.sleep(2000);
	vp.checkbox();
	Thread.sleep(3000);
	wu.acceptAlert(driver);
	}

}
