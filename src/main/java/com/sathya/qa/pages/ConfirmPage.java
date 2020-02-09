package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class ConfirmPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='btn btn-secondary btn-lg btn-block']")
	WebElement backbtn;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-lg btn-block btn-buy']")
	WebElement nextbtn;
	
	public ConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void backbtn() {
		backbtn.click();
	}

}
