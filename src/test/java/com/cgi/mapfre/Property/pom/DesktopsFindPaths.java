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
	
	public void clickDesktopsOption() {
		desktopsClick.click();
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		
	}
	public void clickPcOption() {
		desktopsClick.click();
		pcTextClick.click();
		
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		//page.selectFromDropDownValue(pcTextClick, null);
	}
	
		public void clickContinueOption() {
			desktopsClick.click();
			pcTextClick.click();
			continueClick.click();
			
			//CommonMethods page=new CommonMethods();
			//page.selectFromDropDownValue(desktopsClick, null);
			//page.selectFromDropDownValue(pcTextClick, null);
			//page.selectFromDropDownValue(continueClick, null);
			}
		
	   public void clickMacOption() {
		   desktopsClick.click();
		   pcTextClick.click();
		   macClick.click();
		   
		    //CommonMethods page=new CommonMethods();
		   //page.selectFromDropDownValue(desktopsClick, null);
		   //page.selectFromDropDownValue(pcTextClick, null);
		   //page.selectFromDropDownValue(macClick, null);
		}
	
	public void clickiMacOption() {
		desktopsClick.click();
		pcTextClick.click();
		iMacClick.click();
		
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		//page.selectFromDropDownValue(pcTextClick, null);
		//page.selectFromDropDownValue(iMacClick, null);
	}
	public void clickShowAlldesktopsOption() {
		desktopsClick.click();
		showAllDesktopClick.click();
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		//page.selectFromDropDownValue(showAllDesktopClick, null);
		}
	
	public void clickListOption() {
		desktopsClick.click();
		showAllDesktopClick.click();
		clickList.click();
		
		
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		//page.selectFromDropDownValue(showAllDesktopClick, null);
		//page.selectFromDropDownValue(clickList, null);
		}
	
	public void clickGridOption() {
		desktopsClick.click();
		showAllDesktopClick.click();
		clickGrid.click();
		
		//CommonMethods page=new CommonMethods();
		//page.selectFromDropDownValue(desktopsClick, null);
		//page.selectFromDropDownValue(showAllDesktopClick, null);
		//page.selectFromDropDownValue(clickGrid, null);
	}
	
	public void clickSortingOption(WebElement ele,String option) {
		CommonMethods page=new CommonMethods();
		page.selectFromDropDownValue(desktopsClick, option);
		page.selectFromDropDownValue(showAllDesktopClick, option);
		page.selectFromDropDownValue(nameAtoZClick, option);
		page.selectFromDropDownValue(nameZtoAClick,option);
		page.selectFromDropDownValue(lowTohighClick, option);
		page.selectFromDropDownValue(highTolowClick, option);
		page.selectFromDropDownValue(ratingHigstClick, option);
		page.selectFromDropDownValue(ratingLowestClcik, option);
		page.selectFromDropDownValue(atozModelclick, option);
		page.selectFromDropDownValue(ztoaModelclick, option);
		page.selectFromDropDownValue(value10click, option);
		page.selectFromDropDownValue(value25click, option);
		page.selectFromDropDownValue(value50click, option);
		page.selectFromDropDownValue(value75click, option);
		page.selectFromDropDownValue(value100click, option);
		}
  
 /* public void clickNameZtoAOption(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(nameZtoAClick);
	  
  }
  
  public void LowtoHeighOption(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
	    CommonDef.click(lowTohighClick);
	  
  }
  
  public void HightolowOption(String Option) {
	    CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(highTolowClick);   
  }
  public void clickRatingHigstOption(String Option) {
	    CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(ratingHigstClick);
	  
  }
  
  public void clickLowestOption(String Option) {
	    CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(ratingLowestClcik);
	 
  }
  
  public void clickAtoZmodelOption(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(atozModelclick);
	  
  }
  public void clickZtomodelAOption(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(ztoaModelclick);
	 
  }
  
  public void clickvalue10option(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(value10click);
	  
	  
  }
  public void clickvalue25option(String Option) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(value25click);
	 
  }
  public void clickvalue50option(int value) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(value50click);
	
  }
  public void clickvalue75option(int value) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(value75click);
	 
  }
  public void clickvalue100option(int value) {
	  CommonDef.click(desktopsClick);
		CommonDef.click(showAllDesktopClick);
		CommonDef.click(value100click);
	  
  }
  */
  public void applecinimaoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  appleCinimaClick.click();
	  
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(appleCinimaClick, null);
  }
  public void canonEOSoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  canonEOS5Dclick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(canonEOS5Dclick, null);
  }
  public void hpLP3Option() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  hpLP3065Click.click();
	    //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(hpLP3065Click, null);
  }
  public void htcTouchOption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  htcTouchClick.click();
	  
	  //CommonMethods page=new CommonMethods();
	   //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(htcTouchClick, null);
  }
  public void iPhoneclick() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  iPhoneClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(defaultClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(iPhoneClick, null);
  }
  public void iPadClassisoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  iPodClassicClick.click();
	  // CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(iPodClassicClick, null);
  }
  public void macBookClickOption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  macBookClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(macBookClick, null);
	 
  }
  public void macbookAiroption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  macBookAirClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(macBookAirClick, null);
	 
  }
  public void plamtreProOption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  palmTreoproClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(palmTreoproClick, null);
	
  }
  public void product8Option() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  product8Click.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(product8Click, null);
  }
  public void samsungSyncMasterOption () {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  samsungSyncMasterClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(samsungSyncMasterClick, null);
	
  }
  public void sonyVaioOption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  sonyVaioClick.click();
	  //CommonMethods page=new CommonMethods();
	  //page.selectFromDropDownValue(desktopsClick, null);
	  //page.selectFromDropDownValue(showAllDesktopClick, null);
	  //page.selectFromDropDownValue(sonyVaioClick, null);
  }


}
