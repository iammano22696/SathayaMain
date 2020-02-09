package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class BasketPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='btn btn-success btn-flat btn-flat-light btn-block btn-action']")
	WebElement gotocart;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-block btn-lg btn-continue-shopping']")
	WebElement shopping;
	
	@FindBy(xpath="//a[@class='btn btn-clear btn-block btn-action']")
	WebElement checkout;
	
	public BasketPage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		gotocart.click();
		return driver.getTitle();
	}
	
	public AddressPage checkout() {
		checkout.click();
		return new AddressPage();
	}
	
}
