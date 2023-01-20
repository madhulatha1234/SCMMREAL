package Retailer_Module;

import org.testng.annotations.Test;

import com.crm.GeneticUtilities.BaseClass;
import com.crm.POM.RetailerEditProfilePage;
import com.crm.POM.RetailerLoginpage;
import com.crm.POM.Retailer_Homepage;

public class New_Order_testNG extends BaseClass {
	
	@Test(groups={"smoke","regression"})
	public void script() throws Throwable {
		System.out.println("Both smoke and regression");
	RetailerLoginpage rp=new RetailerLoginpage(driver);
	rp.retailerDropdown();
	//String
	Retailer_Homepage rhm=new Retailer_Homepage(driver);
	rhm.clickeditprofile();
	RetailerEditProfilePage rep=new RetailerEditProfilePage(driver);
	rep.updateProfile();
	}

}
