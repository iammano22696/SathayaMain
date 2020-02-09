package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class HomeAppliances extends BaseClass {
	
	@FindBy(xpath="(//div[@class='art-genericname'])[1]")
	WebElement air_Conditioner;
	@FindBy(xpath="(//div[@class='art-genericname'])[2]")
	WebElement refrigerator;
	@FindBy(xpath="(//div[@class='art-genericname'])[3]")
	WebElement air_Cooler;
	@FindBy(xpath="(//div[@class='art-genericname'])[4]")
	WebElement washing_Machine;
	@FindBy(xpath="(//div[@class='art-genericname'])[5]")
	WebElement water_Heater;
	@FindBy(xpath="(//div[@class='art-genericname'])[6]")
	WebElement kitchen_Appliances;
	
	public HomeAppliances() {
		PageFactory.initElements(driver, this);
	}
	
	public ProductListPage air_Conditioner() {
		air_Conditioner.click();
		return new ProductListPage();
	}
	public ProductListPage refrigerator() {
		refrigerator.click();
		return new ProductListPage();
	}
	public ProductListPage aircooler() {
		air_Cooler.click();
		return new ProductListPage();
	}
	public ProductListPage kitchen_Appliances() {
		kitchen_Appliances.click();
		return new ProductListPage();
	}
	public ProductListPage washing_Machine() {
		washing_Machine.click();
		return new ProductListPage();
	}

}
