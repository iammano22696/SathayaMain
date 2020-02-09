package com.sathya.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.Electronics;
import com.sathya.qa.pages.HomeAppliances;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;
import com.sathya.qa.pages.ProductListPage;
import com.sathya.qa.pages.ProductPage;
import com.sathya.qa.util.TestUtil;

public class ProductPageTest extends BaseClass {

	HomePage homepage;
	LoginPage loginpage;
	HomeAppliances homeappliances;
	ProductListPage productlist;
	Electronics electronics;
	ProductPage product;
	
	
	public ProductPageTest() {
		super();
		
	}
	@BeforeMethod
	public void intil() {
		intialization();
		homepage=new HomePage();
		homepage.login();
		loginpage=new LoginPage();
		loginpage.login();
		homepage.electronicsclick();
		
	}
	@Test(priority=1)
	public void product1(){
		electronics=new Electronics();
		electronics.laptop();
		productlist=new ProductListPage();
		productlist.product1();
		product=new ProductPage();
		System.out.println("test1 product: "+product.title());
		String productname=product.title().substring(0, 10);
		product.features();
		TestUtil.excelwrite(productname,"//table[@class=\"table pd-specs-table\"]");
		product.productquantity("2");
		product.addtocard();
		
		
	}
	@Test(priority=2)
	public void product2(){
		electronics=new Electronics();
		electronics.mobiles();
		productlist=new ProductListPage();
		productlist.product2();
		product=new ProductPage();
		System.out.println("test2 product: "+product.title());
		String productname=product.title().substring(0, 10);
		product.features();
		TestUtil.excelwrite(productname,"//table[@class=\"table pd-specs-table\"]");
		product.productquantity("2");
		product.addtocard();
		
	}
	@Test(priority=3)
	public void product3(){
		electronics=new Electronics();
		electronics.tablets();
		productlist=new ProductListPage();
		productlist.product2();
		product=new ProductPage();
		System.out.println("test3 product: "+product.title());
		String productname=product.title().substring(0, 10);
		product.features();
		TestUtil.excelwrite(productname,"//table[@class=\"table pd-specs-table\"]");
		product.productquantity("2");
		product.addtocard();
		
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
