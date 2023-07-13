package com.cgi.mapfre.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DesktopDriver;
import com.cgi.mapfre.framework.TestReport;


public class Hooks {
	CommonMethods common=new CommonMethods();

//	Scenario scenario;
//	@Before
//	public void setup(Scenario scenario){
//		this.scenario=scenario;
//	}
//	
//	@After
//	public void endResults(){
//		if(scenario.isFailed()){
//			scenario.log(scenario.getName());
//			scenario.attach(((TakesScreenshot)DesktopDriver.remoteDriver).getScreenshotAs(OutputType.BYTES), "", "image/png");
//		}else{
//			scenario.attach(((TakesScreenshot)DesktopDriver.remoteDriver).getScreenshotAs(OutputType.BYTES), "", "image/png");
//		}
//		TestReport.appendParent();
//		TestReport.endParent();
//		TestReport.endReport();
//		DesktopDriver.remoteDriver.quit();
//	}
}
