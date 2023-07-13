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
import com.cgi.mapfre.Auto.pom.ClientView;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.Locators;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class PropertyPolicyInfo extends CommonMethods{
	
	WebDriver driver;
	
	

	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.NameInfo.PersonName.GivenName']") private static WebElement FirstName;
	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.NameInfo.PersonName.OtherGivenName']") private static WebElement MiddleName;
	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.NameInfo.PersonName.Surname']") private static WebElement LastName;
	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].InsuredOrPrincipalInfo.PersonInfo.BirthDt']") private static WebElement DateofBirth;
	@FindBy(xpath="//*[@id='InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].GeneralPartyInfo.NameInfo.TaxIdentity[TaxIdTypeCd='SSN'].TaxId']") private static WebElement ssnNumber;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].DetailAddr.StreetNumber']") private static WebElement StreetNumber;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].DetailAddr.StreetName']") private static WebElement StreetName;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].DetailAddr.UnitNumber']") private static WebElement unitNumber;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].Addr2']") private static WebElement addressLine2;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].City']") private static WebElement City;
	@FindBy(xpath="//*[@id='SP.Location.Addr[AddrTypeCd='PhysicalRisk'].PostalCode']") private static WebElement ZipCode;
	@FindBy(xpath="//*[@id='HOGEARGR8ThanThreeYearsOnePlace']") private static WebElement MoreThan3;
	@FindBy(xpath="//*[@id='InsurerName']") private static WebElement CurrentPriorCarrierName;
	@FindBy(xpath="//*[@id='PersPolicy.ContractTerm.EffectiveDt']") private static WebElement EffectiveDt;
	@FindBy(xpath="//*[@id='monthAndYearPurchased']") private static WebElement monthAndYearPurchased;
	@FindBy(xpath="//*[@id='ACIC_AllowFinancialMeritInd']") private static WebElement OrderFinancialMerit;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;


	PropertyPolicyInfo (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	/* Click on Home Owner HO3 and land on Policy Info page */
	public void enterPolicyInfoDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Policy Info Page----------------------");
		/*
		 * Read the PropertyPolicyInfo page information from the test data
		 * excel. and click on Home HO3
		 */
		
		try {
			MethodDef.click(ClientView.ho3, "Homeowners - HO 3");
			CommonDef.waitForPageLoad();
				MethodDef.sendKeys(FirstName,TestData.get("FirstName"));
	            MethodDef.sendKeys(MiddleName,TestData.get("MiddleName"));
			    MethodDef.sendKeys(LastName,TestData.get("LastName"));
				MethodDef.sendKeys(DateofBirth,TestData.get("DOB"));
				MethodDef.sendKeys(ssnNumber,TestData.get("SSNNumber"));
				MethodDef.sendKeys(ssnNumber,TestData.get("StreetNumber"));
				MethodDef.sendKeys(StreetName,TestData.get("StreetName"));
				MethodDef.sendKeys(unitNumber,TestData.get("UnitNumber"));
				MethodDef.sendKeys(addressLine2,TestData.get("AdressLine2"));
				MethodDef.sendKeys(City,TestData.get("City"));
				MethodDef.sendKeys(ZipCode, TestData.get("ZipCode"));
				MethodDef.dropdownValue(MoreThan3,TestData.get("MoreThan3"));
			/*
			 * if(policyInfoData.containsKey("PrimaryNumber")){
			 * MethodDef.sendKeys(CreateClient.clienPrimaryPhoneNumber(),
			 * policyInfoData.get("PrimaryNumber")); }
			 * if(policyInfoData.containsKey("Email")){
			 * MethodDef.sendKeys(CreateClient.clienEmail(),
			 * policyInfoData.get("Email")); }
			 */

				MethodDef.sendKeys(EffectiveDt,TestData.get("EffectiveDate"));
				MethodDef.sendKeys(monthAndYearPurchased,TestData.get("MonthAndYearPurchased"));
				MethodDef.sendKeys(OrderFinancialMerit,TestData.get("OrderFinance"));

			TestReport.logNoScreen(LogStatus.INFO,
					"------------------Policy Info Page----------------------");
			MethodDef.click(continueButton, "Policy Info Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS, "Policy Info details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Unable to enter Policy Info data "
					+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
