package com.sathya.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sathya.qa.base.BaseClass;
import com.sathya.qa.pages.HomePage;
import com.sathya.qa.pages.LoginPage;
import com.sathya.qa.pages.RegisterPage;
import com.sathya.qa.util.TestUtil;

public class RegisterPageTest extends BaseClass{
	HomePage homepage;
	LoginPage login;
	RegisterPage register;
	
	
	public RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void intil() {
		intialization();
		homepage=new HomePage();
		homepage.login();
		login=new LoginPage();
		login.register();
		
	}
	@DataProvider()
	public Iterator<Object[]> data(){
		ArrayList<Object[]> list=new ArrayList<Object[]>();
		for(int row=1;row<TestUtil.lastrow("Register")+1;row++) {
	String fn=TestUtil.getdata("Register", row, 0);
	String ln=TestUtil.getdata("Register", row, 1);
	String date=TestUtil.getdata("Register", row, 2);
	String mnth=TestUtil.getdata("Register", row, 3);
	String yr=TestUtil.getdata("Register", row, 4);
	String email=TestUtil.getdata("Register", row, 5);
	String pass=TestUtil.getdata("Register", row, 6);
	String cnfm=TestUtil.getdata("Register", row, 7);
	String ph=TestUtil.getdata("Register", row, 8);
	Object[] ob= {fn,ln,date,mnth,yr,email,pass,cnfm,ph};
	list.add(ob);
		}
		return list.iterator();
	
}
	
	@Test(dataProvider="data")
	public void test1(String fn,String ln,String date,String mnth,String yr,String mail,String pword,String cnfm,String pne){
		register=new RegisterPage();
		register.register(fn, ln, date, mnth, yr, mail, pword, cnfm, pne);
		
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	}

		

