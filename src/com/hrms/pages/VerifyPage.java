package com.hrms.pages;

import org.testng.Reporter;




import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass
{
	//verify
	public static void verify_Title(String title)
	{
		if (driver.getTitle().equals(title))
		{
			Reporter.log("Title Matched");
			System.err.println("Title matched");
			
		}
		else
		{
			Reporter.log("Title not matched");
			Reporter.log(driver.getTitle());
			System.out.println("Titele not matched");
			System.err.println(driver.getTitle());
		}
	}

}
