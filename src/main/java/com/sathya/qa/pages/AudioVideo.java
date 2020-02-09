package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class AudioVideo extends BaseClass {
	
	@FindBy(xpath="(//div[@class='art-genericname'])[1]")
	WebElement led_television;
	@FindBy(xpath="(//div[@class='art-genericname'])[2]")
	WebElement home_Theatre;
	
	@FindBy(xpath="(//div[@class='art-genericname'])[3]")
	WebElement play_Station;
	@FindBy(xpath="(//div[@class='art-genericname'])[4]")
	WebElement fire_TV_Stick;
	@FindBy(xpath="(//div[@class='art-genericname'])[5]")
	WebElement echo_and_Alexa;
	
	public AudioVideo() {
		PageFactory.initElements(driver, this);
	}
	
	public ProductListPage led_television() {
		led_television.click();
		return new ProductListPage();
	}
	public ProductListPage home_Theatre() {
		home_Theatre.click();
		return new ProductListPage();
	}
	public ProductListPage play_Station() {
		play_Station.click();
		return new ProductListPage();
	}
	public ProductListPage fire_TV_Stick() {
		fire_TV_Stick.click();
		return new ProductListPage();
	}
	public ProductListPage echo_and_Alexa() {
		echo_and_Alexa.click();
		return new ProductListPage();
	}


}
