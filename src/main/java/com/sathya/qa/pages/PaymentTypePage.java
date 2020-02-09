package com.sathya.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class PaymentTypePage extends BaseClass {
	
	@FindBy(id="paymentmethod_0")
	WebElement cash;
	@FindBy(id="paymentmethod_1")
	WebElement paysathya;
	
	@FindBy(xpath="//a[@class='btn btn-secondary btn-lg']")
	WebElement backButton;
	@FindBy(xpath="//button[@class='btn btn-warning btn-lg payment-method-next-step-button']")
	WebElement nextButton;
	
	public PaymentTypePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ConfirmPage cash() {
		cash.click();
		nextButton.click();
		return new ConfirmPage();
	}
	public ConfirmPage paysathya() {
		paysathya.click();
		nextButton.click();
		return new ConfirmPage();
	}
	
	
	
	
	

}
