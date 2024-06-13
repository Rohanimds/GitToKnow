package locatorsPrctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("name")).sendKeys("Rohan");
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(3000);
	String alt = driver.switchTo().alert().getText();
	if(alt.contains("Rohan")) {
		System.out.println("pass");
	}
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	
}
}
