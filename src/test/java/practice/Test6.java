package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	int rows = driver.findElements(By.xpath("//table[@name=\"courses\"]//tr")).size();
	String secondRow = driver.findElement(By.xpath("//table[@name=\"courses\"]//tr[3]")).getText();
	System.out.println(secondRow);
	System.out.println(rows);
	
	List<WebElement> column = driver.findElements(By.xpath("//table[@name=\"courses\"]//tr/th"));

	for(WebElement clm:column) {
	 System.out.println(clm.getText());
	}
}
}
