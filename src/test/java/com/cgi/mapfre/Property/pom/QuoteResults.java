
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

public class QuoteResults extends CommonMethods{

	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='PersPolicy.ContractTerm.EffectiveDt']") private static WebElement effectiveDateId;
	@FindBy(xpath="//*[@id='producer']") private static WebElement producer;
	@FindBy(xpath="//*[contains(text(),'All Perils')]//following::select[1]") private static WebElement allPerilsDeductible;
	@FindBy(xpath="//*[contains(text(),'Windstorm Deductible Type')]//following::select[1]") private static WebElement WindHailDeductible;
	@FindBy(xpath="//*[contains(text(),'Hurricane')]//following::select[1]") private static WebElement Hurricane;
	
	//Buttons
	
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	@FindBy(xpath="//*[@id='QuoteResults']/div/p/input[2]") private static WebElement saveAndExit;
	@FindBy(xpath="//*[@id='buttons']/p/input[3]") private static WebElement calculateButton;
	@FindBy(xpath="//*[@id='QuoteResults']/div[1]/fieldset[4]/a") private static WebElement quotePDF;
	@FindBy(xpath="//*[@id='QuoteResults']/table/tbody/tr[14]/th[2]") private static WebElement premium;

	public QuoteResults(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
// Give the Quote Results information details
	public void enterQuoteResultsDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Quote Results  Page----------------------");
		/*
		 * Read the Quote Results page information from the test data excel.
		 */
		try {
				//MethodDef.dropdownValue(effectiveDateId,TestData.get("EffectiveDateId"));
				//MethodDef.dropdownValue(producer,TestData.get("Producer"));
				MethodDef.dropdownValue(allPerilsDeductible,TestData.get("Quote_AllPerilsDeductible"));
				MethodDef.dropdownValue(WindHailDeductible,TestData.get("Quote_WindHailDeductible"));
				MethodDef.dropdownValue(Hurricane,TestData.get("Quote_Hurricane"));
				TestReport.logNoScreen(LogStatus.INFO,"------------------Quote Results  Page----------------------");
				MethodDef.click(calculateButton, " calculateButton");
				CommonMethods.wait(5);
				MethodDef.click(continueButton, "Quote Results  Continue");
				CommonMethods.wait(5);
				TestReport.log(LogStatus.PASS, "Quote Results  details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter Quote Results  data " + e.getMessage());
			e.printStackTrace();
		}
	}


		
}
