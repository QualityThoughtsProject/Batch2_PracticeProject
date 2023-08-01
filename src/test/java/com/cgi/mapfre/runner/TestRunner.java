package com.cgi.mapfre.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)	
	@CucumberOptions(
			features = "FeatureFiles", 
			glue = "com.cgi.mapfre.stepdefinition",
			plugin = {"pretty","html:target/Reports"}
			//tags="@CameraaTC",
			//monochrome = true
	)


	public class TestRunner {
	
	
	}
