package locatorsPrctice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LocatorsAdvance {
	public static void main(String[] args) throws InterruptedException {
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohan\\Documents\\chromedriver-win64\\chromedriver.exe");
		//		WebDriver driver=new ChromeDriver();
		//		WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

			System.out.println(	driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
				
				
				boolean beforeCheck = driver.findElement(By.xpath(" //input[contains(@id,\"SeniorCitizenDiscount\")]")).isSelected();
				Assert.assertEquals(beforeCheck, false);
				
				driver.findElement(By.xpath(" //input[contains(@id,\"SeniorCitizenDiscount\")]")).click();
				boolean afterCheck = driver.findElement(By.xpath(" //input[contains(@id,\"SeniorCitizenDiscount\")]")).isSelected();
				Assert.assertEquals(afterCheck, true);
				
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
		
				for(int i=1;i<=4;i++) {
					driver.findElement(By.id("hrefIncAdt")).click();		
				}
		
				driver.findElement(By.id("btnclosepaxoption")).click();
				String actNum = driver.findElement(By.id("divpaxinfo")).getText(); 
				Assert.assertEquals("5 Adult", actNum);
		
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]/following-sibling::div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a[@value=\"DEL\"]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
				driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]/following-sibling::div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"BLR\"]")).click();
				
		
				driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
				
				driver.findElement(By.xpath("//div[@class=\"ui-datepicker-group ui-datepicker-group-first\"]"
						+ "/table/tbody/tr/td[@data-handler=\"selectDay\"]/a[text()=\"4\"]")).click();

//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String rtnDate = driver.findElement(By.id("spclearDate")).getAttribute("style");
		if(rtnDate.equalsIgnoreCase("display: none;")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(true);
		}




	}
}
