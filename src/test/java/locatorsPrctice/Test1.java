package locatorsPrctice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test

public void login() {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Documents\\chromedriver-win64\\chromedriver.exe");
	
	
//	WebDriver driver=new ChromeDriver();
	
//	WebDriver driver=new FirefoxDriver();
	WebDriver driver=new EdgeDriver();

	driver.get("https://www.selenium.dev/");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/", "URL is Wrong");
	driver.quit();
	
}
}
