package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import lombok.val;

public class NEW {

	@Test
	public void testtt() throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("madhu");
	Thread.sleep(2000);
	List<WebElement> gett = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
	TreeSet<String> sett=new TreeSet<String>();
//System.out.println("bye");
	Thread.sleep(2000);
	//WebElement val = driver.findElement(By.xpath("//div[@class='wM6W7d']"));
	ArrayList<String> list=new ArrayList<String>();
	
		for(int i=0;i<gett.size();i++) {
			String val = gett.get(i).getText();
			list.add(val);
		}
	Collections.sort(list,Collections.reverseOrder());
	for(String lll:list) {
		System.out.println(lll);
	}
	}}
