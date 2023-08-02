package com.cgi.mapfre.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesktopMainClass {
	
	static WebDriver driver;
	 public static void LaunchBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 }

	public static void main(String[] args) {
	LaunchBrowser();
		
	}
	public static WebDriver getcurrentDriver() {
		return driver;
	}
	
	public static void closeDriver() {
		closeDriver();
		
	}


}
