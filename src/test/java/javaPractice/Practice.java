package javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {

	public static void main(String[] args) {
		Practice.test(5);
	}
	public static void test(int a) {

int x;		
		for(int i=1;i<=10;i++) {
			x=a*i;
			System.out.println(x);
		}
	
	}
}
