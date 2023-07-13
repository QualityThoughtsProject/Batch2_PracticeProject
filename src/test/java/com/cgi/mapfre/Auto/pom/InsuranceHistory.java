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


public class InsuranceHistory extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='ACIC_PriorCovInd']") private static WebElement priorCovInd;
	@FindBy(xpath="//*[@id='InsurerName']") private static WebElement InsurerName;
	@FindBy(xpath="//*[@id='LengthTimeWithPreviousInsurer']") private static WebElement LengthTimeWithPreviousInsurer;
	@FindBy(xpath="//input[@id='ExpirationDt']") private static WebElement ExpirationDt;
	@FindBy(xpath="//*[@id='Limit']") private static WebElement Limit;
	
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	@FindBy(xpath="//*[@id='saveAndExitButton']") private static WebElement saveAndExit;
	
	public InsuranceHistory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* Insurance History Page */
	public void enterInsuranceHistoryDetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Insurance History Page----------------------");
		try{
			if(TestData.get("InsuranceHistoryInfo_CurrentInsured6months").equalsIgnoreCase("Yes")) {
				MethodDef.dropdownValue(priorCovInd, TestData.get("InsuranceHistoryInfo_CurrentInsured6months"));
				MethodDef.dropdownValue(InsurerName, TestData.get("InsuranceHistoryInfo_PriorcarrierName"));
				MethodDef.sendKeys(LengthTimeWithPreviousInsurer, TestData.get("InsuranceHistoryInfo_Agency"));
				ExpirationDt.click();
				MethodDef.sendKeys(ExpirationDt, TestData.get("InsuranceHistoryInfo_Expitydate"));
				MethodDef.dropdownValue(Limit, TestData.get("InsuranceHistoryInfo_BILimit"));
				MethodDef.clickwithWait(continueButton, "Continue");
				TestReport.log(LogStatus.PASS, "nsuranceHistoryInfo details Entered");
			}else {
				MethodDef.clickwithWait(continueButton, "Continue");
			}
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Insurance history details "+e.getMessage());
			e.printStackTrace();
		}
	}


}
