package com.sathya.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.AddressPage;
import com.sathya.qa.pages.BasketPage;
import com.sathya.qa.pages.ConfirmPage;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;
import com.sathya.qa.pages.PaymentTypePage;
import com.sathya.qa.pages.ShippingPage;
import com.sathya.qa.util.TestUtil;

public class ProducttoshippingTest extends BaseClass {
	HomePage homepage;
	LoginPage loginpage;
	BasketPage basket;
	AddressPage address;
	PaymentTypePage payment;
	ShippingPage ship;
	ConfirmPage confirm;
	
	
	
	public ProducttoshippingTest() {
		super();
		
	}
	
	@BeforeMethod
	public void intial() {
		intialization();
		homepage=new HomePage();
		homepage.login();
		loginpage=new LoginPage();
		loginpage.login();
		
		
	}
	@Test(priority=1)
	public void producttoship1() throws InterruptedException {
		homepage=new HomePage();
		homepage.basketclick();
		basket=new BasketPage();
		basket.checkout();
		address=new AddressPage();
		address.addressform();
		address.formtoshipconfirm();
		ship=new ShippingPage();
		ship.nextbtnclick();
		payment=new PaymentTypePage();
		Thread.sleep(2000);
		payment.cash();
	//	driver.findElement(By.xpath("//button[@class='btn btn-warning btn-lg shipping-method-next-step-button']\"")).click();
		confirm=new ConfirmPage();
		TestUtil.screenshot("cashmodeconfirm");	
		confirm.backbtn();
	}
	
	@Test(priority=2)
	public void producttoship2() {
		homepage=new HomePage();
		homepage.basketclick();
		basket=new BasketPage();
		basket.checkout();
		address=new AddressPage();
		address.shipconfirm();
		ship=new ShippingPage();
		ship.nextbtnclick();
		payment=new PaymentTypePage();
		payment.paysathya();
		
		confirm=new ConfirmPage();
		TestUtil.screenshot("paysathyamodeconfirm");
		confirm.backbtn();
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
