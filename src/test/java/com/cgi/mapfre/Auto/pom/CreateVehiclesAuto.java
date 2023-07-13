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


public class CreateVehiclesAuto extends CommonMethods{
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.ACIC_VehSubTypeCd']") private static WebElement clientAutoType;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.VehIdentificationNumber']") private static WebElement clientVIN;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.ModelYear']") private static WebElement clientYear;
	@FindBy(xpath="//*[@id='assistedManufacturer']") private static WebElement clientMake;
	@FindBy(xpath="//*[@id='assistedModel']") private static WebElement clientModel;
	@FindBy(xpath="//*[@id='assistedVehBodyTypeCd']") private static WebElement clientBody;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.VehUseCd']") private static WebElement clientUsage;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.DistanceOneWay.NumUnits']") private static WebElement clientMiles;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.EstimatedAnnualDistance.NumUnits']") private static WebElement clientAnnualMileage;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.OdometerReading']") private static WebElement clientOdometer;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.ACIC_GarageLocInd']") private static WebElement clientGaragingAddr;
	@FindBy(xpath="//*[@id='PersAutoLineBusiness.PersVeh.ACIC_StatedValue.FormatInteger']") public static WebElement agreedVaule;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[1]") private static WebElement edit1;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[2]") private static WebElement edit2;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[3]") private static WebElement edit3;
	@FindBy(xpath="(//a[contains(text(),'Edit')])[4]") private static WebElement edit4;
	@FindBy(xpath="//input[@id='continueButton2']") private static WebElement continueBtn;
	@FindBy(xpath="//input[@id='saveButton']") private static WebElement saveBtn;
	@FindBy(xpath="//input[@id='continueButton']") private static WebElement clickContinueBtn;
	@FindBy(id="driverCheck2") private static WebElement driverCheck2;
	@FindBy(id="driverReason2") private static WebElement driverReason2;
	@FindBy(id="vehicleCheck2") private static WebElement vehicleCheck2;
	@FindBy(id="vehicleReason2") private static WebElement vehicleReason2;
	@FindBy(xpath="(//a[@title='Motorcycle'])[2]") private static WebElement motorCycle;
	
	public CreateVehiclesAuto(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Vehicle info page */
	public void entervehicleDetais() throws EncryptedDocumentException, IOException{
		TestReport.logNoScreen(LogStatus.INFO, "------------------Vehicle Info Page----------------------");
		try{
			switch (TestData.get("TestCaseID")) {
				case "AutoTestCase_002":
				case "AutoTestCase_003":
					enterTwoVehdetails();
				break;
				case "AutoTestCase_004":
					enterThreevehDetails();
					break;
				case "AutoTestCase_005":
					enterThreevehDetails();
					enterMotorCycleDetails();
					break;
				default:
					enterOneVehDetails();
				}
			
			MethodDef.click(continueBtn, "Vehicle Info Continue");
			TestReport.log(LogStatus.PASS, "Vehicle details Entered");
		}catch(Exception e){
			TestReport.log(LogStatus.FAIL,"Unable to enter Vehicles details "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void enterOneVehDetails() {
		MethodDef.click(clickContinueBtn, "Data Prefill Continue");
		clientAnnualMileage.click();
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer"));
		MethodDef.sendKeys(clientVIN,TestData.get("VehicleInfo_MotorVin"));
		MethodDef.sendKeys(agreedVaule, TestData.get("VehicleInfo_AgreedValue"));
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_motorUsage"));
		MethodDef.sendKeys(clientVIN, TestData.get("VehicleInfo_VINNumber"));
	}
	public void enterTwoVehdetails() {
		MethodDef.click(driverCheck2, "Un check driver3");
		MethodDef.dropdownValue(driverReason2, "Duplicate Driver or Incorrect Spelling");
		MethodDef.click(vehicleCheck2, "Un check Vehicle3");
		MethodDef.dropdownValue(vehicleReason2, "Insured By Other Carrier");
		MethodDef.clickwithWait(clickContinueBtn, "Data Prefill Continue");
		MethodDef.clickwithWait(edit1, "edit1");
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_Usage"));
		MethodDef.sendKeys(clientMiles, TestData.get("VehicleInfo_MilesDriven"));
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer"));
		MethodDef.clickwithWait(saveBtn, "Save Button");
		MethodDef.clickwithWait(edit2, "edit2");
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_Usage2"));
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage2"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer2"));
		MethodDef.clickwithWait(saveBtn, "Save Button");
	}
	
	public void enterThreevehDetails(){
		MethodDef.clickwithWait(clickContinueBtn, "Data Prefill Continue");
		MethodDef.clickwithWait(edit1, "edit1");
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_Usage"));
		MethodDef.sendKeys(clientMiles, TestData.get("VehicleInfo_MilesDriven"));
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer"));
		MethodDef.clickwithWait(saveBtn, "Save Button");
		MethodDef.clickwithWait(edit2, "edit2");
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_Usage2"));
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage2"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer2"));
		MethodDef.clickwithWait(saveBtn, "Save Button");
		MethodDef.clickwithWait(edit3, "edit3");
		MethodDef.dropdownValue(clientUsage, TestData.get("VehicleInfo_Usage3"));
		MethodDef.sendKeys(clientMiles, TestData.get("VehicleInfo_MilesDriven3"));
		MethodDef.sendKeys(clientAnnualMileage, TestData.get("VehicleInfo_AnnualMilage3"));
		MethodDef.sendKeys(clientOdometer, TestData.get("VehicleInfo_Odometer3"));
		MethodDef.clickwithWait(saveBtn, "Save Button");
	}
	
	public void enterMotorCycleDetails() {
		MethodDef.click(motorCycle, "MotoyCycle");
		MethodDef.sendKeys(clientVIN,TestData.get("MotorCycleInfo_VINNumber"));
		clientUsage.click();
		MethodDef.dropdownValue(clientUsage, TestData.get("MotorCycleInfo_Usage"));
		MethodDef.sendKeys(clientMiles, TestData.get("MotorCycleInfo_MilesDriven"));
	}
}
	

