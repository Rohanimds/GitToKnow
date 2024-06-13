package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.xpath("//span[text()=\" User\"]/following-sibling::span[@class=\"checkmark\"]")).click();
	
	WebElement alt = driver.findElement(By.xpath("//div[@class=\"modal-body\"]"));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(alt));

	driver.findElement(By.id("okayBtn")).click();
	
	WebElement dd = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
	
	Select s=new Select(dd);
	s.selectByVisibleText("Student");
	
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
	
	List<WebElement> items = driver.findElements(By.xpath("//h4[@class=\"card-title\"]"));
	
	for(int i=0;i<items.size();i++) {
		driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]")).get(i).click();
	}
	driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
	
}
}
