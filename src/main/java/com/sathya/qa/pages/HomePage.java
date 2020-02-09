package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="(//a[@class='menubar-link'])[3]")
	WebElement logIn_icon;
	
	@FindBy(xpath="(//a[@class='menubar-link'])[1]")
	WebElement contactUs;
	
	@FindBy(xpath="(//a[@class='menubar-link'])[2]")
	WebElement helpAndService;
	
	@FindBy(xpath="(//a[@class='shopbar-button navbar-toggler'])[1]")
	WebElement compare;
	
	@FindBy(xpath="(//a[@class='shopbar-button navbar-toggler'])[2]")
	WebElement wishlist;
	
	@FindBy(xpath="(//a[@class='shopbar-button navbar-toggler'])[3]")
	WebElement basket;
	
	@FindBy(xpath="//div[@class='shopbar-col shop-logo']")
	WebElement sathya_logo;
	
	@FindBy(xpath="(//li[@class='nav-item dropdown-submenu'])[1]")
	WebElement homeAppliances;
	
	@FindBy(xpath="(//li[@class='nav-item dropdown-submenu'])[2]")
	WebElement audiovideo;
	
	@FindBy(xpath="(//li[@class='nav-item dropdown-submenu'])[3]")
	WebElement electronics;
	
	@FindBy(xpath="(//li[@class='nav-item dropdown-submenu'])[4]")
	WebElement securitySolutions;
	
	@FindBy(xpath="(//li[@class='nav-item dropdown-submenu'])[5]")
	WebElement offerzone;
	
	@FindBy(xpath="//li[@class='nav-item']")
	WebElement giftCard;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage login() {
		logIn_icon.click();
		return new LoginPage();	
	}
	public String homepagetitle() {
		return driver.getTitle();	
	}
	public boolean logo() {
		return sathya_logo.isDisplayed();
	}
	public HomeAppliances homeappliancesclick() {
		homeAppliances.click();
		return new HomeAppliances();	
	}
	public AudioVideo audiovideoClick() {
		audiovideo.click();
		return new AudioVideo();
	}
	public Electronics electronicsclick() {
		electronics.click();
		return new Electronics();
	}
	public SecuritySolutions securitysolutionsclick() {
		securitySolutions.click();
		return new SecuritySolutions();
	}
	public OfferZone offerzoneclick() {
		offerzone.click();
		return new OfferZone();
	}
	public GiftCard giftcardclick() {
		giftCard.click();
		return new GiftCard();
	}
	public BasketPage basketclick() {
		basket.click();
		return new BasketPage();
	}
	
}
