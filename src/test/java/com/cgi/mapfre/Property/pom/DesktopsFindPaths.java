package com.cgi.mapfre.Property.pom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.DriverFactory;


public class DesktopsFindPaths {
WebDriver driver;
	
	@FindBy(xpath="//*[text()='Desktops']") WebElement desktopsClick;
	@FindBy(xpath="//*[text()='PC (0)']") WebElement pcTextClick;
	@FindBy(xpath="//*[text()='Continue']") WebElement continueClick;
	@FindBy(xpath="//*[text()='Mac (1)']") WebElement macClick;
	@FindBy(xpath="//a[text()='iMac']") WebElement iMacClick;
	@FindBy(xpath="//*[text()='Show All Desktops']") WebElement showAllDesktopClick;
	@FindBy(xpath="//*[@id='button-list']") WebElement clickList;
	@FindBy(xpath="//*[@id='button-grid']")WebElement clickGrid;
	@FindBy(xpath="//select[@id='input-sort']") private  List<WebElement> sortByDropDown;
	@FindBy(xpath="//select[@id='input-limit']") private List<WebElement> showByDropDown;
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']") WebElement appleCinimaClick;
	@FindBy(xpath="//a[text()='Canon EOS 5D']") WebElement canonEOS5Dclick;
	@FindBy(xpath="//a[text()='HP LP3065']") WebElement hpLP3065Click;
	@FindBy(xpath="//a[text()='HTC Touch HD']")WebElement htcTouchClick;
	@FindBy(xpath="//a[text()='iPhone']") WebElement iPhoneClick;
	@FindBy(xpath="//a[text()='iPod Classic']")WebElement iPodClassicClick;
	@FindBy(xpath="//a[text()='MacBook']") WebElement macBookClick;
	@FindBy(xpath="//a[text()='MacBook Air']")WebElement macBookAirClick;
	@FindBy(xpath="//a[text()='Palm Treo Pro']") WebElement palmTreoproClick;
	@FindBy(xpath="//a[text()='Product 8']") WebElement product8Click;
	@FindBy(xpath="//a[text()='Samsung SyncMaster 941BW']") WebElement samsungSyncMasterClick;
	@FindBy(xpath="//a[text()='Sony VAIO']") WebElement sonyVaioClick;
	
	public DesktopsFindPaths(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDesktopsoption() {
		desktopsClick.click();
		
		}
	
	public void clickPcoption() {
		desktopsClick.click();
		pcTextClick.click();
	}
	
	public void clickContinueoption() {
			desktopsClick.click();
			pcTextClick.click();
			continueClick.click();
			
			}
		
	   public void clickMacoption() {
		   desktopsClick.click();
		   macClick.click();
		}
	
	   
	public void clickiMacoption() {
		desktopsClick.click();
		macClick.click();
		iMacClick.click();
	}
	
	public void clickShowAlldesktopsoption() {
		desktopsClick.click();
		showAllDesktopClick.click();
		
		}
	
	public void clickListoption() {
		desktopsClick.click();
		showAllDesktopClick.click();
	    clickList.click();
	    
		}
	
	public void clickGridoption() {
		desktopsClick.click();
		showAllDesktopClick.click();
		clickGrid.click();
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
		
		
		//DesktopsFindPaths client=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		//CommonMethods.click(client.desktopsClick);
		//CommonMethods.click(client.showAllDesktopClick);
		//for(WebElement ele:client.sortByDropDown) {
			//sortOption=ele.getText();
			//System.out.println(sortOption);
		}
	//}
	
	//public void sortTheItems(String value) {
	//	CommonMethods.selectFromDropDownValue(sortByDropDown, value);
	//}
	
	//public void validateDropDown(String value) {
		//Assert.assertEquals(sortByDropDown.getText(), value);
	//}
		
	public void showTheItems() {
		String sortOption=null;
	DesktopsFindPaths client=new DesktopsFindPaths(DriverFactory.getCurrentDriver());
		CommonMethods.click(client.desktopsClick);
		CommonMethods.click(client.showAllDesktopClick);
		for(WebElement ele:client.showByDropDown) {
			sortOption=ele.getText();
			System.out.println(sortOption);
		}
		//CommonMethods.click(desktopsClick);
		//CommonMethods.click(showAllDesktopClick);
	
		
		
	}
	//public void valiDateDropDown(String value) {
		//Assert.assertEquals(showByDropDown.getText(), value);
		
//	}
 
  public void applecinimaoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  appleCinimaClick.click();
	  
	   }
  
  public void canonEOSoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  canonEOS5Dclick.click();
	  
	 }
  
  public void hpLP3option() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  hpLP3065Click.click();
	  
	    }
  
  public void htcTouchoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  htcTouchClick.click();
	  
	}
  
  public void iPhoneclick() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  iPhoneClick.click();
	  
	 }
  
  public void iPadClassisoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  iPodClassicClick.click();
	  
	 }
  
  public void macBookClickoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  macBookClick.click();
	 
  }
  
  public void macbookAiroption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  macBookAirClick.click();
	 
	 }
  
  public void plamtreProoption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  palmTreoproClick.click();
	  
  }
  
  public void product8option() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  product8Click.click();
	 
  }
  
  public void samsungSyncMasteroption () {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  samsungSyncMasterClick.click();
}
  
  public void sonyVaiooption() {
	  desktopsClick.click();
	  showAllDesktopClick.click();
	  sonyVaioClick.click();
	 
  }


	
}
  

