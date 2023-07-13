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

public class CreateGeneralInfo {

	WebDriver driver;

	@FindBy(xpath = "//*[contains(text(),'First Name')]//following::input[1]") private static WebElement clientFirstName;
	@FindBy(xpath = "//*[contains(text(),'Middle Name')]//following::input[1]") private static WebElement clientMiddleName;
	@FindBy(xpath = "//*[contains(text(),'Last Name')]//following::input[1]") private static WebElement clientLastName;
	@FindBy(xpath = "//*[contains(text(),'Date of Birth')]//following::input[1]") private static WebElement clientDOB;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.NameInfo.TaxIdentity[TaxIdTypeCd='SSN'].TaxId']")
	private static WebElement clientSSN;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].DetailAddr.StreetNumber']")
	private static WebElement clientAddrStreetNumber;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].DetailAddr.StreetName']")
	private static WebElement clientAddrStreetName;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].DetailAddr.UnitNumber']")
	private static WebElement clientAddrUnitNumber;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].Addr2']")
	private static WebElement clientAddrLine2;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].City']")
	private static WebElement clientAddrCity;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].StateProvCd']")
	private static WebElement clientAddrState;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Addr[AddrTypeCd='StreetAddress'].PostalCode']")
	private static WebElement clientAddrZip;
	@FindBy(xpath = "//*[@id='PersPolicy.PersApplicationInfo.LengthTimeCurrentAddr.ContinuousInd']")
	private static WebElement clientAddrMorethan3Years;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Communications.PhoneInfo[PhoneTypeCd='Phone' && CommunicationUseCd='Home'].PhoneNumber']")
	private static WebElement clientPrimaryPhoneNumber;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Communications.PhoneInfo[PhoneTypeCd='Phone' && CommunicationUseCd='Business'].PhoneNumber']")
	private static WebElement clientSecondaryPhoneNumber;
	@FindBy(xpath = "//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.Communications.EmailInfo.EmailAddr']")
	private static WebElement clientEmail;
	@FindBy(xpath = "//*[@id='ACIC_AllowFinancialMeritInd']")
	private static WebElement clienFinancialMerit;
	@FindBy(xpath = "//*[@id='PersPolicy.ContractTerm.EffectiveDt']")
	private static WebElement clienEffectiveDate;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Private Passenger Vehicle')]")
	private static WebElement selectPPA;

	public CreateGeneralInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* General Info page */
	public void enterGeneralInfodetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO, "------------------General Info Page----------------------");
		try {
			MethodDef.click(selectPPA, "Private Passenger");
			CommonMethods.wait(2);
			MethodDef.sendKeys(clientDOB, TestData.get("GeneranInfo_DOB"));
			MethodDef.click(CreateClient.clickContinueBtn,"General Info Continue");
			CommonMethods.wait(2);
			TestReport.log(LogStatus.PASS, "General Info details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Unable to enter General Info data "+ e.getMessage());
			e.printStackTrace();
		}
	}

}
