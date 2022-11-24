package TestNg;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
 
	WebDriver driver;
	
	@Test(priority=1)
	public void Home_Ebay()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	
	@Test(priority = 2)
	public void Search()
	{
		 driver.findElement(By.id("gh-ac")).sendKeys("Iphone 14");
		 driver.findElement(By.id("gh-btn")).click();
		
	}
	
	@Test(priority = 3)
	public void SelectItem()
	{
		
		driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 Pro - 256GB - Deep Purple (AT&T) NEW SEALED')]")).click();
		
	}
	
	@Test(priority=4)
	public void ClickItem() throws InterruptedException
	{
		Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='x-atc-action']")).click();
		driver.quit();
	}
}
