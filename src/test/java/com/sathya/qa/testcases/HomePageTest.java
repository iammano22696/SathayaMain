package com.sathya.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends BaseClass{
	
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setintialization() {
		intialization();
		
	}
	@Test(priority=1)
	public void logotest() {
		homepage=new HomePage();
		Assert.assertTrue(homepage.logo());
		
	}
	@Test(priority=2)
	public void homepagetitletest() {
		homepage=new HomePage();
		Assert.assertEquals("",homepage.homepagetitle());
	}
	@Test(priority=3)
	public void home2logintest() {
		homepage=new HomePage();
		homepage.login();
		Assert.assertEquals("Login",homepage.homepagetitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
