package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retailer_Homepage {
	@FindBy(linkText = "Home")
	private WebElement homeFeature;
	
	@FindBy(linkText = "Products")
	private WebElement ProdListPage;
	
	@FindBy(linkText = "My Orders")
	private WebElement MyOrdersListPage;
	
	@FindBy(linkText = "My Invoices")
	private WebElement MyInvoicesListPage;
	
	@FindBy(linkText = "New Order")
	private WebElement NewOrderFeature;
	
	@FindBy(linkText = "Edit Profile")
	private WebElement EditProfileFeature;
	
	@FindBy(xpath = "//input[@value='Log out']")
	private WebElement lgout;
	
	public Retailer_Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomeFeature() {
		return homeFeature;
	}

	public WebElement getProdListPage() {
		return ProdListPage;
	}

	public WebElement getMyOrdersListPage() {
		return MyOrdersListPage;
	}

	public WebElement getMyInvoicesListPage() {
		return MyInvoicesListPage;
	}

	public WebElement getLgout() {
		return lgout;
	}

	public WebElement getNewOrderFeature() {
		return NewOrderFeature;
	}

	public WebElement getEditProfileFeature() {
		return EditProfileFeature;
	}
	public void clickeditprofile() {
		EditProfileFeature.click();
	}

	}
