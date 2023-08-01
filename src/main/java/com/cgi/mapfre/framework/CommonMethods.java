package com.cgi.mapfre.framework;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class CommonMethods {

	protected static Logger Log = Logger.getLogger(CommonMethods.class.getName());

	public static void Explicit_Wait(WebElement element) {
		System.out.println(element);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getCurrentDriver(), Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void handlePopup() {
		Alert alert = DriverFactory.getCurrentDriver().switchTo().alert();
		alert.sendKeys("1234");

	}

	public static void sendKeys(WebElement element, String value) {
		try {
			element.click();
			wait(1);
			element.sendKeys(value);
			TestReport.logNoScreen(LogStatus.INFO, value + " Entered");
		} catch (NoSuchElementException e) {

			TestReport.log(LogStatus.FAIL, "Element not found " + e.getMessage());
		}
	}

	/*
	 * public static void clickOnElement(WebElement element, String log_commands) {
	 * try { Explicit_Wait(element); highLight(element); element.click();
	 * TestReport.logNoScreen(LogStatus.INFO, log_commands+" Clicked");
	 * 
	 * } catch (NoSuchElementException e) { TestReport.log(LogStatus.FAIL,
	 * "Unable to click Element "+e.getMessage()); } }
	 */

	/*
	 * static String getText(WebElement element, String log_commands) { try { String
	 * gettext = element.getText(); highLight(element);
	 * TestReport.logNoScreen(LogStatus.INFO, "Text Found "+gettext); return
	 * gettext; } catch (NoSuchElementException e) { TestReport.log(LogStatus.FAIL,
	 * "Unable to get text "+e.getMessage()); } return null; }
	 */
	public static void throwException(String errormessage) {
		throw new NoSuchElementException(errormessage);
	}

	public static void moveMouseToElement(WebElement ele) {
		Actions act = new Actions(DriverFactory.getCurrentDriver());
		act.moveToElement(ele).perform();
		int a;

	}

	public static void highLight(By by) {

		try {
			Actions Act = new Actions(DriverFactory.getCurrentDriver());
			Act.moveToElement((WebElement) by).build().perform();
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getCurrentDriver();
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;');", by);
			// TestReport.clipScreenShot(DriverFactory.getCurrentDriver(), screenshot_name);
		} catch (NoSuchElementException e) {
			TestReport.log(LogStatus.FAIL, "Element Not found" + e.getMessage());
		}
	}

	public static void switch_To_Window() {
		// Switch to new window opened
		for (String winHandle : DriverFactory.getCurrentDriver().getWindowHandles()) {
			DriverFactory.getCurrentDriver().switchTo().window(winHandle);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DriverFactory.getCurrentDriver().manage().window().maximize();
	}

	public static void wait(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeWindow() {
		DriverFactory.getCurrentDriver().close();
	}

	public static void switch_To_Frame(int index, String variable_type, String stringtypexpath) {
		if (variable_type.equalsIgnoreCase("int")) {
			DriverFactory.getCurrentDriver().switchTo().frame(index);
		} else {
			DriverFactory.getCurrentDriver().switchTo().frame(stringtypexpath);
		}
	}

	static Set<String> getWindowsCount() {
		Set<String> allWindows = DriverFactory.getCurrentDriver().getWindowHandles();
		return allWindows;
	}

	public static void swapWindow(int i) {
		Set openWindows = getWindowsCount();
		String switchWindow = (String) openWindows.toArray()[i];
		DriverFactory.getCurrentDriver().switchTo().window(switchWindow);
	}

	public static void closeAndSwapToParentWindow() {
		int windows_count = getWindowsCount().size();
		for (int currentwindow = windows_count; currentwindow >= 2; --currentwindow) {
			DriverFactory.getCurrentDriver().close();
			swapWindow(currentwindow - 2);
		}

	}

	public static void selectFromDropDownValue(WebElement ele, String value) {
		try {
			ele.click();
			wait(1);
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
			TestReport.logNoScreen(LogStatus.INFO, value + " selected to dropdown");
		} catch (Exception e) {
			TestReport.log(LogStatus.FAIL, "Unable to select " + value + " " + e.getMessage());
		}
	}

	public static String captureScreen() {
		String path;
		File trgtPath = null;
		try {
			File source = ((TakesScreenshot) DriverFactory.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
			path = TestReport.reportPath;
			// System.out.println(path);
			trgtPath = new File(path);

			FileUtils.copyFileToDirectory(source, trgtPath);
			return source.getName();// trgtPath.getAbsolutePath();
		} catch (Exception e) {
			return "";
		}
	}

	/* Verifies PDF content */

	public void veriffPdfContent() throws MalformedURLException, IOException {
		BufferedInputStream pdfUrl = new BufferedInputStream(
				new URL(DriverFactory.getCurrentDriver().getCurrentUrl()).openStream());
		PDFParser readPdf = new PDFParser((RandomAccessRead) pdfUrl);
		readPdf.parse();
		String TestText = new PDFTextStripper().getText(readPdf.getPDDocument());

	}
	
	public void clickElement(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void selecctValueFromDropDown(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
