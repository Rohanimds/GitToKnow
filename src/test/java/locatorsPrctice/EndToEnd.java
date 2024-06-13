package locatorsPrctice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class EndToEnd {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		EdgeOptions option=new EdgeOptions();
//		option.addArguments("--disable-notification");
//		WebDriver driver=new EdgeDriver(option);

//		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rohan");
		driver.findElement(By.name("inputPassword")).sendKeys("MyPassword");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		String incorrectError="* Incorrect username or password";
		String error = driver.findElement(By.xpath("//p[@class=\"error\"]")).getText();
		
		Assert.assertEquals(error, incorrectError, "Expected error not present");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//div[@class=\"form-container sign-in-container\"]"
				+ "/preceding-sibling::*/form/input[@placeholder=\"Name\"]")).sendKeys("Hello");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		String password = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();
//		System.out.println(password);
		
		String[] actPass = password.split("'");
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		String MyPass = actPass[1];
		System.out.println(MyPass);
		driver.findElement(By.id("inputUsername")).sendKeys("Rohan");
		driver.findElement(By.name("inputPassword")).sendKeys(MyPass);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		String successMsg = driver.findElement(By.xpath("//p[contains(text(),\"successfully \")]")).getText();
		String expMsg = "You are successfully logged in.";
		
		Assert.assertEquals(successMsg, expMsg, "Success login msg not matching");
		driver.findElement(By.xpath("//button[@class=\"logout-btn\"]"));
		driver.quit();
		
	}
}
