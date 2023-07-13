package com.cgi.mapfre.Property.pom;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class PropertyInformation extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='ResidenceType']") private static WebElement ResidenceType;
	@FindBy(xpath="//*[@id='usageType']") private static WebElement usageType;
	@FindBy(xpath="//*[@id='numFamilies']") private static WebElement numFamilies;
	@FindBy(xpath="//*[@id='numberOfUnitsWithinFirewall']") private static WebElement numberOfUnitsWithinFirewall;
	@FindBy(xpath="//*[@id='constructionType']") private static WebElement constructionType;
	@FindBy(xpath="//*[@id='HomeYearBuilt']") private static WebElement HomeYearBuilt;
	@FindBy(xpath="//*[@id='propertyInfoRoofType']") private static WebElement propertyInfoRoofType;
	@FindBy(xpath="//*[@id='WindstormMitigationFeatures']") private static WebElement WindstormMitigationFeatures;
	@FindBy(xpath="//*[@id='DistanceToHydrant']") private static WebElement DistanceToHydrant;
	@FindBy(xpath="//*[@id='FireProtectionDevice']") private static WebElement fireAlarm;
	@FindBy(xpath="//*[@id='BurglarProtectionDevice']") private static WebElement burglarAlarm;
	@FindBy(xpath="//*[contains(text(),'Sprinkler')]//following::select[1]") private static WebElement sprinkler;
	@FindBy(xpath="//*[@id='LightningProtection']") private static WebElement lightningProtection;
	@FindBy(xpath="//*[contains(text(),'Gated Community')]//following::select[1]") private static WebElement gatedCommunity;
	@FindBy(xpath="//*[@id='oilTankID']") private static WebElement oilTank;
	@FindBy(xpath="//*[contains(text(),'Wood Stove')]//following::select[1]") private static WebElement WoodStove;
	@FindBy(xpath="//*[@id='swimmingPoolCT']") private static WebElement swimmingPool;
	@FindBy(xpath="(//*[contains(text(),'Spa')]//following::select[1])[2]") private static WebElement spa;
	@FindBy(xpath="//*[contains(text(),'Trampoline')]//following::select[1]") private static WebElement trampoline;
	@FindBy(xpath="//*[@id='dogIDEnhancement']") private static WebElement dog;
	@FindBy(xpath="//*[contains(text(),'Livestock')]//following::select[1]") private static WebElement livestock;
	@FindBy(xpath="//*[@id='ACIC_LossHistoryInd']") private static WebElement LossHistoryInd;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;

	public PropertyInformation (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	// Give the property information details
	public void enterPropertyInfoDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Property Info Page----------------------");
		/*
		 * Read the PropertyInformation page information from the test data
		 * excel.
		 */
		try {
				MethodDef.dropdownValue(ResidenceType,TestData.get("PropertyInformation_ResidenceType"));
			
				MethodDef.dropdownValue(usageType,TestData.get("PropertyInformation_UsageType"));
			
				MethodDef.dropdownValue(numFamilies,TestData.get("PropertyInformation_NumOfFamilies"));
				String s=TestData.get("PropertyInformation_NumberOfUnitsWithinFirewall");
				if(TestData.get("PropertyInformation_NumberOfUnitsWithinFirewall")!=null) {
				MethodDef.dropdownValue(numberOfUnitsWithinFirewall,TestData.get("PropertyInformation_NumberOfUnitsWithinFirewall"));
				}
				MethodDef.dropdownValue(constructionType,TestData.get("PropertyInformation_ConstructionType"));
			    MethodDef.sendKeys(HomeYearBuilt,TestData.get("PropertyInformation_HomeYearBuilt"));
			    MethodDef.dropdownValue(propertyInfoRoofType,TestData.get("PropertyInformation_PropertyInfoRoofType"));
			    MethodDef.dropdownValue(WindstormMitigationFeatures,TestData.get("PropertyInformation_WindstormMitigationFeatures"));
			    MethodDef.dropdownValue(DistanceToHydrant,TestData.get("PropertyInformation_DistanceToHydrant"));
		        MethodDef.dropdownValue(fireAlarm,TestData.get("PropertyInformation_FireAlarm"));
		        MethodDef.dropdownValue(burglarAlarm,TestData.get("PropertyInformation_BurglarAlarm"));
			    MethodDef.dropdownValue(sprinkler,TestData.get("PropertyInformation_Sprinkler"));
			    MethodDef.dropdownValue(lightningProtection,TestData.get("PropertyInformation_LightningProtection"));
			    MethodDef.dropdownValue(gatedCommunity,TestData.get("PropertyInformation_GatedCommunity"));
			    MethodDef.dropdownValue(oilTank,TestData.get("PropertyInformation_OilTank"));
			    MethodDef.dropdownValue(swimmingPool,TestData.get("PropertyInformation_SwimmingPool"));
			    MethodDef.dropdownValue(spa,TestData.get("PropertyInformation_Spa"));
			    MethodDef.dropdownValue(trampoline,TestData.get("PropertyInformation_Trampoline"));
			    MethodDef.dropdownValue(dog,TestData.get("PropertyInformation_Dog"));
			    MethodDef.dropdownValue(livestock,TestData.get("PropertyInformation_Livestock"));
				TestReport.logNoScreen(LogStatus.INFO,
							"------------------Property Info Page----------------------");
				MethodDef.click(continueButton, "Property Info Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS, "Property Info details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter Property Info data " + e.getMessage());
			e.printStackTrace();
		}
	}


	}



	
