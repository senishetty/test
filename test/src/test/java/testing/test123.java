package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test123 {
	@Test
	public static void test1()
	{
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Browser is opened");
		driver.close();
		driver.quit();
	}
	@Test
	public static void test2()
	{
		System.out.println("Test2 is executed");
	}

}