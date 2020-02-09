package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.util.TestUtil;

public class AddressPage extends BaseClass {
	@FindBy(id="NewAddress_FirstName")
	WebElement firstname;
	@FindBy(id="NewAddress_LastName")
	WebElement lastname;
	@FindBy(id="NewAddress_Address1")
	WebElement address1;
	@FindBy(id="NewAddress_Address2")
	WebElement address2;
	@FindBy(id="NewAddress_City")
	WebElement city;
	@FindBy(id="NewAddress_ZipPostalCode")
	WebElement zipcode;
	@FindBy(id="NewAddress_CountryId")
	WebElement country;
	@FindBy(id="NewAddress_Email")
	WebElement email;
	@FindBy(id="NewAddress_PhoneNumber")
	WebElement phone;
	@FindBy(xpath="//a[@class='btn btn-secondary btn-lg']")
	WebElement backbtn;
	@FindBy(xpath="//button[@class='btn btn-warning btn-lg new-address-next-step-button']")
	WebElement nextbtn;
	@FindBy(xpath="(//button[@class='btn btn-warning btn-block select-shipping-address-button'])[1]")
	WebElement shipaddress1;
	@FindBy(xpath="(//button[@class='btn btn-warning btn-block select-shipping-address-button'])[2]")
	WebElement shipaddress2;
	@FindBy(xpath="//button[@class='btn btn-warning btn-block select-billing-address-button']")
	WebElement billtoshipcnfm;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	public void addressform() {
		firstname.sendKeys(TestUtil.getdata("Address", 1, 1));
		lastname.sendKeys(TestUtil.getdata("Address", 2, 1));
		address1.sendKeys(TestUtil.getdata("Address", 3, 1));
		address2.sendKeys(TestUtil.getdata("Address", 4, 1));
		city.sendKeys(TestUtil.getdata("Address", 5, 1));
		zipcode.sendKeys(TestUtil.getdata("Address", 6, 1));
		Select select=new Select(country);
		select.selectByIndex(1);
		email.sendKeys(TestUtil.getdata("Address", 7, 1));
		phone.sendKeys(TestUtil.getdata("Address", 8, 1));
		nextbtn.click();
	}
	public ShippingPage formtoshipconfirm() {
		shipaddress1.click();
		return new ShippingPage();	
	}
	public ShippingPage shipconfirm() {
		billtoshipcnfm.click();
		shipaddress1.click();
		return new ShippingPage();	
	}
	
}
