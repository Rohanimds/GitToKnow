package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class JavaPractice {
public static void main(String[] args) throws MalformedURLException, IOException {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	SoftAssert sAssert= new SoftAssert();
	
    List<WebElement> links = driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));

    for(WebElement link:links) {
    	String url = link.getAttribute("href");
    	
    	HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
    	conn.setRequestMethod("HEAD");
    	conn.connect();
    	int res = conn.getResponseCode();
    	System.out.println(res);
    	sAssert.assertTrue(res<400, link.getText()+" is not working, response is "+res);
//    	if(res>=400) {
//    		System.out.println();
//    	}
    	

    }
	sAssert.assertAll();	

	
}
}
