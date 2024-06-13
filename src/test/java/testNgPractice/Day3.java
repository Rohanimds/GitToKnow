package testNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
@Test()
	public void webLoginCarLoan() {
		System.out.println("Im browser car");
	}

	@Test(groups = "smoke")
	public void mobileLoginCarLoan() {
		System.out.println("Im mobile car");
	}
//	@Parameters("url")
	@Test
	public void mobileSigninCarLoan() {
//		System.out.println(userWeb);
		System.out.println("Im mobile signin");
	}
	
	@Test(dataProvider = "getData")
	public void mobileSignOutCarLoan(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println("Im mobile signOut");
	}
	
	@Test
	
	public void apiLoginCarLoan() {
		System.out.println("Im API car");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] o=new Object[3][2];
		o[0][0]="FirstUserName";
		o[0][1]="FirstPassword";
		o[1][0]="SecondUserName";
		o[1][1]="SecondPassword";
		o[2][0]="ThirdUserName";
		o[2][1]="ThirdPassword";
		
		return o;
	}
}
