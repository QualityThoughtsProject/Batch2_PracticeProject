package com.cgi.mapfre.stepdefinition;


import io.cucumber.java8.En;

import java.io.IOException;

import com.cgi.mapfre.framework.TestData;
import com.cgi.mapfre.Lobs.AutoHelper;
import com.cgi.mapfre.common.GeneralMethods;
import com.cgi.mapfre.framework.ProjectConfig;

public class AutoTestSteps implements En{
	
	AutoHelper help=new AutoHelper();
	TestData reader=new TestData();
	GeneralMethods gen=new GeneralMethods();
	
	public AutoTestSteps() {
		
	Given("i launch Agency portal application with valid credentials for testcase {string} in {string}", (String testcaseId, String browser) -> {
		
		try {
			reader.assignTestcaseNumber(testcaseId,browser);
			gen.loginToAgencyPortal(ProjectConfig.getPropertyValue("userName"), ProjectConfig.getPropertyValue("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	
	When("i create a new client", () -> {
		gen.createCustomer();
	});
	
	Then("i issue Auto policy with onw PPA and one  Drivers", () -> {
	   
		help.issuePolicy();
	});
	
	Then("i issue Auto policy with Two PPA and Two Rated Drivers with Twelve months Policy term", () -> {
		help.issuePolicy();
	    
	});
	
	Then("i issue Auto policy with Two Vehicle and Two Drivers, One Rated Driver and One ListOnly Driver with Twelve months Policy term", () -> {
		help.issuePolicy();
	});
	
	Then("i issue Auto policy with Three Vehicles and Three Drivers, Two Rated Drivers and One ListOnly Driver", () -> {
		help.issuePolicy();
	});
	
	Then("i issue Auto policy with Multiple Vehicles , One PPA One Motorcycle and Multiple Rated Drivers", () -> {
		help.issuePolicy();
	});
	}
}
