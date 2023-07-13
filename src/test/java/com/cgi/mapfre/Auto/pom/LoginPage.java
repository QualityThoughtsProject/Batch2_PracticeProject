package com.cgi.mapfre.Auto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends CommonMethods{
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='j_username']") private static WebElement userName;
	@FindBy(xpath="//input[@id='j_password']") private static WebElement password;
	@FindBy(xpath="//input[@id='NEXT']") private static WebElement loginButton;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String usernm,String pwd){
		try{
			
		MethodDef.sendKeys(userName, usernm);
		MethodDef.sendKeys(password, pwd);
		MethodDef.click(loginButton, "Login");
		TestReport.log(LogStatus.PASS, "Entered Login details");
		}catch(Exception e){
			//Log.error("Login failed "+e.getMessage());
			e.printStackTrace();
			TestReport.log(LogStatus.FAIL, "Unable to enter Login details "+e.getMessage());
		}
	}
}
