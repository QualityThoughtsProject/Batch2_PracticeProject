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

public class ClientView {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Private Passenger')]") public static WebElement privatePassenger;
	@FindBy(xpath="//a[contains(text(),'HO 3')]") public static WebElement ho3;
	@FindBy(xpath="//a[contains(text(),'HO 4')]") private static WebElement ho4;
	@FindBy(xpath="//a[contains(text(),'HO 6')]") private static WebElement ho6;
	@FindBy(id="InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].InsuredOrPrincipalInfo.PersonInfo.BirthDt") private static WebElement dateOfBirth;
	@FindBy(id="monthAndYearPurchased") private static WebElement monthAndYearPurchased;
	@FindBy(id="ACIC_AllowFinancialMeritInd") private static WebElement orderFinanceMerit;
	@FindBy(id="continueButton") private static WebElement continueButton;
	
	public ClientView(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Going to General Info page*/
	public void enterPolicyInformationPage() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Client View Page----------------------");
		try {
			MethodDef.click(privatePassenger, "Private Passenger");
			CommonDef.waitForPageLoad();

			
			TestReport.log(LogStatus.PASS, "General Info details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Unable to enter General Info data "
					+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void selectLOB() throws EncryptedDocumentException,IOException {
		TestReport.logNoScreen(LogStatus.INFO,"------------------Client View Page----------------------");
	try {
		switch(TestData.get("FormType")) {
		case "HO3":
			MethodDef.click(ho3, "Homeowners");
			break;
		
		case "HO4":
			MethodDef.click(ho4, "Renters");
			break;
			
		case "HO6":
			MethodDef.click(ho6, "Condominium");
			break;
		}
		CommonMethods.wait(2);
		MethodDef.sendKeys(dateOfBirth, TestData.get("PolicyInfo_DOB"));
		MethodDef.sendKeys(monthAndYearPurchased, TestData.get("PolicyInfo_MonthAndYearPurchased"));
		MethodDef.dropdownValue(orderFinanceMerit, TestData.get("PolicyInfo_OrderFinance"));
		MethodDef.click(continueButton,"continueButton");
	} catch (Exception e) {
		TestReport.log(LogStatus.FAIL, "Unable to enter General Info data "	+ e.getMessage());
		e.printStackTrace();
}
}
	
}
