package locatorsPrctice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTab {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//  You can use any one option to switch to other window 1st is Window 2nd is Tab	
		//	driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> hdl = driver.getWindowHandles();
		Iterator<String> it = hdl.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);

		driver.get("https://rahulshettyacademy.com/");

		String course = driver.findElement(By.xpath("(//h2/a)[1]")).getText();
		driver.close();
		driver.switchTo().window(parent);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);
		// This will take screenshot of only the WebElement
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));

		//get height and width of a webelement

		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}
}
