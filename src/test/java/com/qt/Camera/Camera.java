package com.qt.Camera;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgi.mapfre.framework.CommonDef;
import com.cgi.mapfre.framework.CommonMethods;
import com.cgi.mapfre.framework.MethodDef;
import com.cgi.mapfre.framework.TestData;

public class Camera {
		
	 WebDriver driver;
	
	@FindBy(xpath="//a[text()='Cameras']")WebElement cameraLnk;
	@FindBy(xpath="//a[text()='Canon EOS 5D']")WebElement canonLnk;
	@FindBy(xpath="//a[text()='Nikon D300']")WebElement nikonLnk;
	@FindBy(xpath="( //button[@type='submit'])[3]")WebElement canonProductCompareLnk;
	@FindBy(xpath="( //button[@type='submit'])[6]")WebElement nikonProductCompareLnk;
	@FindBy(xpath="//a[text()='Product Compare (0)']")WebElement ProductCompareLnk;
	
	@FindBy(xpath="//a[text()='Reviews (0)']")WebElement ReviewsLnk;
	@FindBy(xpath="//input[@name='name']")WebElement textnamearea1;
	@FindBy(xpath="//textarea[@name='text']")WebElement textnamearea2;
	@FindBy(xpath="(//input[@type='radio'])[4]")WebElement ratingButtonLnk;
	@FindBy(xpath="//button[text()='Continue']")WebElement continueLnk;// reviews option
	
	
	@FindBy(xpath="(//img[@alt='Nikon D300'])[2]")WebElement imageLnk;
	
	@FindBy(xpath="(//img[@class='img-thumbnail'])[2]")WebElement thumbnailLnk; //image dowen show image
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']")WebElement leftarrowkeyButtonLnk;
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")WebElement rightarrowkeyButtonLnk;// ime close
	@FindBy(xpath="//button[@title='Close (Esc)']")WebElement closeXLnk;
	
	@FindBy(xpath="//button[@id='button-cart']")WebElement addToCartLnk;// use click the number of times
	
	@FindBy(xpath="(//button[@type='button'])[2]")WebElement blackdropdownLnk; // ofter click the add to cart
	@FindBy(xpath="//*[text()='login page']") WebElement loginPageLnk;
	
	@FindBy(xpath="(//a[@href='https://demo.opencart.com/index.php?route=checkout/cart&language=en-gb'])[2]")WebElement viewCartLnk;
	
	@FindBy(xpath="//button[text()='Estimate Shipping & Taxes']")WebElement estimateShippingLnk;
	@FindBy(xpath="(//option[text()=' --- Please Select --- '])[1]")WebElement PleaseSelect1;
	
	@FindBy(xpath="(//option[text()=' --- Please Select --- '])[2]")WebElement PleaseSelect2;
	
	@FindBy(xpath="//input[@name='postcode']")WebElement postcodeLnk;
	@FindBy(xpath="//button[text()='Get Quotes']")WebElement getQuotesLnk;
	
	@FindBy(xpath="//button[text()='Use Coupon Code']")WebElement useCouponCodeLnk;
	@FindBy(xpath="//input[@name='coupon']") WebElement couponLnk;
	@FindBy(xpath="//button[text()='Apply Coupon']") WebElement applyCouponLnk;//
	
	@FindBy(xpath="//button[text()='Use Gift Certificate']")WebElement useGiftCertificateLnk;
	@FindBy(xpath="//input[@name='voucher']") WebElement voucherLnk;
	@FindBy(xpath="//button[text()='Apply Gift Certificate']") WebElement applyGiftCertificateLnk;
		
