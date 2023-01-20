package Practice;

import org.testng.annotations.Test;

public class Groupexecution2 {
	@Test(groups="system")
	public void sample3(){
		System.out.println("group....3");
	}
	@Test(groups={"smoke","regression","system"})
	public void sample4() {
		System.out.println("group...4");
	}

}
