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
		
		@FindBy(id = "//select[@id='input-sort']")WebElement dropdownLnk;
		@FindBy(xpath = "//a[text()='Default']")WebElement defaultLnk;
		
		@FindBy(xpath = "//a[text()='Name (A - Z)']")WebElement atozLnk;
		@FindBy(xpath = "//a[text()='Name (A - Z)']")WebElement atozresult;
		
		@FindBy(xpath = "//a[text()='Name (Z - A)']")WebElement ztoaLnk;
		@FindBy(xpath = "//a[text()='Name (Z - A)']")WebElement ztoaresult;
		
		@FindBy(xpath = "//a[text()='Price (Low > High)']")WebElement pricelowLnk;
		@FindBy(xpath = "//a[text()='Price (Low > High)']")WebElement pricelowresult;
		
		@FindBy(xpath = "//a[text()='Price (High > Low)']")WebElement pricehighLnk;
		@FindBy(xpath = "//a[text()='Price (High > Low)']")WebElement pricehighresult;
		
		@FindBy(xpath = "//a[text()='Rating (Highest)']")WebElement ratinghighLnk;
		@FindBy(xpath = "//a[text()='Rating (Highest)']")WebElement ratinghighresult;
		
		@FindBy(xpath = "//a[text()='Rating (Lowest)']")WebElement ratinglowLnk;
		@FindBy(xpath = "//a[text()='Rating (Lowest)']")WebElement ratinglowresult;
		
		@FindBy(xpath = "//a[text()='Model (A - Z)']")WebElement modelLnk;
		@FindBy(xpath = "//a[text()='Model (A - Z)']")WebElement modelresult;
		
		@FindBy(xpath = "//a[text()='Model (Z - A)']")WebElement modelzLnk;
		@FindBy(xpath = "//a[text()='Model (Z - A)']")WebElement modelzresult;
		
		@FindBy(id = "//select[@id=\'input-limit\']")WebElement dropdow2nLnk;
		@FindBy(xpath = "//a[text()='Show']")WebElement showLnk;
		
		@FindBy(xpath = "//a[text()='10']")WebElement tenLnk;
		@FindBy(xpath = "//a[text()='10']")WebElement tenresult;
		
		@FindBy(xpath = "//a[text()='25']")WebElement twentyfiveLnk;
		@FindBy(xpath = "//a[text()='25']")WebElement twentyfiveresult;
		
		@FindBy(xpath = "//a[text()='50']")WebElement fiftyLnk;
		@FindBy(xpath = "//a[text()='50']")WebElement fiftyresult;
		
		@FindBy(xpath = "//a[text()='75']")WebElement seventyfiveLnk;
		@FindBy(xpath = "//a[text()='75']")WebElement seventyfiveresult;
		
		@FindBy(xpath = "//a[text()='100']")WebElement HundredLnk;
		@FindBy(xpath = "//a[text()='100']")WebElement hundredresult;
		
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
		
		public void clickDefaultOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("input-sort")) {
				commons.selecctValueFromDropDown(dropdownLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyDefaultResults() {
			Assert.assertEquals( defaultLnk.getText(), "Default");
		}
		
		public void clickAtoZOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Name (A - Z)")) {
				commons.selecctValueFromDropDown(atozLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyAtoZResults() {
			Assert.assertEquals( atozresult.getText(), "Name (A - Z)");
		}
		
		public void clickZtoAOption(String option) {
			CommonMethods commons = new CommonMethods();
				if(ztoaLnk.getText().equals(option)) {
				commons.selecctValueFromDropDown(ztoaLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyZtoAResults() {
			Assert.assertEquals( ztoaresult.getText(), "Name (Z - A)");
		}
		
		public void clickPriceLowOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Price (Low > High)")) {
				commons.selecctValueFromDropDown(pricelowLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyPriceLowResults() {
			Assert.assertEquals( pricelowresult.getText(), "Price (Low > High)");
		}
		
		public void clickPriceHighOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Price (High > Low)")) {
				commons.selecctValueFromDropDown(pricehighLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyPriceHighResults() {
			Assert.assertEquals( pricehighresult.getText(), "Price (High > Low)");
		}
		
		public void clickRateHighOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Rating (Highest)")) {
				commons.selecctValueFromDropDown(ratinghighLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyRateHighResults() {
			Assert.assertEquals( ratinghighresult.getText(), "Rating (Highest)");
		}
		
		public void clickRateLowOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Rating (Lowest)")) {
				commons.selecctValueFromDropDown(ratinglowLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyRateLowResults() {
			Assert.assertEquals( ratinglowresult.getText(), "Rating (Lowest)");
		}
		
		public void clickModelOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Model (A - Z)")) {
				commons.selecctValueFromDropDown(modelLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyModelResults() {
			Assert.assertEquals( modelresult.getText(), "Model (A - Z)");
		}
		
		public void clickModelZOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("Model (Z - A)")) {
				commons.selecctValueFromDropDown(modelzLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyModelZResults() {
			Assert.assertEquals( modelzresult.getText(), "Model (Z - A)");
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
		
		public void clickTenOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("10")) {
				commons.selecctValueFromDropDown(tenLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyTenResults() {
			Assert.assertEquals( tenresult.getText(), "10");
		}
		
		public void clickTwentyOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("25")) {
				commons.selecctValueFromDropDown(twentyfiveLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyTwentyResults() {
			Assert.assertEquals( twentyfiveresult.getText(), "25");
		}
		
		public void clickFiftyOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("50")) {
				commons.selecctValueFromDropDown(fiftyLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyFiftyResults() {
			Assert.assertEquals( fiftyresult.getText(), "50");
		}
		
		public void clickSeventyOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("75")) {
				commons.selecctValueFromDropDown(seventyfiveLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifySeventyResults() {
			Assert.assertEquals( seventyfiveresult.getText(), "75");
		}
		
		public void clickHundredOption(WebElement ele,String option) {
			CommonMethods commons = new CommonMethods();
			if (option.equals("100")) {
				commons.selecctValueFromDropDown(HundredLnk, option);
			} else {
				System.out.println("No option");
			}    
		}
		public void verifyHundredResults() {
			Assert.assertEquals( hundredresult.getText(), "100");
		}
	}

	

