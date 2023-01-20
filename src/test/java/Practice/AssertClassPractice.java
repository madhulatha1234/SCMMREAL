package Practice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert.*;
import org.testng.annotations.Test;

public class AssertClassPractice {
@Test
public void simple1()
{
	System.out.println("simple1");
	System.out.println("simple2");
	System.out.println("simple3");
  assertEquals("a", "b","working");
	System.out.println("simple4");
	System.out.println("simple5");
}
@Test
public void simple2() {
	String a="qspider";
	String b="ty";
	assertNotEquals("a","b");
	System.out.println("true");
	
}
}
