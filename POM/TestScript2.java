package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.WebDriverUtility;

public class TestScript2 {

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
loginpage2 lp=new loginpage2(driver);
lp.admin(username, password);
Homepage2 hm=new Homepage2(driver);
hm.homepagee2();
VIewUnits2 vu=new VIewUnits2(driver);
vu.clickaddunit();
AddUnit2 au=new AddUnit2(driver);
Thread.sleep(2000);
au.aadunit(ex.readDataFromExcel("Organization", 0, 1), ex.readDataFromExcel("Organization", 1, 1));
wbu.acceptAlert(driver);
hm.homepagee2();
vu.clickOncheckboxAndDeleteButton();
wbu.acceptAlert(driver);
vu.clickonedit();
Thread.sleep(2000);
Updateunit2 up=new Updateunit2(driver);
up.updatedata();
Thread.sleep(2000);
up.againupdate("kgs", "kilograms");

	}

}
