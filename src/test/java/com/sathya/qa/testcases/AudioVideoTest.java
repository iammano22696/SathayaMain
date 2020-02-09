package com.sathya.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.AudioVideo;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;
import com.sathya.qa.pages.ProductListPage;

import junit.framework.Assert;

public class AudioVideoTest extends BaseClass {

	HomePage homepage;
	LoginPage login;
	AudioVideo audiovideo;
	ProductListPage productlist;
	
	public AudioVideoTest() {
		super();
	}
	
	@BeforeMethod
	public void intil() {
		intialization();
		homepage=new HomePage();
		homepage.login();
		login=new LoginPage();
		login.login();
		homepage.audiovideoClick();
	}
	@Test(priority=1)
	public void led() {
		audiovideo=new AudioVideo();
		audiovideo.led_television();
		productlist=new ProductListPage();
		String actual="Buy LED TV Online | LED TV Online Shopping - SATHYA";
		Assert.assertEquals(productlist.gettitle(), actual);
		
	}
	@Test(priority=2)
	public void hometheatre() {
		audiovideo=new AudioVideo();
		audiovideo.home_Theatre();
		productlist=new ProductListPage();
		String actual="Home Theater Online: Buy Best Home Theater System India | SATHYA";
		Assert.assertEquals(productlist.gettitle(), actual);	
	}
	@Test(priority=3)
	public void playstation() {
		audiovideo=new AudioVideo();
		audiovideo.play_Station();
		productlist=new ProductListPage();
		String actual="Play Station";
		Assert.assertEquals(productlist.gettitle(), actual);	
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

	
}
