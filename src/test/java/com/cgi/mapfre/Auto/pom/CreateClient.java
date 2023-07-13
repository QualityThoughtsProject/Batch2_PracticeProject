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


public class CreateClient {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Create New Client')]") private static WebElement createClientbtn;
	@FindBy(xpath="//*[contains(text(),'First')]//following::input[1]") private static WebElement clienFirstName;
	@FindBy(xpath="//*[contains(text(),'Middle')]//following::input[1]") private static WebElement clienMiddleName;
	@FindBy(xpath="//*[contains(text(),'Last')]//following::input[1]") private static WebElement clientLastName;
	@FindBy(xpath="//*[contains(text(),'Date of Birth')]//following::input[1]") private static WebElement dob;
	@FindBy(xpath="//*[contains(text(),'SSN')]//following::input[1]") private static WebElement clientSSN;
	@FindBy(xpath="//*[contains(text(),'Primary Phone Number')]//following::input[1]") private static WebElement clienPrimaryPhoneNumber;
	@FindBy(xpath="//*[contains(text(),'Secondary Phone Number')]//following::input[1]") private static WebElement clienSecondaryPhoneNumber;
	@FindBy(xpath="//*[contains(text(),'E-mail')]//following::input[1]") private static WebElement clienEmail;
	@FindBy(xpath="//*[contains(text(),'Street Number')]//following::input[1]") private static WebElement clienAddrStreetNumber;
	@FindBy(xpath="//*[contains(text(),'Street Name')]//following::input[1]") private static WebElement clienAddrStreetName;
	@FindBy(xpath="//*[contains(text(),'Unit Number')]//following::input[1]") private static WebElement clienAddrUnitNumber;
	@FindBy(xpath="//*[contains(text(),'Address Line 2')]//following::input[1]") private static WebElement clienAddrLine2;
	@FindBy(xpath="//*[contains(text(),'City')]//following::input[1]") private static WebElement clienAddrCity;
	@FindBy(xpath="//*[contains(text(),'State')]//following::select") private static WebElement clienAddrState;
	@FindBy(xpath="//*[contains(text(),'Zip Code')]//following::input[1]") private static WebElement clienAddrZip;
	@FindBy(xpath="//*[contains(text(),'current residence more')]//following::select[1]") private static WebElement currentresMore;
	@FindBy(xpath="(//*[contains(text(),'Address')]//following::input[1])[1]") private static WebElement address;
	@FindBy(xpath="//input[@name='NEXT']") private static WebElement clickNewclilentBtn;
	@FindBy(xpath="//input[@id='continueButton']") public static WebElement clickContinueBtn;
	
	public CreateClient(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* Creating New client */
	public void createNewClient() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Creating New Client----------------------");
		try{
			MethodDef.click(createClientbtn, "Create New Client");
			CommonMethods.wait(3);
			
			MethodDef.sendKeys(clienFirstName, TestData.get("FirstName"));
        	MethodDef.sendKeys(clienMiddleName, TestData.get("MiddleName"));
			MethodDef.sendKeys(clientLastName, TestData.get("LastName"));
			MethodDef.sendKeys(dob, TestData.get("DateOfBirth"));
			MethodDef.sendKeys(clientSSN, TestData.get("SSNNumer"));
			MethodDef.sendKeys(clienPrimaryPhoneNumber, TestData.get("PrimeNumber"));
			MethodDef.sendKeys(clienSecondaryPhoneNumber, TestData.get("SecondaryNumber"));
			MethodDef.sendKeys(clienEmail, TestData.get("MailId"));
			MethodDef.sendKeys(address, TestData.get("StreetNumber")+" "+TestData.get("StreetName"));
//			MethodDef.sendKeys(clienAddrStreetNumber, TestData.get("StreetNumber"));
//			MethodDef.sendKeys(clienAddrStreetName, TestData.get("StreetName"));
			MethodDef.sendKeys(clienAddrUnitNumber, TestData.get("UnitNumber"));
			MethodDef.sendKeys(clienAddrLine2, TestData.get("AdressLine2"));
			MethodDef.sendKeys(clienAddrCity, TestData.get("City"));
			MethodDef.dropdownValue(clienAddrState, TestData.get("State"));
			MethodDef.sendKeys(clienAddrZip, TestData.get("ZipCode"));
			MethodDef.click(clickNewclilentBtn, "New Client Submit");
			TestReport.log(LogStatus.PASS, "New Client created");
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Cleint data "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
