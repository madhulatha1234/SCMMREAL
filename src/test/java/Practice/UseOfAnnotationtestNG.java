package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfAnnotationtestNG {
@BeforeMethod
public void configBM() {
	System.out.println("login to app before method");
}
@AfterMethod
public void configAM() {
	System.out.println("logout from app After method");
}
@BeforeClass
public void configBC() {
	System.out.println("launch the browser before class");
}
@AfterClass
public void configAC() {
	System.out.println("close the browser after class");
}
@BeforeSuite
public void configBS() {
	System.out.println("connect to DB before suit");
}
@AfterSuite
public void configAS() {
	System.out.println("disconnect from DB after suit");
}
@BeforeTest
public void configBT() {
	System.out.println("cross browser before test");
}
@AfterTest
public void configAT() {
	System.out.println(",.,.,cross browser ater test");
}
@BeforeGroups
public void configBG() {
	System.out.println("before group ");
}
@AfterGroups
public void configAG() {
	System.out.println("After group");
}
@Test
public void admin() {
	System.out.println("login as admin");
}
@Test
public void manufacturer() {
	System.out.println("login as manufacturer");
}

}
