package Retailer_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
import com.crm.POM.RetailerEditProfilePage;
import com.crm.POM.RetailerLoginpage;
import com.crm.POM.Retailer_Homepage;

public class New_Order_POM {

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
		Retailer_Homepage rhm=new Retailer_Homepage(driver);
		rhm.clickeditprofile();
		RetailerEditProfilePage rep=new RetailerEditProfilePage(driver);
		rep.updateProfile();
	}

}
