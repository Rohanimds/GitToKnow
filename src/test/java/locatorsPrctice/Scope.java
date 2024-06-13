package locatorsPrctice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	int links = driver.findElements(By.xpath("//a")).size();
	System.out.println(links);
	
	int footersLink = driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//a")).size();
	System.out.println(footersLink);
	
	int firstRow = driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//td[1]/ul//a")).size();
	System.out.println(firstRow);
	
	List<WebElement> firstLinks = driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//td[1]/ul//a"));
	
	for(int i=1;i<firstLinks.size();i++) {
		String act = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//td[1]/ul//a")).get(i).sendKeys(act);		
		Thread.sleep(5000);
		
	}
	Set<String> hdl = driver.getWindowHandles();

	Iterator<String> it = hdl.iterator();
	while(it.hasNext()){
	driver.switchTo().window(	it.next());
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement title = driver.findElement(By.tagName("title"));
//	wait.until(ExpectedConditions.visibilityOf(title));
		System.out.println(driver.getTitle());
	}
	
	
}
}

