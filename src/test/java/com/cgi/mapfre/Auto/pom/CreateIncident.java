package com.cgi.mapfre.Auto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonMethods;


public class CreateIncident extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="(//*[@id='PersPolicy.AccidentViolation.@DriverRef']") private static WebElement clienDriver;
	@FindBy(xpath="(//*[@id='incidentDate']") private static WebElement clienIncidentDate;
	@FindBy(xpath="(//*[@id='PersPolicy.AccidentViolation.AccidentViolationCd']") private static WebElement clienIncidentType;
	
	
	CreateIncident(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	}
