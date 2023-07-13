
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


public class OptionalEndorsements extends CommonMethods{

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='ordinanceOrLawISO']") private static WebElement AdditionalOrdinanceorLaw;
	@FindBy(xpath="//*[@id='specialPersonalPropertyforh3']") private static WebElement SpecPersonalProperty;
	@FindBy(xpath="//*[@id='theftBldgMtrlGrl']") private static WebElement TheftOfBuildingMaterials;
	@FindBy(xpath="//*[@id='specLossSettlement']") private static WebElement SpecialLossSett;
	@FindBy(xpath="//*[@id='earthquakeCov']") private static WebElement EarthquakeCoverage;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	

	public OptionalEndorsements (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Give the OptionalEndo information details
	public void enterOptionalEndoDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Optional Endorsements Info Page----------------------");
		/*
		 * Read the OptionalEndo page information from the test data excel.
		 */
		try {
				MethodDef.dropdownValue(AdditionalOrdinanceorLaw,TestData.get("OptionalEndo_AdditionalOrdinanceorLaw"));
			
				MethodDef.dropdownValue(SpecPersonalProperty,TestData.get("OptionalEndo_SpecPersonalProperty"));
			
				MethodDef.dropdownValue(TheftOfBuildingMaterials,TestData.get("OptionalEndo_TheftOfBuildingMaterials"));
			

				MethodDef.dropdownValue(SpecialLossSett,TestData.get("OptionalEndo_SpecialLossSett"));
			
				MethodDef.dropdownValue(EarthquakeCoverage,TestData.get("OptionalEndo_EarthquakeCoverage"));
			

			
			MethodDef.click(continueButton,"OptionalEndorsements Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS,"OptionalEndorsements details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,"Unable to enter OptionalEndorsements data "
							+ e.getMessage());
			e.printStackTrace();
		}
	}


}
