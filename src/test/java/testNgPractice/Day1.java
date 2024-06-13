package testNgPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	@AfterSuite
	public void suiteExecuteLast() {
		
		System.out.println("im last of all");
	}
@Test
	public void demo() {
     System.out.println("Hello testNg");		
	}
@Test
public void test1() {
	System.out.println("bye");
}
@BeforeSuite
public void suiteExecuteFirst() {
	System.out.println("im 1st of all");
}
}