	@FindBy(xpath="(//a[@href='https://demo.opencart.com/index.php?route=checkout/checkout&language=en-gb'])[2]")WebElement checkoutLnk;
	@FindBy(xpath="//input[@type='radio']")WebElement radioLnk;
	@FindBy(xpath="//input[@name='firstname']")WebElement firstnameLnk;
	@FindBy(xpath="//input[@name='lastname']")WebElement lastnameLnk;
	@FindBy(xpath="//input[@name='email']")WebElement emailLnk;
	@FindBy(xpath="//input[@name='payment_company']")WebElement payment_companyLnk;
	@FindBy(xpath="//input[@name='payment_address_1']")WebElement payment_address_1Lnk;
	@FindBy(xpath="//input[@name='payment_address_2']")WebElement payment_address_2Lnk;
	@FindBy(xpath="//input[@name='payment_city']")WebElement payment_cityLnk;
	@FindBy(xpath="//input[@name='payment_postcode']")WebElement payment_postcodeLnk;
	@FindBy(xpath="//option[text()=' --- Please Select --- ']")WebElement payment_Country;
	//@FindBy(xpath="//option[@value='99']") WebElement Payment_indiaLnk;
	@FindBy(xpath="//select[@name='payment_zone_id']") WebElement payment_State;
	//@FindBy(xpath="//option[@value='1476']")WebElement payment_State_CodeLnk;
	@FindBy(xpath="//input[@type='password']")WebElement payment_passwordLnk;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")WebElement checkbox1Lnk;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")WebElement checkbox2Lnk;
	@FindBy(xpath="(//input[@type='checkbox'])[3]")WebElement checkbox3Lnk;
	@FindBy(xpath="//button[text()='Continue']")WebElement payment_ContinueLnk;
	
	
	
	public  Camera(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickCameraOption() {
		CommonDef.click(cameraLnk);
	}
	public void clickCanonOption() {
		CommonDef.click(cameraLnk);
		CommonDef.click(canonLnk);
		
	}
	public void clickNikonOption() {
		CommonDef.click(cameraLnk);
		CommonDef.click(nikonLnk);
		
	}
	/*
	 * public void clickCanonProductCompareOption() {
	
		CommonDef.click(cameraLnk);
		CommonDef.click(canonProductCompareLnk);
	}
	public void clickNikonProductCompareOption() {
		CommonDef.click(cameraLnk);
		CommonDef.click(nikonProductCompareLnk);
		   
	}*/
	public void clickProductCompareOption() {
		clickCameraOption();
		CommonDef.click(canonProductCompareLnk);
		CommonDef.click(nikonProductCompareLnk);
		CommonDef.click(ProductCompareLnk);
		
		
	}
	public void clickReviewsOption() {
		clickNikonOption();
		CommonDef.click(ReviewsLnk);
		
	}
	public void clicktextarea1Option() {
		clickRatingButtonOption();
		textnamearea1.click();
		MethodDef.sendKeys(textnamearea1, TestData.getData("Your Name"));
		
	}
	public void clicktextarea2Option() {
		clicktextarea1Option();
		textnamearea2.click();
		MethodDef.sendKeys(textnamearea1, TestData.getData("Your Review"));
		
	}
	public void clickRatingButtonOption() {
		clicktextarea2Option();
		CommonDef.click(ratingButtonLnk);
		
	}
	public void clickContinueOption() {
		
		clickRatingButtonOption();
		CommonDef.click(continueLnk);
		
	}
	public void clickimage() {
		CommonDef.click(imageLnk);
	}
	
	public void clickthumbnailOption() {
		clickNikonOption();
		CommonDef.click(thumbnailLnk);
		
	}
	public void clickleftarrowkeyButtonOption() {
		clickthumbnailOption();
		CommonDef.click(leftarrowkeyButtonLnk);
		
	}
	public void clickRightarrowkeyButtonOption() {
		clickthumbnailOption();
		CommonDef.click(rightarrowkeyButtonLnk);
		
	}
	public void clickPreviouCloseXOption() {
		clickleftarrowkeyButtonOption();
		CommonDef.click(closeXLnk );
		
	}
	public void clicknextCloseXOption() {
		clickRightarrowkeyButtonOption();
		CommonDef.click(closeXLnk );
		
	}
	public void clickAddToCartOption() {
		clickNikonOption();
		CommonDef.click(addToCartLnk);
	
		
	}
	public void clickBlackdropdownOption() {
		clickAddToCartOption();
		CommonDef.click(blackdropdownLnk);		
	}
	
	public void clickViewCartOption() {
		clickBlackdropdownOption();
		CommonDef.click(viewCartLnk );
	}
	public void clickloginPageOption() {
		clickViewCartOption();
		CommonDef.click(loginPageLnk);
	}
	public void clickEstimateShippingOption() {
		clickViewCartOption();
		CommonDef.click(estimateShippingLnk );
		CommonDef.click(viewCartLnk );
		PleaseSelect1.click();
		MethodDef.dropdownValue(PleaseSelect1, TestData.getData("country_id"));
		//CountryLnk.click();
		PleaseSelect2.click();
		MethodDef.dropdownValue(PleaseSelect2, TestData.getData("zone_id"));
		//StateLnk.click();
		CommonDef.click(postcodeLnk );
		CommonDef.click(getQuotesLnk );
	}
	public void clickCouponCodeOption() {
		clickViewCartOption();
		CommonDef.click(useCouponCodeLnk);
		couponLnk.click();
		MethodDef.dropdownValue(couponLnk, TestData.getData("coupon"));
		CommonDef.click(applyCouponLnk);
	}
	public void clickUseGiftCertificateOption() {
		clickViewCartOption();
		CommonDef.click(useGiftCertificateLnk );
		CommonDef.click(voucherLnk);
		CommonDef.click(applyGiftCertificateLnk);
			}

	public void clickradiobutton() {
		clickBlackdropdownOption();
		CommonDef.click(radioLnk);
	}
	public void clickCheckBoxOption() {
		clickBlackdropdownOption();
		CommonDef.click(checkbox1Lnk);
		CommonDef.click(checkbox2Lnk);
		CommonDef.click(checkbox3Lnk);
	}
	public void clickCheckoutOption() {
		clickBlackdropdownOption();
		
		CommonDef.click(checkoutLnk);
		CommonDef.click(radioLnk);
		firstnameLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("First Name"));
		lastnameLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Last Name"));
		emailLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("E-Mail"));
		payment_companyLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Company"));
		payment_address_1Lnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Address 1"));
		payment_address_2Lnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Address 2"));
		payment_cityLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("City"));
		payment_postcodeLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Post Code"));
		payment_Country.click();
		MethodDef.dropdownValue(payment_Country, TestData.getData("country_id"));
		//CommonDef.click(Payment_indiaLnk);
		payment_State.click();
		MethodDef.dropdownValue(payment_State, TestData.getData("zone_id"));
		//CommonDef.click(payment_State_CodeLnk);
		payment_passwordLnk.click();
		MethodDef.sendKeys(firstnameLnk, TestData.getData("Password"));
		CommonDef.click(checkbox1Lnk);
		CommonDef.click(checkbox2Lnk);
		CommonDef.click(checkbox3Lnk);
		CommonDef.click(payment_ContinueLnk);
		
		
			}
	
}
