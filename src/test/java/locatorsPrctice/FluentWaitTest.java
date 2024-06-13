package locatorsPrctice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("start")).click();
	
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	
//	wait.until(null)
	
	
	
}
}
