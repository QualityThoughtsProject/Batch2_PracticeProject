package com.cgi.mapfre.Auto.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonMethods;


public class NewClientPage extends CommonMethods{
		
	WebDriver driver;
	
	
	NewClientPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
