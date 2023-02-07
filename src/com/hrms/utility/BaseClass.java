package com.hrms.utility;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static void openApplication()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("Open Application");
		System.out.println("Open Application");
		
	}
	public static void closeApplication()
	{
		driver.close();
		Reporter.log("CloseApplication");
		System.out.println("Close Application");
	}
	
	
	

}
