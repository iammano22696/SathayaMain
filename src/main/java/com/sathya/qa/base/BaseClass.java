package com.sathya.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sathya.qa.util.TestUtil;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() {
	try {
		 prop=new Properties();
		FileInputStream fin=new FileInputStream("D:\\Eclipse2018-09\\SathyaMain\\src"
				+ "\\main\\java\\com\\sathya\\qa\\config\\config.properties");
		prop.load(fin);
	} catch (Exception e) {
		System.out.println("properties file error "+e.getMessage());
		
	} 
	
	}
	
	public static void intialization() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IM_WT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PL_WT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	}

