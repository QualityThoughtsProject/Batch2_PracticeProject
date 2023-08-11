package com.cgi.mapfre.Auto.pom;


import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DriverFactory;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;

public class ClientView {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Desktops')]") public  WebElement desktopslink;
	@FindBy(xpath="//a[contains(text(),'Show All Desktops']") public  WebElement showAllDesktoplink;
	@FindBy(id="input-sort") public  List< WebElement> sortByDropDown;
	
	@FindBy(id="//a[contains(text(),'HO 4')]") private  WebElement ho4;
	@FindBy(xpath="//a[contains(text(),'HO 6')]") private  WebElement ho6;
	@FindBy(id="InsuredOrPrincipal[InsuredOrPrincipalInfo.InsuredOrPrincipalRoleCd='Insured'].InsuredOrPrincipalInfo.PersonInfo.BirthDt") private  WebElement dateOfBirth;
	@FindBy(id="monthAndYearPurchased") private  WebElement monthAndYearPurchased;
	@FindBy(id="ACIC_AllowFinancialMeritInd") private  WebElement orderFinanceMerit;
	@FindBy(id="continueButton") private  WebElement continueButton;
	
	public ClientView(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) {
		String sortOption=null;
		DriverFactory.driverInit("CHROME");
		ClientView client=new ClientView(DriverFactory.getCurrentDriver());
		CommonDef.click(client.desktopslink);
		CommonDef.click(client.showAllDesktoplink);
		for(WebElement ele:client.sortByDropDown){
			sortOption=ele.getText();
		}
		String option[]=sortOption.split("");
		System.out.println(option);
	}
	
}
