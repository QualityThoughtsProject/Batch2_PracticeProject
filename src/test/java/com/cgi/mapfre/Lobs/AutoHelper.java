package com.cgi.mapfre.Lobs;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.cgi.mapfre.Auto.pom.ApplicantInfoPage;
import com.cgi.mapfre.Auto.pom.ClientView;
import com.cgi.mapfre.Auto.pom.CoverageSelection;
import com.cgi.mapfre.Auto.pom.CreateClient;
import com.cgi.mapfre.Auto.pom.CreateDriverInfo;
import com.cgi.mapfre.Auto.pom.CreateGeneralInfo;
import com.cgi.mapfre.Auto.pom.CreatePolicyInfo;
import com.cgi.mapfre.Auto.pom.CreateVehiclesAuto;
import com.cgi.mapfre.Auto.pom.CreateVehiclesMotorCycle;
import com.cgi.mapfre.Auto.pom.InsuranceHistory;
import com.cgi.mapfre.Auto.pom.PolicySummaryPage;
import com.cgi.mapfre.Auto.pom.ReportOrder;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.DriverFactory;

public class AutoHelper {
	
	
	
	public void issuePolicy() throws IOException {
		try {
			new CreateGeneralInfo(DriverFactory.getCurrentDriver()).enterGeneralInfodetails();
			new CreatePolicyInfo(DriverFactory.getCurrentDriver()).enterPolicyInfoDetails();
			new CreateVehiclesAuto(DriverFactory.getCurrentDriver()).entervehicleDetais();
			new CreateDriverInfo(DriverFactory.getCurrentDriver()).enterDriverDetails();
			new InsuranceHistory(DriverFactory.getCurrentDriver()).enterInsuranceHistoryDetails();
			new CoverageSelection(DriverFactory.getCurrentDriver()).enterCoveragedetails();
			new ReportOrder(DriverFactory.getCurrentDriver()).enterConsumerreportDetails();
			new ApplicantInfoPage(DriverFactory.getCurrentDriver()).enterApplicantInfodetails();
			new PolicySummaryPage(DriverFactory.getCurrentDriver()).enterpolicySummaryDetails();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
	}	
		/*
		 * Scenario-2 Two Vehicles 2 Rated Drivers  
		 */
	public void issueTwoVehicles2Drivers() {
		
	}
		


	
	
	
	
	
	
//	public void verifyPDF(){
//		try{
//			TestReport.logNoScreen(LogStatus.INFO, "--------Verifying PDF-------");
//			MethodDef.click(coverageInfo.quotePDF(), "Quote PDF");
//			premium=MethodDef.getText(coverageInfo.getPremium());
//			TestReport.log(LogStatus.INFO, "Premium Value inQuote results page is "+premium);
//			CommonMethods.swapWindow(1);
//			TestReport.log(LogStatus.PASS, "Premium value in PDF and Coverages page is matched "+premium);
//			//GeneralMethods.verifyPDFContent(DriverFactory.getCurrentDriver().getCurrentUrl(), premium);
//			CommonMethods.closeAndSwapToParentWindow();
//		}catch(Exception e){
//			TestReport.log(LogStatus.FAIL, "Unable to verify premium "+e.getMessage());
//		}
//	}	
}