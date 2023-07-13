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

import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class LossHistory extends CommonMethods{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	
	LossHistory (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Click on continue button in loss history page.
	public void clickLossHistoryContinue() throws EncryptedDocumentException,
			IOException {
		TestReport
				.logNoScreen(LogStatus.INFO,
						"-----------------Loss History Info Page----------------------");
		try {

			MethodDef.click(continueButton,"Loss History Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS,"Clicked on Loss History continue button");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,"Unable to click on loss history continue button "
							+ e.getMessage());
			e.printStackTrace();
		}
	}



}
