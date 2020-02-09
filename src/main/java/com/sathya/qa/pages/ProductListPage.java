package com.sathya.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sathya.qa.base.BaseClass;

public class ProductListPage extends BaseClass {
	
	@FindBy(xpath="(//h3[@class='art-name'])[1]")
	WebElement product1;
	@FindBy(xpath="(//h3[@class='art-name'])[2]")
	WebElement product2;
	@FindBy(xpath="(//h3[@class='art-name'])[3]")
	WebElement product3;
	@FindBy(xpath="(//h3[@class='art-name'])[4]")
	WebElement product4;
	@FindBy(xpath="(//h3[@class='art-name'])[5]")
	WebElement product5;
	@FindBy(xpath="(//h3[@class='art-name'])[6]")
	WebElement product6;
	@FindBy(xpath="(//h3[@class='art-name'])[7]")
	WebElement product7;
	@FindBy(xpath="(//h3[@class='art-name'])[8]")
	WebElement product8;
	
	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}
	public ProductPage product1() {
		product1.click();
		return new ProductPage();
	}
	public ProductPage product2() {
		product2.click();
		return new ProductPage();
	}
	public ProductPage product3() {
		product3.click();
		return new ProductPage();
	}
	public ProductPage product4() {
		product4.click();
		return new ProductPage();
	}
	public ProductPage product5() {
		product5.click();
		return new ProductPage();
	}
	public ProductPage product6() {
		product6.click();
		return new ProductPage();
	}
	public ProductPage product7() {
		product7.click();
		return new ProductPage();
	}
	public ProductPage product8() {
		product8.click();
		return new ProductPage();
	}
	public String gettitle() {
		return driver.getTitle();
	}

}
