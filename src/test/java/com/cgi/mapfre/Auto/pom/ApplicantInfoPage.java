package com.cgi.mapfre.Auto.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.Auto.pom.CoverageSelection;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;
public class ApplicantInfoPage{
	
	
	WebDriver driver;
	
	@FindBy(xpath="(//input[@value='NO'])[1]") private static WebElement quesNo1;
	@FindBy(xpath="(//input[@value='NO'])[2]") private static WebElement quesNo2;
	@FindBy(xpath="(//input[@value='NO'])[3]") private static WebElement quesNo3;
	@FindBy(xpath="(//input[@value='NO'])[4]") private static WebElement quesNo4;
	@FindBy(xpath="(//input[@value='NO'])[5]") private static WebElement quesNo5;
	@FindBy(xpath="//select[@id='drvOccupCd0']") private static WebElement occupation;
	@FindBy(xpath="//select[@id='drvOccupCd1']") private static WebElement occupation2;
	@FindBy(xpath="//select[@id='drvOccupCd2']") private static WebElement occupation3;
	@FindBy(xpath="//input[@id='drvOccupComp0']") private static WebElement nameOfCompany;
	@FindBy(xpath="//*[@id='continueButton']") public static WebElement continueButton;

	public ApplicantInfoPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Applicant Info Page */
	public void enterApplicantInfodetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Applicant Info Page----------------------");
		
		try{
			MethodDef.dropdownValue(occupation, TestData.get("ApplicantInfo_Occupation"));
			MethodDef.dropdownValue(occupation2, TestData.get("ApplicantInfo_Occupation2"));
			MethodDef.dropdownValue(occupation3, TestData.get("ApplicantInfo_Occupation3"));
			MethodDef.click(nameOfCompany, "ApplicantInfo_nameOfCompany");
			MethodDef.click(quesNo1, "Ques 1");
			MethodDef.click(quesNo2, "Ques 2");
			MethodDef.click(quesNo3, "Ques 3");
			MethodDef.click(quesNo4, "Ques 4");
			MethodDef.click(quesNo5, "Ques 5");
			MethodDef.click(continueButton, "Applicant Info Continue");
			CommonMethods.wait(5);
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Applicant info details "+e.getMessage());
			e.printStackTrace();
		}
	}
}
