package locatorsPrctice;

import java.util.Arrays;
import java.util.List;

//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String[] itemList = { "Brocolli", "Beetroot", "Tomato","Pumpkin" };
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
