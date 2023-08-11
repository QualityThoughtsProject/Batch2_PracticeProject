package com.cgi.mapfre.Property.pom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DriverFactory;
import com.cgi.mapfre.framework.TestReport;
import com.relevantcodes.extentreports.LogStatus;


public class DesktopsFindPaths {
WebDriver driver;
	
	@FindBy(xpath="//*[text()='Desktops']") WebElement desktopsLink;
	@FindBy(xpath="//*[text()='PC (0)']") WebElement pcLink;
	@FindBy(xpath="//div[@id='content']") WebElement contentlink;
	@FindBy(xpath="//*[text()='Continue']") WebElement continueLink;
	@FindBy(xpath="//*[text()='Mac (1)']") WebElement macLink;
	@FindBy(xpath="//a[text()='iMac']") WebElement iMacLink;
	@FindBy(xpath="(//*[text()='iMac'])[3]") WebElement imacTextlink;
	@FindBy(xpath="//*[text()='Add to Cart']")WebElement addcartlink;
	@FindBy(xpath="//*[text()='Show All Desktops']") WebElement showAllDesktopLink;
	@FindBy(xpath="//a[text()='Desktops (13)']") WebElement desktopCount;
	@FindBy(xpath="//*[@id='product-list']")  private List<WebElement> productListLink;
	@FindBy(xpath="//select[@id='input-sort']") private  List<WebElement> sortByDropDown;
	@FindBy(xpath="//select[@id='input-limit']") private List<WebElement> showByDropDown;
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']") WebElement appleCinimaLink;
	@FindBy(xpath="//a[text()='Canon EOS 5D']") WebElement canonEOS5DLink;
	@FindBy(xpath="//a[text()='HP LP3065']") WebElement hpLP3065Link;
	@FindBy(xpath="//a[text()='HTC Touch HD']")WebElement htcTouchLink;
	@FindBy(xpath="//a[text()='iPhone']") WebElement iPhoneLink;
	@FindBy(xpath="//a[text()='iPod Classic']")WebElement iPodClassicLink;
	@FindBy(xpath="//a[text()='MacBook']") WebElement macBookLink;
	@FindBy(xpath="//a[text()='MacBook Air']")WebElement macBookAirLink;
	@FindBy(xpath="//a[text()='Palm Treo Pro']") WebElement palmTreoproLink;
	@FindBy(xpath="//a[text()='Product 8']") WebElement product8Link;
	@FindBy(xpath="//a[text()='Samsung SyncMaster 941BW']") WebElement samsungSyncMasterLink;
	@FindBy(xpath="//a[text()='Sony VAIO']") WebElement sonyVaioLink; 
	
	public DesktopsFindPaths(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDesktopsoption(String Option) {
		switch(Option) {
		case"PC":
			CommonMethods.click(pcLink);
			break;
		case"MAC":
			CommonMethods.click(macLink);
			break;
		case"Show All":
			CommonMethods.click(showAllDesktopLink);
			break;
			default:
				TestReport.log(LogStatus.INFO,"No Option clicked" );
			break;
		}
	}
	
	public void validateDesktopcount() {
		String count=CommonDef.getText(desktopCount);
		int desktopCount=Integer.valueOf(count);
		if(desktopCount>0) {
			TestReport.log(LogStatus.PASS,  "The count of the Desktop is " +desktopCount);
				
		}else{
			 Assert.fail();
			 TestReport.log(LogStatus.FAIL,  "The count of the Desktop is " +desktopCount);{
				
			}
		}
			}
	
	
	public void addProductToCart(String Option) {
		switch(Option) {
		case"PC":
			String s=contentlink.getText();
			  if(s.equals("There are no products to list in this category.")) {
				  TestReport.log(LogStatus.PASS, s);
			  }else {
				  TestReport.log(LogStatus.FAIL, s);
			  }
				  break;
				  case "MAC":
				  CommonMethods.click(iMacLink);
				  String imac=imacTextlink.getText();
				  if(imac.equals("iMac")) {
					  TestReport.log(LogStatus.PASS, imac);
				  }else {
					  TestReport.log(LogStatus.FAIL, imac);
				  }
				  CommonMethods.click(addcartlink);
				  break;
				  case "Show All":
					  CommonMethods.click(showAllDesktopLink);
					  String showall=appleCinimaLink.getText();
					  if(showall.equals(" This product has a minimum quantity of 2")) {
						  TestReport.log(LogStatus.PASS, showall);
					  }else {
						  TestReport.log(LogStatus.FAIL, showall);
					  }
					  CommonMethods.click(desktopCount);
					  break;
			  }
		
		}
	public void addiMacProduct() {
		Assert.assertEquals(imacTextlink.getText(), "iMac");
	}
	
	public void sortTheItems() {
		String sortOption[]= {"Default","Name (A - Z)","Name (Z - A)","Price (Low > High)","Price (High > Low)","Rating (Highest)","Rating (Lowest)","Model (A - Z)","Model (Z - A)"};
		
		WebElement dropDown = driver.findElement(By.id("input-sort"));
		Select sel=new Select(dropDown);
		List<WebElement> options = sel.getOptions();
		for(int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText()+" ->"+sortOption[i]);
			Assert.assertEquals(options.get(i).getText(), sortOption);
		}
		}
			
	public void showTheItems() {
		String sortOption=null;
	DesktopsFindPaths client=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		CommonMethods.click(client.desktopsLink);
		CommonMethods.click(client.showAllDesktopLink);
		for(WebElement ele:client.showByDropDown) {
			sortOption=ele.getText();
			System.out.println(sortOption);
		}
	}
	
	public void selectProduct(String Option) {
		DriverFactory.getCurrentDriver().findElement(By.xpath("//a[text()='"+Option+"']")).click();
	}
	
	public void verifyTheProducts() {
		Assert.assertEquals(appleCinimaLink.getText(), "Product 15");
	}
	
	}
  

