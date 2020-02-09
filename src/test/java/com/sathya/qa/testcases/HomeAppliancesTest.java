package com.sathya.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.HomeAppliances;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;
import com.sathya.qa.pages.ProductListPage;



public class HomeAppliancesTest extends BaseClass {

	HomePage homepage;
	LoginPage loginpage;
	HomeAppliances homeappliances;
	ProductListPage productlist;
	
	public HomeAppliancesTest() {
		super();
	}
	@BeforeMethod
	public void intial() {
		intialization();
		homepage=new HomePage();
		homepage.login();
		loginpage=new LoginPage();
		loginpage.login();
		homepage.homeappliancesclick();
		
		
	}
	@Test(priority=1)
	public void refrigeratortest() {
		homeappliances=new HomeAppliances();
		homeappliances.refrigerator();
		productlist=new ProductListPage();
		String actual="Refrigerator - Buy Fridge online at Best Prices | SATHYA";
		Assert.assertEquals(productlist.gettitle(), actual);
		
		
		
	}
	@Test(priority=2)
	public void air_Conditionertest() {
		homeappliances=new HomeAppliances();
		homeappliances.air_Conditioner();
		productlist=new ProductListPage();
		String actual="AC - Buy Air Conditioners Online at Best Prices | SATHYA";
		Assert.assertEquals(productlist.gettitle(), actual);
		
	}
	@Test(priority=3)
	public void aircoolertest() {
		homeappliances=new HomeAppliances();
		homeappliances.aircooler();
		productlist=new ProductListPage();
		String actual="Buy Air Cooler Online at Best Prices In India | Air Coolers | SATHYA";
		Assert.assertEquals(productlist.gettitle(), actual);
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
