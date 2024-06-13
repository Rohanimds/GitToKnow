package local;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Intro {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] itemList = { "Brocolli", "Beetroot", "Tomato","Pumpkin" };
		Intro b=new Intro();
		b.addItems(driver, itemList);
		
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"action-block\"]/button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement promo = driver.findElement(By.xpath("//span[@class=\"promoInfo\"]"));
//		wait.until(ExpectedConditions.visibilityOf(promo));
		String codeApplied = driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();
		System.out.println(codeApplied);
		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
		
		 WebElement dd = driver.findElement(By.xpath("//select[@style=\"width: 200px;\"]"));
		
		Select s=new Select(dd);
		s.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		String orderMsg = driver.findElement(By.xpath("//span[contains(text(),\"Thank you\")]")).getText();
		System.out.println(orderMsg);

	}
	public void addItems(WebDriver driver, String[] itemList) {
		int j=0;
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split(" ");
			String newName = name[0].trim();
			List<String> newList = Arrays.asList(itemList);
			if (newList.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button[@type=\"button\"]")).get(i).click();
				if(j==itemList.length) {
					break;
				}
			}
		}
	}
}
