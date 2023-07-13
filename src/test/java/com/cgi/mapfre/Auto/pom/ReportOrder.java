package com.cgi.mapfre.Auto.pom;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class ReportOrder extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="//*[contains(text(),'Current License Number')]//following::input[1]") private static WebElement currentLicenseNumber;
	@FindBy(xpath="(//*[contains(text(),'Current License Number')]//following::input[1])[2]") private static WebElement currentLicenseNumber2;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver[0].DriverInfo.License[ACIC_LicenseCurrentPrior='Current'].StateProvCd']") private static WebElement currentLicenseState;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver[0].DriverInfo.License[ACIC_LicenseCurrentPrior='Prior'].LicensePermitNumber']") private static WebElement priorLicenseNumber;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver[0].DriverInfo.License[ACIC_LicenseCurrentPrior='Prior'].StateProvCd']") private static WebElement priorLicenseState;
	@FindBy(xpath="//*[@id='']") private static WebElement clienPrimaryPhoneNumber;
	@FindBy(xpath="//input[@id='carFaxCheckBox0']") private static WebElement checkAgent;
	@FindBy(xpath="//input[@id='carFaxCheckBox1']") private static WebElement checkAgent1;
	@FindBy(xpath="//input[@id='carFaxCheckBox2']") private static WebElement checkAgent2;
	@FindBy(xpath="//*[@id='saveAndExitButton']") private static WebElement saveAndExitButton;
	@FindBy(xpath="//*[@id='doNotOrderButton']") private static WebElement doNotOrderButton;
	@FindBy(xpath="//*[@id='orderButton']") private static WebElement orderButton;
	@FindBy(xpath="//*[@id='continueButton']") public static WebElement continueButton;
	
	public ReportOrder(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	/* Consumer report Order */
	public void enterConsumerreportDetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Consumer Report Page----------------------");
		try{
			switch (TestData.get("TestCaseID")) {
			case "AutoTestCase_002":
			case "AutoTestCase_003":
				MethodDef.sendKeys(currentLicenseNumber, TestData.get("ConsumerReportOrder_LicenseNumber"));
				MethodDef.sendKeys(currentLicenseNumber2, TestData.get("ConsumerReportOrder_LicenseNumber2"));
				MethodDef.clickwithWait(orderButton, "Report Order");
				MethodDef.click(checkAgent, "Check box");
				MethodDef.click(checkAgent1, "Check box");
				MethodDef.clickwithWait(continueButton, "Report Info Continue");
				break;
			case "AutoTestCase_004":
				MethodDef.sendKeys(currentLicenseNumber, TestData.get("ConsumerReportOrder_LicenseNumber"));
				MethodDef.sendKeys(currentLicenseNumber2, TestData.get("ConsumerReportOrder_LicenseNumber2"));
				MethodDef.click(orderButton, "Report Order");
				CommonMethods.wait(7);
				MethodDef.click(checkAgent, "Check box");
				MethodDef.click(checkAgent1, "Check box2");
				MethodDef.click(checkAgent2, "Check box3");
				MethodDef.clickwithWait(continueButton, "Report Info Continue");
				break;
			default:
				MethodDef.clickwithWait(continueButton, "Report Info Continue");
				CommonMethods.wait(7);
				break;
			}
			
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Consumer Report Order details "+e.getMessage());
			e.printStackTrace();
		}
	}

	

}
