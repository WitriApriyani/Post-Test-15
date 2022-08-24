package com.juaracoding.pageobject.posttest15;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.Delayed;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.LoginPage;

public class TestLogin {

	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}
	
	
	@BeforeMethod
	public void pageObject() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void testInvalidLogin() {
		scroll(300);
		loginPage.login("witricantik", "1234");
	}
	
	
	@Test
	public void testValidLogin() {
		scroll(300);
		loginPage.login("Admin", "admin123");
	}
	

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	
	static void delay(int detik) {
	try {
		Thread.sleep(1000*detik);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
		static void scroll(int vertical) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("window.scrollBy(0,"+vertical+")");
		}
	}
