package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		driver.findElement(By.name("name")).sendKeys("Rohan");
		driver.findElement(By.name("email")).sendKeys("Rohan@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rohancom");
		driver.findElement(By.id("exampleCheck1")).click();
		
		 WebElement dd = driver.findElement(By.id("exampleFormControlSelect1"));

		 Select s=new Select(dd);
		 s.selectByVisibleText("Male");
		 driver.findElement(By.id("inlineRadio1")).click();
//		 driver.findElement(By.name("bday")).click();
				 
		 driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("12-05-2023");
		 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		 String succ = driver.findElement(By.xpath("//strong[text()=\"Success!\"]")).getText();
		 if(succ.contains("Success")) {
			 System.out.println("Test Pass");
		 }else{
			System.out.println("Fail"); 
		 }
	}
}
