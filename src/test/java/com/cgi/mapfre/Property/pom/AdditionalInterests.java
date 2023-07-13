
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
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class AdditionalInterests extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='QuoteResults']/div/p/input[2]") private static WebElement saveAndExit;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	
	public AdditionalInterests (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	// Click on continue button in Additional Interests page.
	public void clickContinueAddInterest() throws EncryptedDocumentException,
			IOException {
		TestReport
				.logNoScreen(LogStatus.INFO,
						"-----------------Additional Interests Info Page----------------------");
		try {

			if(!TestData.get("FormType").contains("HO4")) {
			MethodDef.click(continueButton,	"Additional Interests Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS,"Clicked on Additional Interests continue button");
		} }catch (Exception e) {
			TestReport.log(
					LogStatus.FAIL,
					"Unable to click on Additional Interests continue button "
							+ e.getMessage());
			e.printStackTrace();
		}
	}


}
