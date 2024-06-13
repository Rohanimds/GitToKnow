package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	
	driver.switchTo().frame(frame);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	
	driver.switchTo().parentFrame();
//	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()=\"Accept\"]")).click();
	
}
}
