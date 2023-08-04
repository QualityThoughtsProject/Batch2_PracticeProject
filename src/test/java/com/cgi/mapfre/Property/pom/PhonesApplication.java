package com.cgi.mapfre.Property.pom;

	

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	import com.cgi.mapfre.framework.CommonMethods;

	

	public class PhonesApplication {


		WebDriver driver;

		@FindBy(xpath = "//a[text()='Phones & PDAs']")WebElement phonesLnk;
		@FindBy(xpath = "//a[text()='Phones & PDAs']")WebElement phonesresult;
		
		@FindBy(xpath = "//a[text()='HTC Touch HD']")WebElement htcOption;
		@FindBy(xpath = "//a[text()='HTC']")WebElement HtcResult;
		
		@FindBy(xpath = "//a[text()='iPhone']")WebElement iPhonelnk;
		@FindBy(xpath = "//a[text()='Apple']")WebElement appleResult;
		
		@FindBy(xpath = "//a[text()='Palm Treo Pro']")WebElement Palmlnk;
		@FindBy(xpath = "//a[text()='Palm']")WebElement PalmResult;
		
		@FindBy(xpath = "//a[text()='Product Compare (0)']")WebElement ProductLnk;
		@FindBy(xpath = "//a[text()='Product Comparison']")WebElement Productresult;
		
		@FindBy(xpath = "//button[@aria-label=\"List\"]")WebElement listOption;
		@FindBy(className = "//i[@class=\'fas fa-th-list\']")WebElement listResult;
		
		@FindBy(xpath = "//button[@aria-label=\"Grid\"]")WebElement gridlnk;
		@FindBy(className = "//i[@class=\'fas fa-th\']")WebElement gridResult;
		
		@FindBy(xpath = "//button[@aria-label=\'Add to Cart\']")WebElement cartlnk;
		@FindBy(className = "//i[@class=\'fas fa-shopping-cart\']")WebElement cartResult;
		
		@FindBy(xpath = "//button[@aria-label=\'Add to Wish List\']")WebElement wishlnk;
		@FindBy(className = "//i[@class=\'fas fa-heart\']")WebElement wishResult;
		
		@FindBy(xpath = "//button[@aria-label=\'Compare this Product\']")WebElement exchangelnk;
		@FindBy(className = "//i[@class=\'fas fa-exchange-alt\']")WebElement exchangeResult;
		
		@FindBy(xpath = "//a[text()='Sort By']")WebElement sortLnk;
		@FindBy(className = "//select[@class=\'form-select\']")WebElement sortResult;
		
		@FindBy(xpath = "//select[@id='input-sort']") private WebElement DropDownlnk;
//		@FindBy(xpath = "//a[text()='Default']")WebElement defaultLnk;
		
		@FindBy(xpath = "//a[text()='Name (A - Z)']")WebElement atozLnk;
//		@FindBy(xpath = "//a[text()='Name (A - Z)']")WebElement atozresult;
		
		@FindBy(xpath = "//a[text()='Name (Z - A)']")WebElement ztoaLnk;
//		@FindBy(xpath = "//a[text()='Name (Z - A)']")WebElement ztoaresult;
		
		@FindBy(xpath = "//a[text()='Price (Low > High)']")WebElement pricelowLnk;
//		@FindBy(xpath = "//a[text()='Price (Low > High)']")WebElement pricelowresult;
		
		@FindBy(xpath = "//a[text()='Price (High > Low)']")WebElement pricehighLnk;
//		@FindBy(xpath = "//a[text()='Price (High > Low)']")WebElement pricehighresult;
		
		@FindBy(xpath = "//a[text()='Rating (Highest)']")WebElement ratinghighLnk;
//		@FindBy(xpath = "//a[text()='Rating (Highest)']")WebElement ratinghighresult;
		
		@FindBy(xpath = "//a[text()='Rating (Lowest)']")WebElement ratinglowLnk;
//		@FindBy(xpath = "//a[text()='Rating (Lowest)']")WebElement ratinglowresult;
		
		@FindBy(xpath = "//a[text()='Model (A - Z)']")WebElement modelLnk;
//		@FindBy(xpath = "//a[text()='Model (A - Z)']")WebElement modelresult;
		
		@FindBy(xpath = "//a[text()='Model (Z - A)']")WebElement modelzLnk;
//		@FindBy(xpath = "//a[text()='Model (Z - A)']")WebElement modelzresult;
		
		@FindBy(id = "//select[@id=\'input-limit\']")WebElement dropdow2nLnk;
		@FindBy(xpath = "//a[text()='Show']")WebElement showLnk;
		
		@FindBy(xpath = "//a[text()='10']")WebElement tenLnk;
//		@FindBy(xpath = "//a[text()='10']")WebElement tenresult;
		
		@FindBy(xpath = "//a[text()='25']")WebElement twentyfiveLnk;
//		@FindBy(xpath = "//a[text()='25']")WebElement twentyfiveresult;
		
		@FindBy(xpath = "//a[text()='50']")WebElement fiftyLnk;
//		@FindBy(xpath = "//a[text()='50']")WebElement fiftyresult;
		
		@FindBy(xpath = "//a[text()='75']")WebElement seventyfiveLnk;
//		@FindBy(xpath = "//a[text()='75']")WebElement seventyfiveresult;
		
		@FindBy(xpath = "//a[text()='100']")WebElement HundredLnk;
//		@FindBy(xpath = "//a[text()='100']")WebElement hundredresult;
		
		public PhonesApplication(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void clickPhonesOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Phones & PDAs")) {
				commons.clickElement(phonesLnk); 
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyPhonesResults() {
			Assert.assertEquals( phonesresult.getText(), "Phones & PDAs");
		}
		
		public void clickHtcOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("HTC Touch HD")) {
				commons.clickElement(htcOption);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyHtcResults() {
			Assert.assertEquals( HtcResult.getText(), "HTC");
		}
		
		public void clickiphoneOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("iPhone")) {
				commons.clickElement(iPhonelnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyiphoneResults() {
			Assert.assertEquals( appleResult.getText(), "Apple");
		}
		
		public void clickPlamOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Palm Treo Pro")) {
				commons.clickElement(Palmlnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyPlamResults() {
			Assert.assertEquals( PalmResult.getText(), "Palm");
		}
		
		public void clickProductOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Product Compare (0)")) {
				commons.clickElement(ProductLnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyProductResults() {
			Assert.assertEquals( Productresult.getText(), "Product Comparison");
		}
		
		public void clickListOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("List")) {
				commons.clickElement(listOption);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyListResults() {
			Assert.assertEquals( listResult.getText(), "fas fa-th-list");
		}
		
		
		public void clickGridOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Grid")) {
				commons.clickElement(gridlnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyGridResults() {
			Assert.assertEquals( gridResult.getText(), "fas fa-th");
		}
		
		public void clickcartOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Add to Cart")) {
				commons.clickElement(cartlnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifycartResults() {
			Assert.assertEquals( cartResult.getText(), "fas fa-shopping-cart");
		}
		
		public void clickwishListOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Add to Wish List")) {
				commons.clickElement(wishlnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifywishListResults() {
			Assert.assertEquals( wishResult.getText(), "fas fa-heart");
		}
		
		public void clickExchangeOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Compare this Product")) {
				commons.clickElement(exchangelnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyExchangeResults() {
			Assert.assertEquals( exchangeResult.getText(), "fas fa-exchange-alt");
		}
		
		public void clickSortOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Sort By")) {
				commons.clickElement(sortLnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifySortResults() {
			Assert.assertEquals( sortResult.getText(), "form-select");
		}
		
		public void clickDefaultOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(DropDownlnk, value);
		}
		public void verifyDefaultResults(String value) {
			Assert.assertEquals( DropDownlnk.getText(), value);
		}
		
		public void clickAtoZOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(atozLnk, value);
			}    
		
		public void verifyAtoZResults(String value) {
			Assert.assertEquals( atozLnk.getText(), value);
		}
		
		public void clickZtoAOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(ztoaLnk, value);
			   
		}
		public void verifyZtoAResults(String value) {
			Assert.assertEquals( ztoaLnk.getText(), value);
		}
		
		public void clickPriceLowOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(pricelowLnk, value);
		}
		public void verifyPriceLowResults(String value) {
			Assert.assertEquals( pricelowLnk.getText(), value);
		}
		
		public void clickPriceHighOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(pricehighLnk, value);
		}
		public void verifyPriceHighResults(String value) {
			Assert.assertEquals( pricehighLnk.getText(),value);
		}
		
		public void clickRateHighOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(ratinghighLnk, value); 
		}
		public void verifyRateHighResults(String value) {
			Assert.assertEquals( ratinghighLnk.getText(),value);
		}
		
		public void clickRateLowOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(ratinglowLnk, value); 
		}
		public void verifyRateLowResults(String value) {
			Assert.assertEquals( ratinglowLnk.getText(),value);
		}
		
		public void clickModelOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(modelLnk, value); 
		}
		public void verifyModelResults(String value) {
			Assert.assertEquals( modelLnk.getText(), value);
		}
		
		public void clickModelZOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(modelzLnk, value);  
		}
		public void verifyModelZResults(String value) {
			Assert.assertEquals( modelzLnk.getText(),value );
		}
		
		public void clickShowOption(String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("input-limit")) {
				commons.clickElement(dropdow2nLnk);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyShowResults() {
			Assert.assertEquals( showLnk.getText(), "Show");
		}
		
		public void clickTenOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(tenLnk, value);  
		}
		public void verifyTenResults(String value) {
			Assert.assertEquals( tenLnk.getText(), "10");
		}
		
		public void clickTwentyOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(twentyfiveLnk, value); 
		}
		public void verifyTwentyResults(String value) {
			Assert.assertEquals( twentyfiveLnk.getText(), "25");
		}
		
		public void clickFiftyOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(fiftyLnk, value);  
		}
		public void verifyFiftyResults(String value) {
			Assert.assertEquals( fiftyLnk.getText(), "50");
		}
		
		public void clickSeventyOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(seventyfiveLnk, value);  
		}
		public void verifySeventyResults(String value) {
			Assert.assertEquals( seventyfiveLnk.getText(), "75");
		}
		
		public void clickHundredOption(String value) {
			CommonMethods commons = new CommonMethods();
				commons.selecctValueFromDropDown(HundredLnk, value);
		}
		public void verifyHundredResults(String value) {
			Assert.assertEquals( HundredLnk.getText(), "100");
		}
	}

	

