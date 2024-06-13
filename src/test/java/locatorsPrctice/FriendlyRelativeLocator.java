package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class FriendlyRelativeLocator {

public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement nameEdit = driver.findElement(By.name("name"));
	String txt = driver.findElement(with(By.tagName("label")).above(nameEdit)).getText();
	System.out.println(txt);
	
	WebElement date = driver.findElement(By.xpath("//label[@for=\"dateofBirth\"]"));
	driver.findElement(with(By.tagName("input")).below(date)).click();
	
	WebElement iceCream = driver.findElement(By.xpath("//label[contains(text(),\"Check me out\")]"));
	driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
	
	WebElement rdb = driver.findElement(By.id("inlineRadio1"));
	
    String rdbRight = driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText();
	System.out.println(rdbRight);
}
}
