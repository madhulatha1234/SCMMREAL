package com.crm.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Retailer_Orderitem_page {
@FindBy(xpath = "//input[@name='txtQuantity1']")
private WebElement quantitytextfield;

@FindBy(xpath = "//input[@id='btnSubmit']")
private WebElement postonOrdeerl;

public WebElement getPostonOrdeerl() {
	return postonOrdeerl;
}

public WebElement getQuantitytextfield() {
	return quantitytextfield;
}
public void orderonitem(String quantity) {
	quantitytextfield.sendKeys(quantity);
	postonOrdeerl.click();
	
}
}
