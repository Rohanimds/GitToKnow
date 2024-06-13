package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//img[@class=\"ui-datepicker-trigger\"]")).click();
	
//	String month = driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//span[@class=\"ui-datepicker-month\"]")).getText();
//	
//	System.out.println(month);
	
	while(!driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//span[@class=\"ui-datepicker-month\"]")).getText().equalsIgnoreCase("January")) {
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
	}
	int dates = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).size();
	
	for(int i=0;i<dates;i++) {
		String pstDate = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).getText();
		
		if(pstDate.equalsIgnoreCase("2")) {
			driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).click();
			break;
		}
	}
}
}