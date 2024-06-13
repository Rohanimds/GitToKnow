package locatorsPrctice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ScrollDown {
	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;

	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	
	List<WebElement> tbl = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//td[4]"));
	int sum=0;
	for(int i=0;i<tbl.size();i++) {
	int total = Integer.parseInt(tbl.get(i).getText());
		sum= sum+total;
		
	}
	System.out.println(sum);
	String totalText = driver.findElement(By.xpath("//div[@class=\"totalAmount\"]")).getText();
	String[] ttl = totalText.split(" ");
	 int totalAmout = Integer.parseInt(ttl[3]);
		Assert.assertEquals(sum, totalAmout);
	
	}
}
