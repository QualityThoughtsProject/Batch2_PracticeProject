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



public class ApplicationInformation extends CommonMethods{

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='documents']/a") private static WebElement quotePDF;
	@FindBy(xpath="//*[@id='msbRef']") private static WebElement MSBReferenceNumber;
	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Communications.PhoneInfo[PhoneTypeCd='Phone' && CommunicationUseCd='Home'].PhoneNumber']") private static WebElement PrimaryPhoneNumber;
	@FindBy(xpath="//*[@id='QuoteResults']/div/p/input[2]") private static WebElement saveAndExit;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	
	public ApplicationInformation (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

// Give the Application  information details
	public void enterAppInformationDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"-----------------Application  information  Page----------------------");
		/*
		 * Read the Application  information page information from the test data excel.
		 */
		try {
			
				MethodDef.sendKeys(MSBReferenceNumber,TestData.get("ApplicationInformation_MSBReferenceNumber"));
				//MethodDef.sendKeys(PrimaryPhoneNumber,TestData.get("PrimaryPhoneNumber"));
			
			
			TestReport
					.logNoScreen(LogStatus.INFO,
							"------------------Application  information Page----------------------");
			MethodDef.click(continueButton, "Application  information Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS, "Application  informationdetails Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter Application  information  data " + e.getMessage());
			e.printStackTrace();
		}
	}


}
