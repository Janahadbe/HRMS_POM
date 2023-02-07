package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 
{
	@Test
public static void tc00_1()
	{
//	public static void main(String args[])
//	{
		//test steps
		BaseClass.openApplication();
		VerifyPage.verify_Title("HRMS");
		LoginPage.login("admin","admin");
		VerifyPage.verify_Title("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApplication();
		
	}

}
