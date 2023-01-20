package Admin_Module;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.crm.GeneticUtilities.DatabaseUtility;
import com.crm.GeneticUtilities.ExcelUtility;
import com.crm.GeneticUtilities.FileUtility;
import com.crm.GeneticUtilities.IPathConstant;
import com.crm.GeneticUtilities.JavaUtility;
import com.crm.GeneticUtilities.WebDriverUtility;
public class ViewUnit_Update implements IPathConstant{
	public static void main(String[] args) throws Throwable {
ExcelUtility exut=new ExcelUtility();
FileUtility fiut=new FileUtility();
JavaUtility jaut=new JavaUtility();
WebDriverUtility wdut=new WebDriverUtility();
int randumnum = jaut.getRandomNo();
String browser = fiut.readdatafromPropertyFile("browser");
String ul = fiut.readdatafromPropertyFile("url");
String un = fiut.readdatafromPropertyFile("username");
String pwd = fiut.readdatafromPropertyFile("password");
String unitname = exut.readDataFromExcel("Organization", 0, 1);
String detailes = exut.readDataFromExcel("Organization", 1, 1);
String admin = fiut.readdatafromPropertyFile("Admin");
String mmanufacturer = fiut.readdatafromPropertyFile("Manufacturer");
String rretailer = fiut.readdatafromPropertyFile("Retailer");
WebDriver driver=null;
if(browser.equals("chrome")) {
	driver=new ChromeDriver();
}
else if(browser.equals("firefox")) {
	driver=new FirefoxDriver();
}
wdut.waitForPageLoad(driver);
driver.get(ul);
driver.findElement(By.id(UsernameByID)).sendKeys(un);
driver.findElement(By.id(PasswordByID)).sendKeys(pwd);
driver.findElement(By.xpath(MSGClickByXpath)).click();
WebElement adminn = driver.findElement(By.id(DDAddressBYID));
wdut.select(adminn, mmanufacturer);
driver.findElement(By.xpath(ClickOnLoginButtonByXpath)).click();
driver.findElement(By.xpath("//a[.='Manage Unit']")).click();
driver.findElement(By.xpath("//input[@value='+ Add Unit']")).click();
driver.findElement(By.id("unitName")).sendKeys(unitname);
driver.findElement(By.id("unitDetails")).sendKeys(detailes);
driver.findElement(By.xpath("//input[@value='Add Unit']")).click();
wdut.acceptAlert(driver);
driver.findElement(By.xpath("//a[.='Manage Unit']")).click();
String actualdata = driver.findElement(By.xpath("//td[.=' Kilogram ']")).getText();
System.out.println(actualdata);
if(actualdata.contains(detailes)) {
System.out.println(detailes+"manage unit created is correct");
}
else {
System.out.println("data is incorrect");
}
driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
driver.findElement(By.xpath("//input[@value='Delete']")).click();
wdut.acceptAlert(driver);
driver.findElement(By.xpath("(//img[@alt='edit'])[8]")).click();
driver.findElement(By.xpath("//input[@placeholder='Unit Name']")).clear();
driver.findElement(By.xpath("//textarea[@placeholder='Details']")).clear();
driver.findElement(By.xpath("//input[@placeholder='Unit Name']")).sendKeys("kgs");
driver.findElement(By.xpath("//textarea[@placeholder='Details']")).sendKeys("kilograms");
driver.findElement(By.xpath("//input[@value='Update Unit']")).click();
wdut.acceptAlert(driver);

	}
}
