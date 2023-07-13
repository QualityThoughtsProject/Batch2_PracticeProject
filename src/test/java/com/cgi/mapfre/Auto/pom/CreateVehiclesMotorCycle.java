package com.cgi.mapfre.Auto.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;


public class CreateVehiclesMotorCycle {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Motorcycle'])[2]") private static WebElement clickMotorCycle;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_VehSubTypeCd']") private static WebElement clientMotorCycleType;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.VehIdentificationNumber']") public static WebElement clientVIN;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ModelYear']") private static WebElement clientYear;
	@FindBy(xpath="(//*[@id='assistedManufacturer']") private static WebElement clientMake;
	@FindBy(xpath="(//*[@id='assistedModel']") private static WebElement clientModel;
	@FindBy(xpath="(//*[@id='assistedVehBodyTypeCd']") private static WebElement clientBody;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_StatedValue.FormatInteger']") public static WebElement agreedVaule;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.Displacement.NumUnits']") private static WebElement clientEngineSize;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_VehUseCdMC']") public static WebElement clientUsage;
	@FindBy(xpath="(//*[@id='PersAutoLineBusiness.PersVeh.ACIC_GarageLocInd']") private static WebElement clientGaragingAddr;
	

	public CreateVehiclesMotorCycle(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
