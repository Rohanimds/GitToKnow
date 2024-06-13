package locatorsPrctice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows {
public static void main(String[] args) {
	//a[@class="blinkingText"]

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
	

	Set<String> hdl = driver.getWindowHandles();
	 Iterator<String> it = hdl.iterator();
	 String parent = it.next();
	String child = it.next();
	driver.switchTo().window(child);
	
//	String txt = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//p[@class=\"im-para red\"]\")).getText().split(\"at\")[1].trim().split(\" \")[0];"));
	String email = driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText().split("at")[1].trim().split(" ")[0];	
	driver.switchTo().window(parent);
	driver.findElement(By.id("username")).sendKeys(email);
}
}
