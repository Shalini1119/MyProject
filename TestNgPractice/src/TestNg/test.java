package TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class test {
	
	public static WebDriver driver = null;
	
	@Test
	
	public void ClassDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Google Driver is Opened");
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ZenQ");
		
		driver.close();
		
		System.out.println("Google Driver is Closed");
		
		
	}
	
	

}
