package com.cgi.mapfre.Auto.pom;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class PolicySummaryPage extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="(//*[contains(text(),'Full Payment')])[1]//following::td[1]") private static WebElement getPremium;
	@FindBy(xpath="//select[@id='paymentmethod']") private static WebElement paymentMethod;
	@FindBy(xpath="//input[@id='bindButton1']") private static WebElement bindBtn;
	@FindBy(xpath="//input[@value='Save and Exit']") private static WebElement saveAndExit;
	@FindBy(xpath="//input[@id='policyNum']") private static WebElement policyNumber;
	@FindBy(xpath="//input[@id='status']") private static WebElement policyStatus;
	@FindBy(xpath="//a[contains(text(),'Quote Proposal')]") public static WebElement quotePDF;
	@FindBy(xpath="//input[@id='workItemId']") private static WebElement workItemId;
	@FindBy(id="submitPayment") private static WebElement submitPayment;
	@FindBy(id="txtPymtCustAcctId") private static WebElement txtPymtCustAcctId;
	@FindBy(xpath="//input[@id='txtPaymentAmtCents']//following::td[1]")private static WebElement  paymantAMount;
	@FindBy(id="btn2AContinue") private static WebElement ccContinueBtn;
	@FindBy(xpath="//input[@name='PaymentMethod' and @value='E']") private static WebElement eftPaymentMethod;
	@FindBy(id="confirmYes") private static WebElement confirmYes;
	@FindBy(id="ESIGN_AGENCY_OFFICE") private static WebElement esignAgency;
	
 public PolicySummaryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/* policy summary page */
	public void enterpolicySummaryDetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Policy Summary Page----------------------");
		try{
			
			TestReport.logNoScreen(LogStatus.PASS, "Work ID is "+MethodDef.getattributeValue(workItemId));
			MethodDef.click(esignAgency);
			MethodDef.dropdownValue(paymentMethod, TestData.get("PolicySummary_PaymentMethod"));
			CommonMethods.wait(1);
			MethodDef.clickwithWait(submitPayment,"Submit Button");
			swapWindow(1);
			CommonMethods.closeAndSwapToParentWindow();
			MethodDef.clickwithWait(confirmYes,"Bind Yes Button");
			MethodDef.click(bindBtn, "Bind Button");
			CommonMethods.wait(5);
			MethodDef.clickwithWait(saveAndExit, "Save and Exit");
			TestReport.logNoScreen(LogStatus.INFO, "Policy Status is "+MethodDef.getattributeValue(policyStatus));
			TestReport.log(LogStatus.PASS, "Policy Bound Successfully and Policy Number is "+MethodDef.getattributeValue(policyNumber));
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Policy Summary details "+e.getMessage());
			e.printStackTrace();
		}
		
}
	
	public void makeCCPayment() {
		MethodDef.sendKeys(txtPymtCustAcctId, "123456789");
		MethodDef.click(ccContinueBtn,"CCButton");
	}
	
	public void makeEFTPayment() {
		MethodDef.click(eftPaymentMethod, "eftPaymentMethod");
		CommonMethods.wait(1);
		MethodDef.sendKeys(txtPymtCustAcctId, paymantAMount.getText());
		MethodDef.click(ccContinueBtn,"CCButton");
		CommonMethods.wait(2);
	}
}
