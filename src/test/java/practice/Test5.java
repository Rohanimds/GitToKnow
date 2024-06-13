package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String name = driver.findElement(By.xpath("//label[@for=\"benz\"]")).getText();
	driver.findElement(By.id("checkBoxOption2")).click();
	
	WebElement dd = driver.findElement(By.id("dropdown-class-example"));
	Select s=new Select(dd);
	s.selectByVisibleText(name);
	
	driver.findElement(By.id("name")).sendKeys(name);	
	driver.findElement(By.id("alertbtn")).click();
	
	String txt = driver.switchTo().alert().getText();
//	String[] grab = txt.split(" ")[1].split(",");
//	
//    if(grab[0].equalsIgnoreCase(name)) {
//    	System.out.println(grab[0]);    	
//    }
	if(txt.contains(name)) {
		System.out.println(name);
	}
	
	driver.switchTo().alert().accept();
}
}
