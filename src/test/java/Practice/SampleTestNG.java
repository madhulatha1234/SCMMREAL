package Practice;

import org.testng.annotations.Test;

public class SampleTestNG {
	public static void main(String[]args) {
		create();
	}
@Test(priority = 0)
public static  void create() {
	System.out.println("created");
}
@Test()
public void update() {
	System.out.println("update");
}
@Test(invocationCount = 2)
public void delete() {
	System.out.println("deleted");
}
}


