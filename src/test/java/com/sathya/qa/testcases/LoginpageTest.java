package com.sathya.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;

public class LoginpageTest extends BaseClass {
	HomePage homepage;
	LoginPage loginpage;
	
	
	public LoginpageTest() {
		super();
	}
	@BeforeMethod
	public void setintialization() {
		intialization();
		homepage=new HomePage();
		homepage.login();	
	}
	@Test(priority=1)
	public void login() {
		loginpage=new LoginPage();
		loginpage.login();
	}
	@Test(priority=2)
	public void newregister() {
		loginpage=new LoginPage();
	
		loginpage.register();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
