package Practice;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FLIXBUS {
@Test
public void flix() {
	Scanner scan=new Scanner(System.in);
	String ways = scan.next();
	String wayss = scan.next();
	//String wayssss = scan.next();
	//System.out.println(ways);
	//System.out.println(wayss);
	String pl = (ways+" "+wayss);
	System.out.println(ways+" "+wayss);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flixbus.com/");
	WebElement oneway = driver.findElement(By.xpath("//label[text()='One Way']"));
	//oneway.click();
	String way1 = oneway.getText();
	System.out.println(way1);
	WebElement roundtrip = driver.findElement(By.xpath("//label[text()='Round Trip']"));
	String way2 = roundtrip.getText();
	System.out.println(way2);
	//roundtrip.click();
//	Scanner scan=new Scanner(System.in);
//	String ways = scan.next();
	System.out.println(pl);
	System.out.println(way1);
	if(pl.equals(way1)) {
		System.out.println("1trip");

		oneway.click();
		//System.out.println("1trip");
	}
	else if(pl.equals(way2)) {
		System.out.println("2trip");
		roundtrip.click();
		//System.out.println("2trip");
	}


}
	
}
