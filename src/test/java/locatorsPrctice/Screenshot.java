package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
}
