package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='btn btn-warning btn-lg btn-block register-button']")
	WebElement register;
	
	@FindBy(xpath="//input[@class='email form-control']")
	WebElement email;
	
	@FindBy(xpath="//input[@class='password form-control']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block btn-login']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String logintitle() {
		return driver.getTitle();
	}
	public HomePage login() {
		email.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new HomePage();
	}
	public RegisterPage register() {
		register.click();
		return new RegisterPage();
		
	}
	

}
