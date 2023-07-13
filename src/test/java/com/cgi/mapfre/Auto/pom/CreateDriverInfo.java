package com.cgi.mapfre.Auto.pom;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class CreateDriverInfo extends CommonMethods{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.GeneralPartyInfo.NameInfo.PersonName.GivenName']") private static WebElement clientFirstName;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.GeneralPartyInfo.NameInfo.PersonName.OtherGivenName']") private static WebElement clientMiddleName;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.GeneralPartyInfo.NameInfo.PersonName.Surname']") private static WebElement clientLastName;
	@FindBy(xpath="//*[@id='additionalNamedInsured']") private static WebElement clientAdditional;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.DriverInfo.PersonInfo.GenderCd']") private static WebElement clientGender;
	@FindBy(xpath="//*[@id='MaritalStatusCdWithoutHelpBubble']") private static WebElement clientMarital;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.DriverRelationshipToApplicantCd']") private static WebElement clientRelation;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.DriverInfo.PersonInfo.BirthDt']") private static WebElement clientDOB;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.LicenseStatus']") private static WebElement clientLicStatus;
	@FindBy(xpath="//*[@id='driverStateProvCd']") private static WebElement clientLicState;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.DriverTypeCd']") private static WebElement clientDriverStatus;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.DriverInfo.License.ACIC_AgeLicenseGranted']") private static WebElement clientAge;
	@FindBy(xpath="//*[@id='motorcycleSafetyCourse']") private static WebElement clientMSC;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.ACIC_DriverAdvisor']") private static WebElement clientDriveAdvisor;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.EmailAddress']") private static WebElement clientEmail;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.ACIC_DriverAdvisor_Status']") private static WebElement clientDriveAdvisorStatus;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersDriver.PersDriverInfo.ACIC_ListOnlyReason']") private static WebElement reason;
	@FindBy(xpath="//*[@id='accidentViolationInd']") private static WebElement clientVio;
	@FindBy(xpath="//a[contains(text(),'Edit')]") private static WebElement clickEdit;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[1]") private static WebElement edit1;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[2]") private static WebElement edit2;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[3]") private static WebElement edit3;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[4]") private static WebElement edit4;
	@FindBy(xpath="//input[@id='saveButton']") private static WebElement clickSaveBtn;
	@FindBy(xpath="//input[@id='continueButton2']") public static WebElement continueBtn;
	@FindBy(xpath="//input[@id='continueButton']") public static WebElement continueButton;
	@FindBy(xpath="(//input[@type='checkbox'])[4]") public static WebElement driverAssign4;
	@FindBy(xpath="(//input[@type='checkbox'])[5]") public static WebElement driverAssign5;
	@FindBy(xpath="(//input[@type='checkbox'])[2]") public static WebElement driverAssign2;
	
	public CreateDriverInfo(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


	/* Driver info Page */
	public void enterDriverDetails() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Driver Info Page----------------------");
		try{
			
			switch (TestData.get("TestCaseID")) {
			case "AutoTestCase_002":
				enterTwoDrivDetails();
				MethodDef.clickwithWait(continueBtn, "Driver Continue");
				MethodDef.click(driverAssign2, "Driver Assigned unchecked");
				MethodDef.click(driverAssign4, "Driver Assigned");
				MethodDef.click(continueButton, "Driver Continue");
				TestReport.log(LogStatus.PASS, "Driver details Entered");
				break;
			case "AutoTestCase_003":
				enterTwoDrivDetails();
				MethodDef.clickwithWait(continueBtn, "Driver Continue");
				//MethodDef.click(continueButton, "Driver Continue");
				TestReport.log(LogStatus.PASS, "Driver details Entered");
				break;
			case "AutoTestCase_004":
			enterThreeDrivDetails();
			MethodDef.clickwithWait(continueBtn, "Driver Continue");
			MethodDef.click(driverAssign2, "Driver Assigned unchecked");
			MethodDef.click(driverAssign5, "Driver Assigned");
			MethodDef.click(continueButton, "Driver Continue");
			TestReport.log(LogStatus.PASS, "Driver details Entered");
			break;
			case "AutoTestCase_005":
				enterThreeDrivDetails();
				MethodDef.clickwithWait(continueBtn, "Driver Continue");
				MethodDef.click(driverAssign2, "Driver Assigned unchecked");
				MethodDef.click(driverAssign4, "Driver Assigned");
				MethodDef.click(driverAssign5, "Driver Assigned");
				MethodDef.click(continueButton, "Driver Continue");
				TestReport.log(LogStatus.PASS, "Driver details Entered");
			break;
			default:
				enterOneDrivDetails();
				MethodDef.clickwithWait(continueBtn, "Driver Info Continue");
				TestReport.log(LogStatus.PASS, "Driver details Entered");
			}
			
			
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Vehicles details "+e.getMessage());
			e.printStackTrace();
		}
	}

	public void enterOneDrivDetails() {
		MethodDef.clickwithWait(clickEdit, "Driver info Edit");
		MethodDef.dropdownValue(clientGender, TestData.get("DriverInfo_Gender"));
		MethodDef.dropdownValue(clientMarital, TestData.get("DriverInfo_MeritalStatus"));
		MethodDef.dropdownValue(clientLicState, TestData.get("DriverInfo_LicenceState"));
		MethodDef.click(clientEmail, "");
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
	}
	
	public void enterTwoDrivDetails() {
		MethodDef.clickwithWait(edit1, "Driver info Edit1");
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
		MethodDef.clickwithWait(edit2, "Driver info Edit2");
		MethodDef.dropdownValue(clientGender, TestData.get("DriverInfo_Gender"));
		MethodDef.dropdownValue(clientMarital, TestData.get("DriverInfo_MeritalStatus"));
		MethodDef.dropdownValue(clientRelation, TestData.get("DriverInfo_RelationToInsure"));
		clientDOB.click();
		MethodDef.sendKeys(clientDOB, TestData.get("DriverInfo_DOB"));
		MethodDef.dropdownValue(clientLicState, TestData.get("DriverInfo_LicenceState"));
		MethodDef.dropdownValue(clientDriverStatus, TestData.get("DriverInfo_DriverStatus"));
		MethodDef.dropdownValue(reason, TestData.get("DriverInfo_Reason"));
		//MethodDef.click(clientEmail,"");
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
	}
	
	public void enterThreeDrivDetails() {
		MethodDef.clickwithWait(edit1, "Driver info Edit1");
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
		MethodDef.clickwithWait(edit2, "Driver info Edit2");
		MethodDef.dropdownValue(clientGender, TestData.get("DriverInfo_Gender"));
		MethodDef.dropdownValue(clientMarital, TestData.get("DriverInfo_MeritalStatus"));
		MethodDef.dropdownValue(clientRelation, TestData.get("DriverInfo_RelationToInsure"));
		clientDOB.click();
		MethodDef.sendKeys(clientDOB, TestData.get("DriverInfo_DOB"));
		MethodDef.dropdownValue(clientLicState, TestData.get("DriverInfo_LicenceState"));
		MethodDef.dropdownValue(clientDriverStatus, TestData.get("DriverInfo_DriverStatus"));
		MethodDef.dropdownValue(reason, TestData.get("DriverInfo_Reason"));
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
		MethodDef.clickwithWait(edit3, "Driver info Edit3");
		MethodDef.dropdownValue(clientGender, TestData.get("DriverInfo_Gender3"));
		MethodDef.dropdownValue(clientMarital, TestData.get("DriverInfo_MeritalStatus3"));
		MethodDef.dropdownValue(clientRelation, TestData.get("DriverInfo_RelationToInsure3"));
		clientDOB.click();
		MethodDef.sendKeys(clientDOB, TestData.get("DriverInfo_DOB3"));
		MethodDef.dropdownValue(clientLicState, TestData.get("DriverInfo_LicenceState3"));
		MethodDef.clickwithWait(clickSaveBtn, "Save Button");
	}
}