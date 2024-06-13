package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//div[@class=\"example\"]/a[@target=\"_blank\"]")).click();
	
	Set<String> win = driver.getWindowHandles();
	Iterator<String> it = win.iterator();
	String parent = it.next();
	String child = it.next();
	
	driver.switchTo().window(child);
	
	String text2 = driver.findElement(By.xpath("//div[@class=\"example\"]")).getText();
	System.out.println(text2);
	
	driver.switchTo().window(parent);
	String text1 = driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText();
	System.out.println(text1);
}
}
