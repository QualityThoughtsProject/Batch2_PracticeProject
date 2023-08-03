package com.cgi.mapfre.framework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DesktopDriver {


	static WebDriver remoteDriver = null;
	
	public  WebDriver getRemoteDriver(String browser) {
		
		try {
			if (browser.toUpperCase().contains("FIREFOX")) {
				WebDriverManager.firefoxdriver().setup();
				remoteDriver=new FirefoxDriver();
			}
			if (browser.toUpperCase().contains("CHROME")) {
				WebDriverManager.chromedriver().setup();
				remoteDriver=new ChromeDriver();
			}
			if (browser.toUpperCase().contains("EDGE")) {
				WebDriverManager.edgedriver().setup();
				remoteDriver=new EdgeDriver();
			}
			remoteDriver.manage().deleteAllCookies();
			remoteDriver.manage().window().maximize();
			TestReport.log(LogStatus.INFO, "Browser Initiated successfully");
			remoteDriver.get(ProjectConfig.getPropertyValue("url"));
			
			remoteDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		}catch(Exception e){
			e.printStackTrace();
			TestReport.log(LogStatus.FATAL, "Browser Initiation Failed :" + e.getMessage());
		}
		/*//int trycount = 0;
		String SelHost=ProjectConfig.getPropertyValue("SelHost");
		DesiredCapabilities desiredCap = null;

		try {
			if (browser.toUpperCase().contains("FIREFOX")) {
                desiredCap = DesiredCapabilities.firefox();
                desiredCap.setCapability("marionette", true);
                desiredCap.setCapability("acceptInsecureCerts", true);
                desiredCap.setCapability("proxyType", "proxy");
			}
			if (browser.toUpperCase().contains("CHROME")) {
					System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
					System.out.println("chrome is going to started:::");
					ChromeOptions options = new ChromeOptions();
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("download.prompt_for_download", false);
					options.setExperimentalOption("prefs", prefs);
					desiredCap = DesiredCapabilities.chrome();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--start-maximized");
					options.addArguments("--disable-web-security");
					options.addArguments("--no-proxy-server");
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("credentials_enable_service", false);
					prefs.put("profile.password_manager_enabled", false);
					options.setExperimentalOption("prefs", prefs);

					
					//desiredCap.setBrowserName("chrome");
			}
			if (browser.toUpperCase().contains("IE")) {
				System.out.println("IE is going to started:::");
				desiredCap = DesiredCapabilities.internetExplorer();
				desiredCap.setBrowserName("internet explorer");
			}
			if (browser.contains("MicrosoftEdge")) {
				desiredCap = DesiredCapabilities.edge();
				desiredCap.setBrowserName("MicrosoftEdge");
				desiredCap.setCapability("acceptSslCerts", "true");
			    desiredCap.setCapability(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, true);
				System.out.println("MICROSOFTEDGE Browser Launched");
			}
			System.out.println("Host "+SelHost);
			System.out.println("Desired cap  "+desiredCap);
			remoteDriver = new RemoteWebDriver(new URL(SelHost), desiredCap);
			remoteDriver.manage().deleteAllCookies();
			remoteDriver.manage().window().maximize();
			TestReport.log(LogStatus.INFO, "Browser Initiated successfully");
			remoteDriver.get(ProjectConfig.getPropertyValue("url"));
			//remoteDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
			TestReport.log(LogStatus.FATAL, "Browser Initiation Failed :" + e.getMessage());
		}
		return remoteDriver;
	}*/
		return remoteDriver;
	}
}