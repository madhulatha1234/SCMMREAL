package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Make_my_trip {
@Test
public void makeMyTripPractice() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	WebElement ele = driver.findElement(By.id("fromCity"));
	ele.sendKeys("Bangalore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
	driver.findElement(By.id("toCity")).sendKeys("mumbai");
	driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
	driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//div[@aria-label='Sat Apr 01 2023']")).click();
	driver.findElement(By.xpath("//a[.='Search']")).click();
	driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
	driver.findElement(By.xpath("//span[@class='linkText pointer']")).click();
	driver.findElement(By.xpath("//p[.='Vistara (9) ']")).click();
//	List<WebElement> listt = driver.findElements(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::span[@class='appendLeft5']"));
//List<WebElement> box = driver.findElements(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::span[@class='commonCheckbox sizeSm primaryCheckbox']"));

	driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'Vistara')]")).click();
driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'Air Indi')]")).click();
	
	driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'SpiceJet')]")).click();
	driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'Go First')]")).click();
	driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'Akasa Air')]")).click();
	driver.findElement(By.xpath("//p[.='Popular Filters']/ancestor::div[@class='filtersOuter']/descendant::p[contains(.,'AirAsia')]")).click();
	
	//for (WebElement webElement : box) {
//	webElement.click();
//}


//int in;
//for (WebElement webElement : listt) {
//	String test = webElement.getText();
//	String testtt = test.substring(2);
//	String putt = testtt.replace("," ,"");
//	//System.out.println(putt);
// in = Integer.parseInt(testtt);
//System.out.println(in);
//
//}
//if(in<2000) {
//	for (WebElement webElement2 : box) {
//		webElement2.click();
//	}
//}
}
}
