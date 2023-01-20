package Practice;

import org.testng.annotations.Test;

public class Groupexecution1 {
	@Test(groups="smoke")
	public void sample1(){
		System.out.println("group....1");
	}
	@Test(groups= {"regression","smoke"})
	public void sample2() {
		System.out.println("group...2");
	}

}
