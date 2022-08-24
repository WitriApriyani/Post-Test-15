package com.juaracoding.pageobject.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class RegisterPage {

	private WebDriver driver;
	
	
	//SKENARIO REGISTER
	public RegisterPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement registuser;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement registemail;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement registpass;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement registbtn;
	
	@FindBy(xpath = "//a[contains(text(),'← Go to ToolsQA Demo Site')]")
	private WebElement backbtn;

	//scenario
	public void register(String registuser, String registemail, String registpass){
		
		this.registuser.sendKeys(registuser);
		this.registemail.sendKeys(registemail);
		this.registpass.sendKeys(registpass);
		registbtn.click();
		backbtn.click();
		
		
		
		
		
	}
	
	
}
