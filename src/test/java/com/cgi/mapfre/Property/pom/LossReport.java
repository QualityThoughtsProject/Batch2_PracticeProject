package com.cgi.mapfre.Property.pom;

import java.io.IOException;

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

public class LossReport extends CommonMethods{

	WebDriver driver;
		

	@FindBy(xpath="//*[@id='saveAndExitButton']") private static WebElement saveAndExit;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	@FindBy(id="ACIC_LossExclusionDesc") private static WebElement lossReason;
	@FindBy(id="check0") private static WebElement loss1;
	@FindBy(id="check1") private static WebElement loss2;
	@FindBy(id="check2") private static WebElement loss3;
	@FindBy(id="check3") private static WebElement loss4;
	@FindBy(id="check4") private static WebElement loss5;
	
	public LossReport (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	
	// Click on continue button in Loss Reports page.
		public void clickLossReportsContinue() throws EncryptedDocumentException,
				IOException {
			TestReport.logNoScreen(LogStatus.INFO,
							"-----------------Loss Reports Info Page----------------------");
			try {
				switch (TestData.get("TestCaseID")) {
				case "Property_TC005":
					loss1.click();
					loss2.click();
					loss3.click();
					MethodDef.sendKeys(lossReason, TestData.get("LossReport_LossExcludeReason"));
					break;
				case "Property_TC010":
					loss1.click();
					loss3.click();
					loss4.click();
					MethodDef.sendKeys(lossReason, TestData.get("LossReport_LossExcludeReason"));
					break;
				case "Property_TC011":
					loss1.click();
					loss2.click();
					loss3.click();
					loss4.click();
					loss5.click();
					MethodDef.sendKeys(lossReason, TestData.get("LossReport_LossExcludeReason"));
					break;
				case "Property_TC013":
					loss1.click();
					MethodDef.sendKeys(lossReason, TestData.get("LossReport_LossExcludeReason"));
					break;
				case "Property_TC014":
					loss1.click();
					loss2.click();
					MethodDef.sendKeys(lossReason, TestData.get("LossReport_LossExcludeReason"));
					break;
				}
				MethodDef.click(continueButton,"Loss Reports Continue");
				CommonDef.waitForPageLoad();
				TestReport.log(LogStatus.PASS,
						"Clicked on Loss Reports continue button");
			} catch (Exception e) {
				TestReport.log(LogStatus.FAIL,"Unable to click on Loss Reports continue button "
								+ e.getMessage());
				e.printStackTrace();
			}
		}

}
