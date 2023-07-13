package com.cgi.mapfre.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.DriverFactory;
import com.cgi.mapfre.framework.TestReport;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

	/*Scenario scenario;
	@Before
	public void setup(Scenario scenario){
		this.scenario=scenario;
	}
		
	@After
	public void tearDown(){
		if(scenario.isFailed()){
			scenario.log(scenario.getName());
			scenario.attach(((TakesScreenshot)DriverFactory.getCurrentDriver()).getScreenshotAs(OutputType.BYTES), "", "image/png");
		}else{
			scenario.attach(((TakesScreenshot)DriverFactory.getCurrentDriver()).getScreenshotAs(OutputType.BYTES), "", "image/png");
		}
		TestReport.appendParent();
		TestReport.endParent();
		TestReport.endReport();
		DriverFactory.getCurrentDriver().quit();
		System.out.println("After");
	}*/
}
