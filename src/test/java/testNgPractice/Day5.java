package testNgPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5 {
	@Test
	public void test() {
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/client");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.findElement(By.id("userEmail")).sendKeys("top@gmail.com");
	driver.findElement(By.id("userPassword")).sendKeys("Toptop1@");
	driver.findElement(By.id("login")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5")));
	List<WebElement> products = driver.findElements(By.xpath("//h5"));
	String MyProduct = "zara coat 3";
	for(WebElement product:products) {
		if(product.getText().equalsIgnoreCase(MyProduct)) {
			product.findElement(By.xpath("//h5/ following-sibling:: button[@class=\"btn w-10 rounded\"]")).click();
		}
	}
	
	WebElement ConfirmationMsg = driver.findElement(By.xpath("//div[@role=\"alert\"]"));
	
	w.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(@class,\"la-ball-scale-multiple\")]"))));	
	w.until(ExpectedConditions.visibilityOf(ConfirmationMsg));
	Assert.assertEquals(ConfirmationMsg.getText(), "Product Added To Cart", "Product added msg not Visible");


	driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/cart\"]")).click();
	
	 List<WebElement> addedProduct = driver.findElements(By.xpath("//p//following-sibling::h3"));
	 for(WebElement ProductAdded:addedProduct) {
		if(ProductAdded.getText().equalsIgnoreCase(MyProduct)) {
			Assert.assertTrue(true);
		}
	 }
	
	driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
	String Country = "India";
	
	driver.findElement(By.xpath("//input[@placeholder=\"Select Country\"]")).sendKeys(Country);
	w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//section[contains(@class,\"list-group\")]//span"))));
	List<WebElement> Suggetions = driver.findElements(By.xpath("//section[contains(@class,\"list-group\")]//span"));
	
	for(WebElement Suggetion:Suggetions) {
		System.out.println(Suggetion.getText());
		if(Suggetion.getText().equalsIgnoreCase(Country)) {
			Suggetion.click();
			driver.findElement(By.xpath("//div[@class=\"actions\"]/a")).click();
		}

	}
}
}

