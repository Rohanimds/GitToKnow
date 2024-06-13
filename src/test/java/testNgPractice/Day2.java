package testNgPractice;

//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class Day2 {
	@AfterTest
	public void lastExecute() {
		System.out.println("Im last");
	}
@Test(groups = "smoke")
	public void pLoan() {
		System.out.println("Im Ploan");
	}
@BeforeTest
public void preRequisit() {
	System.out.println("i will execute 1st");
}
}
