package com.juaracoding.pageobject.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;

	// SKENARIO LOGIN
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;

	@FindBy(xpath = "//span[@id='spanMessage']")
	private WebElement msgError;

	public void login(String user,String pass) {
		this.user.sendKeys(user);
		this.pass.sendKeys(pass);
		login.click();
	}
	
	public String getMsgError() {
		return msgError.getText();
	}
	
	
	
	//SKENARIO REGISTER LANGSUNG KE LOGIN
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement myacc;

	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement registuser;

	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement registemail;

	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement registpass;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement registbtn;

	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement loginuser;

	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement loginpass;

	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement loginbtn;

	public void registandlogin(String registuser, String registemail, String registpass, String loginuser,
			String loginpass) {

		myacc.click();
		this.registuser.sendKeys(registuser);
		this.registemail.sendKeys(registemail);
		this.registpass.sendKeys(registpass);
		registbtn.click();
		this.loginuser.sendKeys(loginuser);
		this.loginpass.sendKeys(loginpass);
		loginbtn.click();

	}

}
