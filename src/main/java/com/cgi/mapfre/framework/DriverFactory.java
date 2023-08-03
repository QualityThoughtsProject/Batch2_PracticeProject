package com.cgi.mapfre.framework;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver> currentDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getCurrentDriver() {
		WebDriver driver = currentDriver.get();
		if (driver != null) {
			return driver;
		} else {
			return null;
		}
	}

	public static void driverInit(String browser) {
		switch (browser.toUpperCase()) {
		case "FIREFOX":
			currentDriver.set(new DesktopDriver().getRemoteDriver(browser));
			break;
		case "CHROME":
			currentDriver.set(new DesktopDriver().getRemoteDriver(browser));
			break;
		case "EDGE":
			currentDriver.set(new DesktopDriver().getRemoteDriver(browser));
			break;
		default:
			//System.out.println("Unknown Driver");
		}
	}

	public static void closeDriver() {
		
		try {
			WebDriver driver = currentDriver.get();
			if (driver != null) {
				//getCurrentDriver().close();
				getCurrentDriver().quit();
			}
			currentDriver.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}