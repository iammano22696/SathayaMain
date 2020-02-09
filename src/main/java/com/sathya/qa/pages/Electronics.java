package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class Electronics extends BaseClass {
	
	@FindBy(xpath="(//div[@class='art-genericname'])[1]")
	WebElement laptop;
	@FindBy(xpath="(//div[@class='art-genericname'])[2]")
	WebElement mobiles;
	@FindBy(xpath="(//div[@class='art-genericname'])[3]")
	WebElement tablets;
	@FindBy(xpath="(//div[@class='art-genericname'])[4]")
	WebElement mobileAccessories;
	@FindBy(xpath="(//div[@class='art-genericname'])[5]")
	WebElement printer;
	
	public Electronics() {
		PageFactory.initElements(driver, this);
	}
	
	public ProductListPage laptop() {
		laptop.click();
		return new ProductListPage();
	}
	public ProductListPage mobiles() {
		mobiles.click();
		return new ProductListPage();
	}
	public ProductListPage tablets() {
		tablets.click();
		return new ProductListPage();
	}
	public ProductListPage mobileAccessories() {
		mobileAccessories.click();
		return new ProductListPage();
	}
	public ProductListPage printer() {
		printer.click();
		return new ProductListPage();
	}


}
