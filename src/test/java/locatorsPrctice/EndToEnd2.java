package locatorsPrctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		EndToEnd2 pass=new EndToEnd2();
		

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String name="Rohan";

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		String myPassword = pass.password(driver);
		driver.findElement(By.name("inputPassword")).sendKeys(myPassword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);

		String welcomeMsg = driver.findElement(By.xpath("//h2")).getText();
		Assert.assertEquals(welcomeMsg, "Hello "+name+"," );

		String successMsg = driver.findElement(By.xpath("//p[contains(text(),\"successfully \")]")).getText();
		String expMsg = "You are successfully logged in.";

		Assert.assertEquals(successMsg, expMsg, "Success login msg not matching");
		driver.findElement(By.xpath("//button[@class=\"logout-btn\"]"));		
		driver.quit();

	}
	
	public String password(WebDriver driver) throws InterruptedException {
		
	driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		String password = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();
//		System.out.println(password);
		
		String[] actPass = password.split("'");
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		String myPass = actPass[1];
		System.out.println(myPass);
		return myPass;
	}


}
