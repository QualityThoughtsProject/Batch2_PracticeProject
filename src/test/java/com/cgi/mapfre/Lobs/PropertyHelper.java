package com.cgi.mapfre.Lobs;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import com.cgi.mapfre.Auto.pom.ClientView;
import com.cgi.mapfre.Property.pom.BaseCoverageCommonEndorsements;
import com.cgi.mapfre.Property.pom.OptionalEndorsements;
import com.cgi.mapfre.Property.pom.PropertyInformation;
import com.cgi.mapfre.Property.pom.QuoteResults;
import com.cgi.mapfre.Property.pom.AdditionalInterests;
import com.cgi.mapfre.Property.pom.LossReport;
import com.cgi.mapfre.Property.pom.Questionnaire;
import com.cgi.mapfre.Property.pom.ApplicationInformation;
import com.cgi.mapfre.Property.pom.PolicySummary;
import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.DriverFactory;

public class PropertyHelper {
	
	
	public void issuePropertyPolicy() throws EncryptedDocumentException, IOException {
		new ClientView(DriverFactory.getCurrentDriver()).selectLOB();
		new PropertyInformation(DriverFactory.getCurrentDriver()).enterPropertyInfoDetails();
		new BaseCoverageCommonEndorsements(DriverFactory.getCurrentDriver()).enterBaseCovComEndoDetails();
		new OptionalEndorsements(DriverFactory.getCurrentDriver()).enterOptionalEndoDetails();
		new QuoteResults(DriverFactory.getCurrentDriver()).enterQuoteResultsDetails();
		new AdditionalInterests(DriverFactory.getCurrentDriver()).clickContinueAddInterest();
		new LossReport(DriverFactory.getCurrentDriver()).clickLossReportsContinue();
		new Questionnaire(DriverFactory.getCurrentDriver()).enterQuestionnaireDetails();
		new ApplicationInformation(DriverFactory.getCurrentDriver()).enterAppInformationDetails();
		new PolicySummary(DriverFactory.getCurrentDriver()).validatePolicySummaryDetails();
	}
}
