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

public class PolicySummary extends CommonMethods{

	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='pageBody']/fieldset[2]/a[1]") private static WebElement Accord80PDF;
	@FindBy(xpath="//*[@id='pageBody']/fieldset[2]/a[2]") private static WebElement quotePDF;
	@FindBy(xpath="//*[@id='onePay']") private static WebElement onePay;
	@FindBy(xpath="//*[@id='billTo']") private static WebElement billTo;
	@FindBy(xpath="//*[@id='downPaymentAmount']") private static WebElement downPaymentAmount;
	@FindBy(xpath="//*[@id='paymentmethod']") private static WebElement paymentmethod;
	@FindBy(xpath="//*[@id='bindButton1']") private static WebElement bindButton;
	@FindBy(xpath="//*[@value='Save and Exit']") private static WebElement saveAndExit;
	@FindBy(xpath="//input[@id='policyNum']") private static WebElement policyNumber;
	@FindBy(xpath="//input[@id='status']") private static WebElement policyStatus;
	
	
	public PolicySummary (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Validate Policy Summary details
	public void validatePolicySummaryDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Policy Summary  Page----------------------");
		/*
		 * Read the Quote Policy Summary information from the test data excel.
		 */
		try {
				MethodDef.click(onePay,TestData.get("PolicySummary_onePay"));
			
				MethodDef.dropdownValue(billTo,TestData.get("PolicySummary_billTo"));
			
				MethodDef.dropdownValue(paymentmethod,TestData.get("PolicySummary_paymentmethod"));
			    TestReport.logNoScreen(LogStatus.INFO,
							"-----------------Policy Summary  Page----------------------");
			MethodDef.clickwithWait(bindButton, "Policy Summary  bind");
			CommonMethods.wait(5);
			MethodDef.clickwithWait(saveAndExit, "Policy Save and exit");
			TestReport.log(LogStatus.PASS, "Policy Summary  details Entered");
			TestReport.logNoScreen(LogStatus.INFO, "Policy Status is "+MethodDef.getattributeValue(policyStatus));
			TestReport.log(LogStatus.PASS, "Policy Bound Successfully and Policy Number is "+MethodDef.getattributeValue(policyNumber));
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter Policy Summary  data " + e.getMessage());
			e.printStackTrace();
		}
	}

	
}
