package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sathya.qa.base.BaseClass;

public class RegisterPage extends BaseClass {
	
	@FindBy(id="gender-male")
	WebElement gender_male;
	
	@FindBy(id="gender-female")
	WebElement gender_female;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement lastname;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	WebElement email;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	WebElement password;
	
	@FindBy(xpath="(//input[@class='form-control'])[5]")
	WebElement confirmpassword;
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
	WebElement companyname;
	
	@FindBy(xpath="(//input[@class='form-control'])[7]")
	WebElement phone;
	
	@FindBy(xpath="(//select[@class='date-part form-control noskin'])[1]")
	WebElement day;
	
	@FindBy(xpath="(//select[@class='date-part form-control noskin'])[2]")
	WebElement month;
	
	@FindBy(xpath="(//select[@class='date-part form-control noskin'])[3]")
	WebElement year;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	WebElement registerbutton;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String registertitle() {
		return driver.getTitle();
	}
	
	public HomePage register(String fn,String ln,String date,String mnth,String yr,String mail,String pword,String cnfm,String pne) {
		gender_male.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		Select select=new Select(day);
		select.selectByValue(String.valueOf(date));
		Select select1=new Select(month);
		select1.selectByVisibleText(mnth);
		Select select2=new Select(year);
		select2.selectByValue(String.valueOf(yr));
		email.sendKeys(mail);
		password.sendKeys(pword);
		confirmpassword.sendKeys(cnfm);
		phone.sendKeys(String.valueOf(pne));
		registerbutton.click();
		return new HomePage();
		
		
		
	}

}
