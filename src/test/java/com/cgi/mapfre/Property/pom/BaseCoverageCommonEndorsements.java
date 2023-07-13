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


public class BaseCoverageCommonEndorsements extends CommonMethods{

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='coverageA235']") private static WebElement CovADwelling;
	@FindBy(xpath="//*[@id='coverageC235']") private static WebElement CovCPersonalProperty;
	@FindBy(xpath="//*[@id='coverageCHO4']") private static WebElement CovCPersonalPropertyHo4;
	@FindBy(xpath="//*[@id='coverageCHO6']") private static WebElement CovCPersonalPropertyHo6;
	@FindBy(xpath="//*[@id='coverageD46']") private static WebElement CovDLossofUseHo4;
	@FindBy(xpath="//*[@id='coverageD235']") private static WebElement CovDLossofUse;
	@FindBy(xpath="//*[@id='coveragePL']") private static WebElement CovEPersonalLiability;
	@FindBy(xpath="//*[@id='coverageF-M']") private static WebElement CovFMedicalPayments;
	@FindBy(xpath="//*[@id='homeMaster']") private static WebElement PackagedEndorsements;
	@FindBy(xpath="//*[@id='base.endorsements']/div[2]/span[1]/div/span") private static WebElement PersPropReplacementCost;
	@FindBy(xpath="//*[@id='coverageSAACA_ISO']") private static WebElement SpecAddAmtOfInsforCovA;
	@FindBy(xpath="//*[@id='homeMaster']") private static WebElement WtrBkpAndSumpDischargeOrOverflow;
	@FindBy(xpath="//*[@id='identityFraud']") private static WebElement IdentityFraudExpense;
	@FindBy(xpath="//*[@id='base.endorsements']/div[6]/span[1]/div/span") private static WebElement PersonalInjury;
	@FindBy(xpath="//*[contains(text(),'Additional Residences')]//following::select[1]") private static WebElement AddResiRentToOtherLiabOnly;
	@FindBy(xpath="//*[contains(text(),'Other Insured Location')]//following::select[1]") private static WebElement OtherInsLocOccupByInsured;
	@FindBy(xpath="//*[@id='scheduledPersonalProperty']") private static WebElement ScheduPersonalProperty;
	@FindBy(xpath="//*[contains(text(),'Personal Umbrella')]//following::select[1]") private static WebElement PersonalUmbrellaLiability;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	
	public BaseCoverageCommonEndorsements (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Give the BaseCovComEndo information details
	public void enterBaseCovComEndoDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------BaseCovComEndo Page----------------------");
		/*
		 * Read the BaseCovComEndo page information from the test data excel.
		 */
		try {
			switch(TestData.get("FormType")){
				case "HO3":
					MethodDef.sendKeys(CovADwelling,TestData.get("BaseCov_CovADwelling"));
					CovEPersonalLiability.click();
					MethodDef.dropdownValue(CovEPersonalLiability,TestData.get("BaseCov_CovEPersonalLiability"));
					CovFMedicalPayments.click();
					break;
				case "HO4":
					MethodDef.sendKeys(CovCPersonalPropertyHo4,TestData.get("BaseCov_CovCPersonalProperty"));
					CovDLossofUseHo4.click();
					break;
				case "HO6":
					MethodDef.sendKeys(CovCPersonalPropertyHo6,TestData.get("BaseCov_CovCPersonalProperty"));
					CovFMedicalPayments.click();
				
			}
				
				MethodDef.dropdownValue(CovFMedicalPayments,TestData.get("BaseCov_CovFMedicalPayments"));
				MethodDef.dropdownValue(PackagedEndorsements,TestData.get("BaseCov_PackagedEndorsements"));
				//MethodDef.sendKeys(PersPropReplacementCost,TestData.get("BaseCov_PersPropReplacementCost"));
				MethodDef.dropdownValue(SpecAddAmtOfInsforCovA,TestData.get("BaseCov_SpecAddAmtOfInsforCovA"));
				MethodDef.dropdownValue(WtrBkpAndSumpDischargeOrOverflow, TestData.get("BaseCov_WtrBkpAndSumpDischargeOrOverflow"));
				MethodDef.dropdownValue(IdentityFraudExpense,TestData.get("BaseCov_IdentityFraudExpense"));
				//MethodDef.dropdownValue(PersonalInjury,TestData.get("BaseCov_PersonalInjury"));
				MethodDef.dropdownValue(AddResiRentToOtherLiabOnly,TestData.get("BaseCov_AddResiRentToOtherLiabOnly"));
				MethodDef.dropdownValue(OtherInsLocOccupByInsured,TestData.get("BaseCov_OtherInsLocOccupByInsured"));
				MethodDef.dropdownValue(ScheduPersonalProperty,TestData.get("BaseCov_ScheduPersonalProperty"));
				MethodDef.dropdownValue(PersonalUmbrellaLiability,TestData.get("BaseCov_PersonalUmbrellaLiability"));
			

			TestReport.logNoScreen(LogStatus.INFO,
							"------------------Property Info Page----------------------");
			MethodDef.click(continueButton,"baseCovComEndo Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS, "baseCovComEndo details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter baseCovComEndo data " + e.getMessage());
			e.printStackTrace();
		}
	}



}




