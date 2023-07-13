package com.cgi.mapfre.Auto.pom;

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
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class CreatePolicyInfo extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='PersPolicy.ContractTerm.DurationPeriod.NumUnits']") private static WebElement clientPolicyTerm;
	@FindBy(xpath="//*[@id='policyType']") private static WebElement clientPolicyType;
	@FindBy(xpath="//*[@id='AAAMembership']") private static WebElement clientAAA;
	@FindBy(xpath="//*[@id='AAAMemberSinceID']") private static WebElement AAAMemberSinceID;
	@FindBy(xpath="//*[@id='PersPolicy.PersApplicationInfo.ResidenceTypeCd']") private static WebElement clientResidence;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.Coverage[CoverageCd='ACCT'].Option[OptionTypeCd='YNInd1'].OptionCd']") private static WebElement clientMultiPolicy;
	@FindBy(xpath="//*input[@id='continueButton2']") private static WebElement continueBtn;

	public CreatePolicyInfo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Policy Info page*/
	public void enterPolicyInfoDetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Policy Info Page----------------------");
		try{
			MethodDef.dropdownValue(clientResidence, TestData.get("PolicyInfo_ResidenceType"));
			MethodDef.dropdownValue(clientAAA, TestData.get("PolicyInfo_AAAMember"));
			MethodDef.sendKeys(AAAMemberSinceID, TestData.get("PolicyInfo_AAAMemberSince"));
			MethodDef.click(CreateClient.clickContinueBtn, "Policy Info Continue");
			TestReport.log(LogStatus.PASS, "Policy Info details Entered");
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Policy Info data "+e.getMessage());
			e.printStackTrace();
		}
	}
		
}
