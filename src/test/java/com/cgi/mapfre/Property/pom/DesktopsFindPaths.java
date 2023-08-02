package com.cgi.mapfre.Property.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsFindPaths {
WebDriver driver;
	
	@FindBy(xpath="//*[text()='Desktops']") WebElement Desktopsclick;
	@FindBy(xpath="//*[text()='PC (0)']") WebElement PCTextclick;
	@FindBy(xpath="//*[text()='Continue']") WebElement Continueclick;
	@FindBy(xpath="//*[text()='Mac (1)']") WebElement MacClick;
	@FindBy(xpath="//*[text()='iMac']") WebElement iMacClick;
	@FindBy(xpath="//*[text()='Show All Desktops']") WebElement ShowAllDesktopclick;
	@FindBy(xpath="//*[@id='button-list']") WebElement ClickList;
	@FindBy(xpath="//*[@id='button-grid']")WebElement ClickGrid;
	@FindBy(xpath="//*[text()='Default']") WebElement Defaultclick;
	@FindBy(xpath="//*[text()='Name (A - Z)']")WebElement NameAtoZclick;
	@FindBy(xpath="//*[text()='Name (Z - A)']")WebElement NameZtoAclick;
	@FindBy(xpath="//*[text()='Price (Low > High)']")WebElement Lowtohighclick;
	@FindBy(xpath="//*[text()='Price (High > Low)]'")WebElement Hightolowclick;
	@FindBy(xpath="//*[text()='Rating (Highest)']")WebElement RatingHigstclick;
	@FindBy(xpath="//*[text()='Rating (Lowest)']") WebElement Ratinglowestclcik;
	@FindBy(xpath="//*[text()='Model (A - Z)']") WebElement AtoZModelclick;
	@FindBy(xpath="//*[text()='Model (Z - A)']") WebElement ZtoAModelclick;
	@FindBy(xpath="//*[text()='10']")WebElement value10click;
	@FindBy(xpath="//*[text()='25']") WebElement value25click;
	@FindBy(xpath="//*[text()='50']")WebElement value50click;
	@FindBy(xpath="//*[text()='75']")WebElement value75click;
	@FindBy(xpath="//*[text()='100']")WebElement value100click;
	@FindBy(xpath="//*[text()='Apple Cinema 30\"']") WebElement Applecinimaclick;
	@FindBy(xpath="//*[text()='Canon EOS 5D']") WebElement CanonEOS5Dclick;
	@FindBy(xpath="//*[text()='HP LP3065']") WebElement HPLP3065click;
	@FindBy(xpath="//*[text()='HTC Touch HD']")WebElement HTCTouchclick;
	@FindBy(xpath="//*[text()='iPhone']") WebElement iPhoneclick;
	@FindBy(xpath="//*[text()='iPod Classic']")WebElement iPodClassicclick;
	@FindBy(xpath="//*[text()='MacBook']") WebElement MacBookclick;
	@FindBy(xpath="//*[text()='MacBook Air']")WebElement MacBookAirclick;
	@FindBy(xpath="//*[text()='Palm Treo Pro']") WebElement PalmTreoproclick;
	@FindBy(xpath="//*[text()='Product 8']") WebElement product8click;
	@FindBy(xpath="//*[text()='Samsung SyncMaster 941BW']") WebElement SamsungSyncMasterclick;
	@FindBy(xpath="//*[text()='Sony VAIO']") WebElement SonyVaioclick;
	
	public DesktopsFindPaths(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickdesktopsOption() {
		Desktopsclick.click();
		
	}
	public void clickPCoption() {
		Desktopsclick.click();
		PCTextclick.click();
	}
		
		public void clickContinueOption() {
			Desktopsclick.click();
			PCTextclick.click();
			Continueclick.click();
		}
		
	public void clickMacOption() {
		Desktopsclick.click();
		MacClick.click();
	}
	
	public void clickiMacOption() {
		Desktopsclick.click();
		iMacClick.click();
	}
	public void clickShowAlldesktopsOption() {
		Desktopsclick.click();
		ShowAllDesktopclick.click();
	}
	
	public void clickListOption() {
		Desktopsclick.click();
		ShowAllDesktopclick.click();
		ClickList.click();
	}
	public void clickGridOption() {
		Desktopsclick.click();
		ShowAllDesktopclick.click();
		ClickGrid.click();
	}
  public void clickDefaultOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	Defaultclick.click();
}
  public void clickNameAtoZOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  NameAtoZclick.click();
  }
  public void clickNameZtoAOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  NameZtoAclick.click();
  }
  public void LowtoHeighOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  Lowtohighclick.click();
  }
  public void HightolowOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  Hightolowclick.click();
  }
  public void clickRatingHigstOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  RatingHigstclick.click();
  }
  
  public void clickLowestOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  Ratinglowestclcik.click();
  }
  
  public void clickAtoZmodelOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  AtoZModelclick.click();
	  
  }
  public void clickZtomodelAOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  ZtoAModelclick.click();
  }
  
  public void clickvalue10option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  value10click.click();
  }
  public void clickvalue25option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  value25click.click();
  }
  public void clickvalue50option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  value50click.click();
  }
  public void clickvalue75option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  value75click.click();
  }
  public void clickvalue100option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  value100click.click();
  }
  public void applecinimaoption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  Applecinimaclick.click();
  }
  public void CanonEOSoption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  CanonEOS5Dclick.click();
  }
  public void HPLP3Option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  HPLP3065click.click();
  }
  public void HTCTouchOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  HTCTouchclick.click();
  }
  public void iPhoneclick() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  iPhoneclick.click();
  }
  public void iPadClassisoption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  iPodClassicclick.click();
  }
  public void MacBookClickOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  MacBookclick.click();
  }
  public void MacbookAiroption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  MacBookAirclick.click();
  }
  public void PlamtreProOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  PalmTreoproclick.click();
  }
  public void Product8Option() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  product8click.click();
  }
  public void SamsungSyncMasterOption () {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  SamsungSyncMasterclick.click();
  }
  public void SonyVaioOption() {
	  Desktopsclick.click();
	  ShowAllDesktopclick.click();
	  SonyVaioclick.click();
  }


}
