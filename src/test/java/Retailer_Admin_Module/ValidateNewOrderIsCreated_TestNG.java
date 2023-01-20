package Retailer_Admin_Module;

import org.testng.annotations.Test;

import com.crm.GeneticUtilities.BaseClass;
import com.crm.POM.RetailerLoginpage;
import com.crm.POM.Retailer_Admin_OrderItemPage;
import com.crm.POM.Retailer_Homepage;

public class ValidateNewOrderIsCreated_TestNG extends BaseClass {
	@Test
	public void Script() {
		RetailerLoginpage rp=new RetailerLoginpage(driver);
		rp.retailerDropdown();
	Retailer_Homepage rh=new Retailer_Homepage(driver);
	rh.getNewOrderFeature().click();
	Retailer_Admin_OrderItemPage raq=new Retailer_Admin_OrderItemPage(driver);
	//raq.enterQuantity("2","3");
	}

}
