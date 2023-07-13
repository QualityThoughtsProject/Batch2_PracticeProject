package com.cgi.mapfre.Auto.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgi.mapfre.framework.CommonMethods;


public class CreateVehiclesMotorHome extends CommonMethods{
		
	WebDriver driver;
	
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_VehSubTypeCd']") private static WebElement clienMotorType;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.VehIdentificationNumber']") private static WebElement clienVIN;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ModelYear']") private static WebElement clienYear;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.Manufacturer']") private static WebElement clienMake;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.Model']") private static WebElement clienModel;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_StatedValue.FormatInteger']") private static WebElement clienStatedAmt;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.VehUseCd']") private static WebElement clienUsage;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_GarageLocInd']") private static WebElement clienGaragingAddr;

	CreateVehiclesMotorHome(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
