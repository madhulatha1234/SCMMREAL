package Retailer_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
import com.crm.POM.RetailerLoginpage;
import com.crm.POM.Retailer_Admin_OrderItemPage;
import com.crm.POM.Retailer_Homepage;

public class ValidateNewOrderIsCreated_POM {

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
		RetailerLoginpage rlp=new RetailerLoginpage(driver);
		rlp.retailer(username);
		rlp.retailerDropdown();
		Retailer_Homepage rh=new Retailer_Homepage(driver);
		rh.getNewOrderFeature().click();
		Retailer_Admin_OrderItemPage raq=new Retailer_Admin_OrderItemPage(driver);
		//raq.enterQuantity("2","3");
	}

}
