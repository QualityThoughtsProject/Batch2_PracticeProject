package com.cgi.mapfre.Property.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonMethods;


public class DesktopsFindPaths {
WebDriver driver;
	
	@FindBy(xpath="//*[text()='Desktops']") WebElement desktopsClick;
	@FindBy(xpath="//*[text()='PC (0)']") WebElement pcTextClick;
	@FindBy(xpath="//*[text()='Continue']") WebElement continueClick;
	@FindBy(xpath="//*[text()='Mac (1)']") WebElement macClick;
	@FindBy(xpath="//*[text()='iMac']") WebElement iMacClick;
	@FindBy(xpath="//*[text()='Show All Desktops']") WebElement showAllDesktopClick;
	@FindBy(xpath="//*[@id='button-list']") WebElement clickList;
	@FindBy(xpath="//*[@id='button-grid']")WebElement clickGrid;
	@FindBy(xpath="//*[text()='Default']") WebElement defaultClick;
	@FindBy(xpath="//*[text()='Name (A - Z)']")WebElement nameAtoZClick;
	@FindBy(xpath="//*[text()='Name (Z - A)']")WebElement nameZtoAClick;
	@FindBy(xpath="//*[text()='Price (Low > High)']")WebElement lowTohighClick;
	@FindBy(xpath="//*[text()='Price (High > Low)]'")WebElement highTolowClick;
	@FindBy(xpath="//*[text()='Rating (Highest)']")WebElement ratingHigstClick;
	@FindBy(xpath="//*[text()='Rating (Lowest)']") WebElement ratingLowestClcik;
	@FindBy(xpath="//*[text()='Model (A - Z)']") WebElement atozModelclick;
	@FindBy(xpath="//*[text()='Model (Z - A)']") WebElement ztoaModelclick;
	@FindBy(xpath="//*[text()='10']")WebElement value10click;
	@FindBy(xpath="//*[text()='25']") WebElement value25click;
	@FindBy(xpath="//*[text()='50']")WebElement value50click;
	@FindBy(xpath="//*[text()='75']")WebElement value75click;
	@FindBy(xpath="//*[text()='100']")WebElement value100click;
	@FindBy(xpath="//*[text()='Apple Cinema 30\"']") WebElement appleCinimaClick;
	@FindBy(xpath="//*[text()='Canon EOS 5D']") WebElement canonEOS5Dclick;
	@FindBy(xpath="//*[text()='HP LP3065']") WebElement hpLP3065Click;
	@FindBy(xpath="//*[text()='HTC Touch HD']")WebElement htcTouchClick;
	@FindBy(xpath="//*[text()='iPhone']") WebElement iPhoneClick;
	@FindBy(xpath="//*[text()='iPod Classic']")WebElement iPodClassicClick;
	@FindBy(xpath="//*[text()='MacBook']") WebElement macBookClick;
	@FindBy(xpath="//*[text()='MacBook Air']")WebElement macBookAirClick;
	@FindBy(xpath="//*[text()='Palm Treo Pro']") WebElement palmTreoproClick;
	@FindBy(xpath="//*[text()='Product 8']") WebElement product8Click;
	@FindBy(xpath="//*[text()='Samsung SyncMaster 941BW']") WebElement samsungSyncMasterClick;
	@FindBy(xpath="//*[text()='Sony VAIO']") WebElement sonyVaioClick;
	
	public DesktopsFindPaths(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickdesktopsOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		
	}
	public void clickPCoption() {
		CommonMethods page=new CommonMethods();
		page.element(pcTextClick);
		
	}
		
		public void clickContinueOption() {
			CommonMethods page=new CommonMethods();
			page.element(desktopsClick);
			page.element(pcTextClick);
			page.element(continueClick);
			
		}
		
	public void clickMacOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(macClick);
	}
	
	public void clickiMacOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(iMacClick);
		
	}
	public void clickShowAlldesktopsOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(showAllDesktopClick);
		
	}
	
	public void clickListOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(clickList);
		
	}
	public void clickGridOption() {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(clickGrid);
	}
	
	public void clickOption(String Option) {
		CommonMethods page=new CommonMethods();
		page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(nameAtoZClick);
		}
  
  public void clickNameZtoAOption(String Option) {
	  CommonMethods page=new CommonMethods();
	    page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(nameZtoAClick);
	  
  }
  public void LowtoHeighOption(String Option) {
	  CommonMethods page=new CommonMethods();
	    page.element(desktopsClick);
		page.element(showAllDesktopClick);
	    page.element(lowTohighClick);
	  
  }
  public void HightolowOption(String Option) {
	   CommonMethods page=new CommonMethods();
	    page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(highTolowClick);   
  }
  public void clickRatingHigstOption(String Option) {
	  
	  CommonMethods page=new CommonMethods();
	    page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(ratingHigstClick);
	  
  }
  
  public void clickLowestOption(String Option) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(ratingLowestClcik);
	 
  }
  
  public void clickAtoZmodelOption(String Option) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(atozModelclick);
	  
  }
  public void clickZtomodelAOption(String Option) {
	   CommonMethods page=new CommonMethods();
	   page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(ztoaModelclick);
	 
  }
  
  public void clickvalue10option(int value) {
	  CommonMethods page=new CommonMethods();
	   page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(value10click);
	  
	  
  }
  public void clickvalue25option(int value) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(value25click);
	 
  }
  public void clickvalue50option(int value) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(value50click);
	
  }
  public void clickvalue75option(int value) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(value75click);
	 
  }
  public void clickvalue100option(int value) {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(value100click);
	  
  }
  public void applecinimaoption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(appleCinimaClick);
  }
  public void CanonEOSoption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(canonEOS5Dclick);
  }
  public void HPLP3Option() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(hpLP3065Click);
  }
  public void HTCTouchOption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(htcTouchClick);
	 
  }
  public void iPhoneclick() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(iPhoneClick);
	 
  }
  public void iPadClassisoption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(iPodClassicClick);
	  
  }
  public void MacBookClickOption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(macBookClick);
	 
  }
  public void MacbookAiroption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(macBookAirClick);
	  
	 
  }
  public void PlamtreProOption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(palmTreoproClick);
	 
  }
  public void Product8Option() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(product8Click);
	 
  }
  public void SamsungSyncMasterOption () {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(samsungSyncMasterClick);
	
  }
  public void SonyVaioOption() {
	  CommonMethods page=new CommonMethods();
	  page.element(desktopsClick);
		page.element(showAllDesktopClick);
		page.element(sonyVaioClick);
	 
  }


}
