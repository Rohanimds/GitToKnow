package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	System.out.println("1st");
	System.out.println(driver);
	System.out.println("Last");
//	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//	WebElement mh = driver.findElement(By.id("nav-link-accountList"));
//	
//	Actions a=new Actions(driver);
//	a.moveToElement(mh).perform();
//	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().perform();
//	
	
}
}
