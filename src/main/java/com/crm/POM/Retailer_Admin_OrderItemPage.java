package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retailer_Admin_OrderItemPage {
@FindBy(xpath = "//input[@class='quantity'and@id='1']")
private WebElement Quantitytextfield;

@FindBy(xpath = "//input[@class='quantity'and@id='2']")
private WebElement Quantitytextfield2;

@FindBy(id="btnSubmit")
private WebElement postorder;

public WebElement getPostorder() {
	return postorder;
}
public WebElement getQuantitytextfield2() {
	return Quantitytextfield2;
}
public WebElement getQuantitytextfield() {
	return Quantitytextfield;
}
public Retailer_Admin_OrderItemPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void enterQuantity(String quantity1) {
	Quantitytextfield.sendKeys(quantity1);
	//Quantitytextfield2.sendKeys(quentity2);
	postorder.click();
}

}
