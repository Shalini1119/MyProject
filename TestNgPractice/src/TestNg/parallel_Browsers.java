package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters; 
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class parallel_Browsers {
	
		WebDriver driver= null;
		
		
		@BeforeTest
		@Parameters("NameOfBrowser")
		public void setup(String NameOfBrowser)
		{
			System.out.println("Browser name is"+ NameOfBrowser);
			
			if(NameOfBrowser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				driver= new ChromeDriver();
			}
			
			else if(NameOfBrowser.equalsIgnoreCase("Microsoft Edge"))
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\shalini.chilupuri\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		        driver=new EdgeDriver();
			}
		}
		
		@Test
		public void Test1() throws InterruptedException
		{
			driver.get("https://www.google.com/");
			Thread.sleep(4000);
		}

	}


