package com.juaracoding.pageobject.posttest15;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.RegisterPage;


public class TestRegister{

	public static WebDriver driver;
	private RegisterPage registerPage;
	
	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}
	
	@BeforeMethod
	public void pageObject() {
		registerPage = new RegisterPage();
	}
	
	@Test 
	public void validRegister() {
		registerPage.register("witricantik", "witricantik@gmail.com" ,"1234");
	}
	
	@Test 
	public void invalidRegister() {
		registerPage.register("witricantik", "witricantik@gmail.com" ,"1234");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(1000*seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
