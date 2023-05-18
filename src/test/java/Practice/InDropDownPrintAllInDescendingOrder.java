package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InDropDownPrintAllInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
WebElement element = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Select sel=new Select(element);
List<WebElement> hh = sel.getOptions();
ArrayList<String> list=new ArrayList<String>();
for (int i = 0; i < hh.size(); i++) {
	
	String tes = hh.get(i).getText();
	//System.out.println(tes);
	list.add(tes);
}
Collections.sort(list,Collections.reverseOrder());
for (String string : list) {
	System.out.println(string);
}
	}

}
