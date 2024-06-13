package locatorsPrctice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugeestion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Documents\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("autosuggest")).sendKeys("ind");

	Thread.sleep(2000);
	List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
	for(WebElement as:autoSuggestions) {
		if(as.getText().equalsIgnoreCase("india")) {
			as.click();
			break;
		}
		
	}

	
}
}
