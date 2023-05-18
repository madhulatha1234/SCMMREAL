package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task11 {
@Test
public void test() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
	String exptitlee = driver.getTitle();
	System.out.println(exptitlee);
	String acttitlr="Mobiles";
	Assert.
	if(exptitlee.contains(acttitlr)) {
	System.out.println("validate success");
}
else {
	System.out.println("not validate");
}
}}
