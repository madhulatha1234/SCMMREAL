package Retailer_module2;

import org.testng.annotations.Test;

import com.crm.GeneticUtilities.BaseClass;
import com.crm.POM.RetailerEditProfilePage;
import com.crm.POM.RetailerLoginpage;
import com.crm.POM.Retailer_Homepage;

public class Post_Order_TestNHG extends BaseClass {
	@Test
	public void script() throws Throwable {
		RetailerLoginpage rp=new RetailerLoginpage(driver);
		rp.retailerDropdown();
	Retailer_Homepage rhm=new Retailer_Homepage(driver);
	rhm.clickeditprofile();
	RetailerEditProfilePage rep=new RetailerEditProfilePage(driver);
	rep.updateProfile();
	}

}
