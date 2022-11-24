package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcases {
	
	@Test(groups="Logintest")
	public void login()
	{
		System.out.println("Details of Login");
	}

	
	@BeforeMethod(groups={"DBtest","Data"})
	public void DBConnect()
	{
		System.out.println("DB got connected");
	}
	
	@AfterMethod(groups="DBtest")
	public void DB_DisConnect()
	{
		System.out.println("DB got Disconnected");
	}
	
	@Test(priority=1,groups={"Logintest","Data"})
	public void Username()
	{
		System.out.println("Username is Entered");
	}
	
	@Test(priority=2,groups={"Logintest","Data"})
	public void Password()

{
		System.out.println("Password is Entered");
		}
	
	@AfterTest(groups="Logintest")
	public void LoginSuccess()
	{
		System.out.println("Login is Successful");
	}
}
