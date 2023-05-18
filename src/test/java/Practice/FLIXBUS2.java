package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class FLIXBUS2 {
@Test
public void bus() throws InterruptedException {
	Scanner scan=new Scanner(System.in);
	String ways = scan.next();
	String wayss = scan.next();
	String pl = (ways+" "+wayss);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flixbus.com/");
	WebElement oneway = driver.findElement(By.xpath("//label[text()='One Way']"));
	String way1 = oneway.getText();
	WebElement roundtrip = driver.findElement(By.xpath("//label[text()='Round Trip']"));
	//roundtrip.click();
	String way2 = roundtrip.getText();
	
	WebElement from = driver.findElement(By.xpath("//input[@id='searchInput-from']"));
	//.click();
	Thread.sleep(2000);
	WebElement from1 = driver.findElement(By.xpath("//span[text()='New York, NY']"));
	//.click();
	//Thread.sleep(2000);
	WebElement to = driver.findElement(By.xpath("//input[@id='searchInput-to']"));
	//.click();
	WebElement to1 = driver.findElement(By.xpath("//span[text()='Boston, MA']"));
	//.click();
	WebElement departure = driver.findElement(By.xpath("//input[@id='dateInput-from']"));
	//.click();
	WebElement departure1 = driver.findElement(By.xpath("//button[@aria-label='Thu, Apr 27']"));
	//.click();
	//Thread.sleep(2000);
	//driver.findElement(By.id("dateInput-to")).click();
	//Thread.sleep(2000);
	WebElement rreturn = driver.findElement(By.xpath("//button[@aria-label='Fri, Apr 28']"));
	//.click();
	//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	//Thread.sleep(2000);
	WebElement clicksearch = driver.findElement(By.xpath("//button[text()='Search']"));
	//.click();
	if(pl.equals(way1)) {
		System.out.println("1trip");
		oneway.click();
		from.click();
		from1.click();
		to.click();
		to1.click();
		departure.click();
		departure1.click();
		clicksearch.click();
	}
	else if(pl.equals(way2)) {
		System.out.println("2trip");
		roundtrip.click();
		from.click();
		from1.click();
		to.click();
		to1.click();
		departure.click();
		departure1.click();
		rreturn.click();
		clicksearch.click();
	
}
}}
