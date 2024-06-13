package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement frame1 = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
	driver.switchTo().frame(frame1);

	WebElement frame = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
	driver.switchTo().frame(frame);
	
	String mdl = driver.findElement(By.xpath("//div[@id=\"content\"]")).getText();
	System.out.println(mdl);
}

}
