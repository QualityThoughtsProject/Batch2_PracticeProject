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



public class Questionnaire extends CommonMethods{

	WebDriver driver;
	

	@FindBy(xpath="//*[@id='questionACIC1_NO']") private static WebElement quesNo1;
	@FindBy(xpath="//*[@id='questionACIC2_NO']") private static WebElement quesNo2;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[3]/td[5]/span/input") private static WebElement quesNo3;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[4]/td[5]/span/input") private static WebElement quesNo4;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[5]/td[5]/span/input") private static WebElement quesNo5;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[6]/td[5]/span/input") private static WebElement quesNo6;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[7]/td[5]/span/input") private static WebElement quesNo7;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[8]/td[5]/span/input") private static WebElement quesNo8;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[9]/td[5]/span/input") private static WebElement quesNo9;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[10]/td[5]/span/input") private static WebElement quesNo10;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[11]/td[5]/span/input") private static WebElement quesNo11;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[12]/td[5]/span/input") private static WebElement quesNo12;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[13]/td[5]/span/input") private static WebElement quesNo13;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[14]/td[5]/span/input") private static WebElement quesNo14;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[15]/td[5]/span/input") private static WebElement quesNo15;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[16]/td[5]/span/input") private static WebElement quesNo16;
	@FindBy(xpath="//*[@id='questionACIC17b_NO']") private static WebElement quesNo17;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[18]/td[5]/span/input") private static WebElement quesNo18;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[19]/td[5]/span/input") private static WebElement quesNo19;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[20]/td[5]/span/input") private static WebElement quesNo20;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[21]/td[5]/span/input") private static WebElement quesNo21;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[22]/td[4]/span/input") private static WebElement quesNo22;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[23]/td[5]/span/input") private static WebElement quesNo23;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[6]/div/div[3]/span/form/fieldset[1]/table/tbody/tr[24]/td[5]/span/input") private static WebElement quesNo24;

	@FindBy(xpath="//*[@id='QuestionnaireRemarksBox']") private static WebElement Remarks;

	
//Buttons
	
	@FindBy(xpath="//*[@id='saveAndExitButton']") private static WebElement saveAndExit;
	@FindBy(xpath="//*[@id='continueButton']") private static WebElement continueButton;
	

	public Questionnaire (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Give the Questionnaireinformation details
	public void enterQuestionnaireDetails() throws EncryptedDocumentException,
			IOException {
		TestReport.logNoScreen(LogStatus.INFO,
				"------------------Questionnaire  Page----------------------");
		/*
		 * Read the Questionnaire page information from the test data excel.
		 */
		try {
				MethodDef.click(quesNo1,TestData.get("Questionnaire_QuesNo1"));
				MethodDef.click(quesNo2,TestData.get("Questionnaire_QuesNo2"));
				MethodDef.click(quesNo3,TestData.get("Questionnaire_QuesNo3"));
				MethodDef.click(quesNo4,TestData.get("Questionnaire_QuesNo4"));
				MethodDef.click(quesNo5,TestData.get("Questionnaire_QuesNo5"));
				MethodDef.click(quesNo6,TestData.get("Questionnaire_QuesNo6"));
				MethodDef.click(quesNo7,TestData.get("Questionnaire_QuesNo7"));
				MethodDef.click(quesNo8,TestData.get("Questionnaire_QuesNo8"));
				MethodDef.click(quesNo9,TestData.get("Questionnaire_QuesNo9"));
				MethodDef.click(quesNo10,TestData.get("Questionnaire_QuesNo10"));
				MethodDef.click(quesNo11,TestData.get("Questionnaire_QuesNo11"));
				MethodDef.click(quesNo12,TestData.get("Questionnaire_QuesNo12"));
				MethodDef.click(quesNo13,TestData.get("Questionnaire_QuesNo13"));
				MethodDef.click(quesNo14,TestData.get("Questionnaire_QuesNo14"));
				MethodDef.click(quesNo15,TestData.get("Questionnaire_QuesNo15"));
				MethodDef.click(quesNo16,TestData.get("Questionnaire_QuesNo16"));
				MethodDef.click(quesNo17,TestData.get("Questionnaire_QuesNo17"));
				MethodDef.click(quesNo18,TestData.get("Questionnaire_QuesNo18"));
				MethodDef.click(quesNo19,TestData.get("Questionnaire_QuesNo19"));
				MethodDef.click(quesNo20,TestData.get("Questionnaire_QuesNo20"));
				MethodDef.click(quesNo21,TestData.get("Questionnaire_QuesNo21"));
				MethodDef.click(quesNo22,TestData.get("Questionnaire_QuesNo22"));
				MethodDef.click(quesNo23,TestData.get("Questionnaire_QuesNo23"));
				MethodDef.click(quesNo24,TestData.get("Questionnaire_QuesNo24"));
			TestReport
					.logNoScreen(LogStatus.INFO,
							"------------------Questionnaire Page----------------------");
			MethodDef
					.click(continueButton,"Questionnaire  Continue");
			CommonDef.waitForPageLoad();
			TestReport.log(LogStatus.PASS, "Questionnaire  details Entered");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL,
					"Unable to enter Questionnaire  data " + e.getMessage());
			e.printStackTrace();
		}
	}



}
