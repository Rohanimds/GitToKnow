package testNgPractice;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Im browser Home");
		System.out.println("Git to know did a change");
	}
	@Test
	//	public void mobileLoginHomeLoan() {
	public void mobileLoginHomeLoan() {
		System.out.println("Im mobile Home");
	}
	
	@Test(groups = "smoke")
	public void apiLoginHomeLoan() {
		System.out.println("Im API Home");
	}
}
