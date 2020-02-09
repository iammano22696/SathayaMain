package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class ProductPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='pd-price-block']")
	WebElement price;
	@FindBy(xpath="//input[@class='form-control form-control-lg']")
	WebElement quantity;
	@FindBy(xpath="//a[@class='btn btn-primary btn-lg btn-block btn-add-to-cart ajax-cart-link']")
	WebElement addtocard;
	@FindBy(xpath="(//div[@class='col-3 pd-action-item'])[1]")
	WebElement addtolist;
	@FindBy(xpath="(//div[@class='col-3 pd-action-item'])[2]")
	WebElement compare;
	@FindBy(xpath="(//div[@class='col-3 pd-action-item'])[3]")
	WebElement questions;
	@FindBy(xpath="(//div[@class='col-3 pd-action-item'])[4]")
	WebElement emailafriend;
	@FindBy(xpath="(//li[@class='nav-item'])[2]")
	WebElement description;
	@FindBy(xpath="(//li[@class='nav-item'])[3]")
	WebElement features;
	@FindBy(xpath="(//li[@class='nav-item'])[4]")
	WebElement reviews;
	@FindBy(xpath="//table[@class=\"table pd-specs-table\"]")
	WebElement table;
	
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String title() {
		return driver.getTitle();	
	}
	public void productquantity(String pquantity) {
		boolean b=quantity.isEnabled();
		if(b) {
		quantity.clear();
		quantity.sendKeys(pquantity);
		}
	}
	public HomePage addtocard() {
		boolean b=addtocard.isEnabled();
		if(b) {
		addtocard.click();
		}
		return new HomePage();
	}
	public void features() {
		features.click();
	}

}
