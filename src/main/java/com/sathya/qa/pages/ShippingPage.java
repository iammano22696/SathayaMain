package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class ShippingPage extends BaseClass{
	
	@FindBy(xpath="//a[@class='btn btn-secondary btn-lg']")
	WebElement backbtn;
	
	@FindBy(xpath="//button[@class='btn btn-warning btn-lg shipping-method-next-step-button']")
	WebElement nextbtn;
	@FindBy(id="shippingoption_0")
	WebElement byground;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PaymentTypePage nextbtnclick() {
		nextbtn.click();
		return new PaymentTypePage();
	}

}
