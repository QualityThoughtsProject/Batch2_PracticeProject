package com.cgi.mapfre.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)	
	@CucumberOptions(
			features = "FeatureFiles", 
			glue = "com.cgi.mapfre.stepdefinition",
			plugin = {"pretty","html:target/cucumber/Reports.html"}
			//tags="@testcase21"
			//monochrome = true
	)

	public class TestRunner {
	 
	
	}
