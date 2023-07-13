package com.cgi.mapfre.Auto.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class CoverageSelection extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='effectiveDateId']") private static WebElement effectiveDateId;
	@FindBy(xpath="//*[@id='policyTerm']") private static WebElement policyTerm;
	@FindBy(xpath="//*[@id='paymentPlan']") private static WebElement paymentPlan;
	@FindBy(xpath="//*[@id='producer']") private static WebElement producer;
	@FindBy(xpath="//*[@id='pomPack']") private static WebElement pomPack;
	@FindBy(xpath="//*[@id='BI']") private static WebElement bodilyInjury;
	@FindBy(xpath="//*[@id='PD']") private static WebElement propertyDamage;
	@FindBy(xpath="//*[@id='MEDPM']") private static WebElement medical;
	@FindBy(xpath="//*[@id='PIP']") private static WebElement totalBenefitsOrWorkloss;
	@FindBy(xpath="//*[@id='UMS']") private static WebElement ums;
	@FindBy(xpath="//*[@id='UMC']") private static WebElement umc;
	@FindBy(xpath="//*[@id='BI0']") private static WebElement bodilyInjuryVehicle01;
	@FindBy(xpath="//*[@id='PD0']") private static WebElement propertyDamageVehicle01;
	@FindBy(xpath="//*[@id='MEDPM0']") private static WebElement medicalVehicle01;
	@FindBy(xpath="//*[@id='PIP0']") private static WebElement personalInjuryVehicle01;
	@FindBy(xpath="//*[@id='UDB0']") private static WebElement underinsuredMotoristsBIVehicle01;
	@FindBy(xpath="//*[@id='UNDPD0']") private static WebElement underinsuredMotoristsPDVehicle01;
	@FindBy(xpath="//*[@id='CC0']") private static WebElement isOTCCoverageOnly;
	@FindBy(xpath="//*[@id='COMP0']") private static WebElement OTCDed;
	//@FindBy(xpath="//*[@id='COLL0']") private static WebElement privatePassenger;
	@FindBy(xpath="//*[@id='LST0']") private static WebElement lossSettlement;
	@FindBy(xpath="//*[@id='SPC0']") private static WebElement additionalCustomEquipment;
	@FindBy(xpath="//*[@id='TOW0']") private static WebElement towing;
	@FindBy(xpath="//*[@id='RNT0']") private static WebElement rentalReimbursement;
	
	//Buttons
	@FindBy(xpath="//*[@id='QuoteResults']/div/p/input[2]") private static WebElement saveAndExit;
	@FindBy(xpath="//input[@value='Calculate']") private static WebElement calculateButton;
	@FindBy(xpath="//a[contains(text(),'Quote Proposal')]") public static WebElement quotePDF;
	@FindBy(xpath="(//*[contains(text(),'Full Payment')])[3]//following::td[1]") private static WebElement premium;
	@FindBy(xpath="//*[@id='continueButton']") public static WebElement continueButton;
	
	public CoverageSelection(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	/* Coverage info Details */
	public void enterCoveragedetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Coverages Page----------------------");
		try{
			MethodDef.dropdownValue(paymentPlan, TestData.get("Coverage_PaymentPlan"));
			MethodDef.dropdownValue(medical, TestData.get("Coverage_Medical"));
			MethodDef.click(bodilyInjury, "");
			MethodDef.click(calculateButton, "Coverage Info Calculate");
			CommonMethods.wait(3);
			verifyPDF();
			MethodDef.clickwithWait(continueButton, "Coverage Info Continue");
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Coverage details "+e.getMessage());
			e.printStackTrace();
		}
	}

	public void verifyPDF(){
		try{
			TestReport.logNoScreen(LogStatus.INFO, "--------Verifying PDF-------");
			MethodDef.clickwithWait(quotePDF, "Quote PDF");
			
			TestReport.log(LogStatus.INFO, "Premium Value in Quote results page is "+premium);
			CommonMethods.swapWindow(1);
			TestReport.log(LogStatus.PASS, "Premium value in PDF and Quote page is matched "+premium);
			
			CommonMethods.closeAndSwapToParentWindow();
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL, "Unable to verify premium "+e.getMessage());
		}
	}
	
}
